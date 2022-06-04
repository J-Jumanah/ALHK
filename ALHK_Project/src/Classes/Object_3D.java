/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 * Imports.
 */
import Interfaces.Activate;
import java.applet.*;
import java.awt.*;
import javax.media.j3d.*;
import javax.vecmath.*;
import com.sun.j3d.utils.universe.SimpleUniverse;
import com.sun.j3d.loaders.Scene;
import com.sun.j3d.loaders.objectfile.ObjectFile;
import java.io.*;
import java.awt.event.*;

/**
 *
 * @author Hp
 */
//The Applet class is used as a base class to make it easy to write a Java 3D program that runs in a window.
public class Object_3D extends Applet {

    private SimpleUniverse universe = null;
    private Canvas3D canvas = null;
    private TransformGroup TransformGroup1 = null;
    private TransformGroup TransformGroup2 = null;
    private TransformGroup TransformGroup3 = null;
    private TransformGroup TransformGroup4 = null;
    private Transform3D Transform3D1 = null;
    private Transform3D Transform3D2 = null;
    private Transform3D Transform3D3 = null;
    private Transform3D Transform3D4 = null;
    private Transform3D Transform3Dstep = new Transform3D();
    public static String url = "";

    public Object_3D() {
        setLayout(new BorderLayout());
        GraphicsConfiguration config = SimpleUniverse.getPreferredConfiguration();
        //provides an image in a window on your computer display,
        canvas = new Canvas3D(config);
        add("Center", canvas);
        //Construct as simple universe with a reference to the named Canvas3D object.
        universe = new SimpleUniverse(canvas);

        //A BranchGroup is a node in a Tree data structure that can have child nodes
        BranchGroup Bgscene = new BranchGroup();
        //look at the objects
        universe.getViewingPlatform().setNominalViewingTransform();

        Bgscene.addChild(createObject());
        //add the group of objects to  universe
        universe.addBranchGraph(Bgscene);

    }

    private BranchGroup createObject() {
        BranchGroup Branchobj = new BranchGroup();
        
        // Transform Group objects are holders of transformations in the scene graph.
        TransformGroup1 = new TransformGroup();
        TransformGroup2 = new TransformGroup();
        TransformGroup3 = new TransformGroup();
        TransformGroup4 = new TransformGroup();

        //Transform3D object to perform the transformations we desire such as translation and rotation
        Transform3D1 = new Transform3D();
        Transform3D2 = new Transform3D();
        Transform3D3 = new Transform3D();
        Transform3D4 = new Transform3D();

        // enable the TRANSFORM_WRITE capability so that our behavior code can modify it at runtime.
        TransformGroup1.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
        TransformGroup2.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
        TransformGroup3.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
        TransformGroup4.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);

        //define the default position of each object in the scene
        //The transform held in a Transform3D object is copied to a TransformGroup object by using the setTransform() method.
        //Down
        Transform3D1.setTranslation(new Vector3d(-0.15, -0.9, -5.0));
        //top 
        Transform3D2.setTranslation(new Vector3d(0.0, 0.9, -5.0));
        //left
        Transform3D3.setTranslation(new Vector3d(-1.9, 0.2, -5.0));
        //right
        Transform3D4.setTranslation(new Vector3d(1.9, 0.2, -5.0));

        //define the default rotation angle of each object in the scene
        Transform3D1.setRotation(new AxisAngle4f(0.0f, 0.0f, 0.0f, 0.0f));
        Transform3D2.setRotation(new AxisAngle4f(0.0f, 0.0f, 0.0f, 0.0f));
        Transform3D3.setRotation(new AxisAngle4f(0.0f, 0.0f, 0.0f, 0.0f));
        Transform3D4.setRotation(new AxisAngle4f(0.0f, 0.0f, 0.0f, 0.0f));

        //define the default scale of each object in the scene
        Transform3D1.setScale(0.2);
        Transform3D2.setScale(0.2);
        Transform3D3.setScale(0.2);
        Transform3D4.setScale(0.2);

        //set the Transformation
        TransformGroup1.setTransform(Transform3D1);
        TransformGroup2.setTransform(Transform3D2);
        TransformGroup3.setTransform(Transform3D3);
        TransformGroup4.setTransform(Transform3D4);

        //to load the object from the file to the project
        ObjectFile loader = new ObjectFile(ObjectFile.RESIZE);
        Scene s = null;
        Scene s2 = null;
        Scene s3 = null;
        Scene s4 = null;

        File file = new java.io.File(url);

        try {
            s = loader.load(file.getPath());
            s2 = loader.load(file.getPath());
            s3 = loader.load(file.getPath());
            s4 = loader.load(file.getPath());
        } catch (Exception e) {
            System.err.println(e);
            System.exit(1);
        }

        //add the SceneGroup into TransformGroup
        TransformGroup1.addChild(s.getSceneGroup());
        TransformGroup2.addChild(s2.getSceneGroup());
        TransformGroup3.addChild(s3.getSceneGroup());
        TransformGroup4.addChild(s4.getSceneGroup());

