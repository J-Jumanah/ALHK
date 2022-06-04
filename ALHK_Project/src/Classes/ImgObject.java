/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 * Imports.
 */
import java.net.*;

/**
 *
 * @author jumanah
 */
public class ImgObject {

    private String imageID;
    private String imageName;
    private String image_URL;
    private String img3D_URL;
    private String sectionID;

    /**
     * Empty Constructor.
     */
    public ImgObject() {
    }

    /**
     * Constructor with parameter.
     */
    public ImgObject(String imageID, String imageName, String image_URL, String img3D_URL, String sectionID) {
        this.imageID = imageID;
        this.imageName = imageName;
        this.image_URL = image_URL;
        this.img3D_URL = img3D_URL;
        this.sectionID = sectionID;
    }

    /**
     * set/get of image ID attribute.
     */
    public String getImageID() {
        return imageID;
    }

    public void setImageID(String imageID) {
        this.imageID = imageID;
    }

    /**
     * set/get of image name attribute.
     */
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    /**
     * set/get of image URL attribute.
     */
    public String getImage_URL() {
        return image_URL;
    }

    public void setImage_URL(String image_URL) {
        this.image_URL = image_URL;
    }

    /**
     * set/get of image 3D URL attribute.
     */
    public String getImg3D_URL() {
        return img3D_URL;
    }

    public void setImg3D_URL(String img3D_URL) {
        this.img3D_URL = img3D_URL;
    }

    /**
     * set/get of section ID attribute.
     */
    public String getSectionID() {
        return sectionID;
    }

    public void setSectionID(String sectionID) {
        this.sectionID = sectionID;
    }

}