        //add TransformGroup objects into BranchGroup
        Branchobj.addChild(TransformGroup1);
        Branchobj.addChild(TransformGroup2);
        Branchobj.addChild(TransformGroup3);
        Branchobj.addChild(TransformGroup4);

        Branchobj.addChild(createLight());

        return Branchobj;

    }

    private Light createLight() {
        //set the color and the direction of the light
        DirectionalLight light = new DirectionalLight(true, new Color3f(1.0f, 1.0f, 1.0f),
                new Vector3f(-0.7f, 0.0f, -1.0f));
        //define the position and the distance that the light shines within our scene.
        //anythings outside the Influence will not receive light
        light.setInfluencingBounds(new BoundingSphere(new Point3d(), 100));

        return light;
    }

    public void moveObject(String e) {

        if (e == "left") {
            //Rotate to left 
            Transform3Dstep.rotY(Math.PI / 32);
            TransformGroup1.getTransform(Transform3D1);
            TransformGroup2.getTransform(Transform3D2);
            TransformGroup3.getTransform(Transform3D3);
            TransformGroup4.getTransform(Transform3D4);

            Transform3D1.mul(Transform3Dstep);
            Transform3D2.mul(Transform3Dstep);
            Transform3D3.mul(Transform3Dstep);
            Transform3D4.mul(Transform3Dstep);

            //set the Transformation
            TransformGroup1.setTransform(Transform3D1);
            TransformGroup2.setTransform(Transform3D2);
            TransformGroup3.setTransform(Transform3D3);
            TransformGroup4.setTransform(Transform3D4);

        }
        if (e == "right") {
            //Rotate to right 
            Transform3Dstep.rotY(-Math.PI / 32);
            TransformGroup1.getTransform(Transform3D1);
            TransformGroup2.getTransform(Transform3D2);
            TransformGroup3.getTransform(Transform3D3);
            TransformGroup4.getTransform(Transform3D4);

            Transform3D1.mul(Transform3Dstep);
            Transform3D2.mul(Transform3Dstep);
            Transform3D3.mul(Transform3Dstep);
            Transform3D4.mul(Transform3Dstep);

            //set the Transformation
            TransformGroup1.setTransform(Transform3D1);
            TransformGroup2.setTransform(Transform3D2);
            TransformGroup3.setTransform(Transform3D3);
            TransformGroup4.setTransform(Transform3D4);

        }

        if (e == "in") {
            //Zoom in
            //the maximam value to zoom in is 0.38
            if (Transform3D1.getScale() <= 0.3897434200000002) {
                //to scale up the object will multiply the previous scale value with 1.1
                Transform3Dstep.setScale(1.1);
                //To avoid rotating the object while zooming in
                Transform3D1.setRotation(new AxisAngle4f(0.0f, 0.0f, 0.0f, 0.0f));
                Transform3D2.setRotation(new AxisAngle4f(0.0f, 0.0f, 0.0f, 0.0f));
                Transform3D3.setRotation(new AxisAngle4f(0.0f, 0.0f, 0.0f, 0.0f));
                Transform3D4.setRotation(new AxisAngle4f(0.0f, 0.0f, 0.0f, 0.0f));

                //Multiplies each element of this transform by a scalar value "1.1".
                Transform3D1.mul(Transform3Dstep);
                Transform3D2.mul(Transform3Dstep);
                Transform3D3.mul(Transform3Dstep);
                Transform3D4.mul(Transform3Dstep);

                //set the Transformation
                TransformGroup1.setTransform(Transform3D1);
                TransformGroup2.setTransform(Transform3D2);
                TransformGroup3.setTransform(Transform3D3);
                TransformGroup4.setTransform(Transform3D4);

            }
        }

        if (e == "out") {
            //Zoom out
            //the minimam value to zoom out is 0.22
            if (Transform3D1.getScale() >= 0.22) {
                //to scale down the object will multiply the previous scale value with 0.9
                Transform3Dstep.setScale(0.9);
                //To avoid rotating the object while zooming out
                Transform3D1.setRotation(new AxisAngle4f(0.0f, 0.0f, 0.0f, 0.0f));
                Transform3D2.setRotation(new AxisAngle4f(0.0f, 0.0f, 0.0f, 0.0f));
                Transform3D3.setRotation(new AxisAngle4f(0.0f, 0.0f, 0.0f, 0.0f));
                Transform3D4.setRotation(new AxisAngle4f(0.0f, 0.0f, 0.0f, 0.0f));

                //Multiplies each element of this transform by a scalar value "0.22".
                Transform3D1.mul(Transform3Dstep);
                Transform3D2.mul(Transform3Dstep);
                Transform3D3.mul(Transform3Dstep);
                Transform3D4.mul(Transform3Dstep);

                //set the Transformation
                TransformGroup1.setTransform(Transform3D1);
                TransformGroup2.setTransform(Transform3D2);
                TransformGroup3.setTransform(Transform3D3);
                TransformGroup4.setTransform(Transform3D4);

            }
        }

    }

}
