/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Classes.*;
import java.sql.*;

/**
 *
 * @author jumanah
 */
public class insertData {

    public static void main(String[] args) throws Exception, SQLException {

        insertUser();
        insertSection();
        insertObject();
    }

    /**
     * This method is used to insert user data to ALHK database.
     */
    static public void insertUser() throws ClassNotFoundException, SQLException {
        Connection con = Database.getConnection();
        Statement state = con.createStatement();

        state.executeUpdate("INSERT INTO User" + " VALUES( 'jjan', '12345@Jj', 'Jumanah', 'Jan', 'jjan@gmail.com', NULL)");
        state.executeUpdate("INSERT INTO User" + " VALUES( 'fmanee', '12345@Ff', 'Fay', 'Aldossary', 'fay@gmail.com', NULL)");
        state.executeUpdate("INSERT INTO User" + " VALUES( 'jsaad', '12345@Ss', 'Jamela', 'Saad', 'js@hotmail.com', NULL)");
        state.executeUpdate("INSERT INTO User" + " VALUES( 'wedyan', '12345@Ww', 'Wedyan', 'Alafif', 'wd@hotmail.com', NULL)");

        System.out.println("Data inserted");

        con.close();
    }

    /**
     * This method is used to insert sections data to ALHK database.
     */
    static public void insertSection() throws ClassNotFoundException, SQLException  {
        Connection con = Database.getConnection();
        PreparedStatement state;
        state = con.prepareStatement("INSERT INTO Section" + " VALUES('Sec0','Solar System','The planets that go around the Sun.','Sections/planets.png')");
        state.executeUpdate();
        state = con.prepareStatement("INSERT INTO Section" + " VALUES('Sec1','Geometric Shapes','Geometric shapes that figures demonstrate the 3D shapes that have an x-axis, y-axis, and z-axis.','Sections/Shape.png')");
        state.executeUpdate();

        System.out.println("Data inserted");

        con.close();
    }

    /**
     * This method is used to insert objects data to ALHK database.
     */
    static public void insertObject() throws ClassNotFoundException, SQLException  {
        Connection con = Database.getConnection();
        PreparedStatement state;

        //Section Space
        state = con.prepareStatement("INSERT INTO Object" + " VALUES('Obj0','Earth','Objects/Space/URL/Earth.png','Objects/Space/3DURL/Earth/Earth.obj', 'Sec0')");
        state.executeUpdate();
        state = con.prepareStatement("INSERT INTO Object" + " VALUES('Obj1','Mars','Objects/Space/URL/Mars.png','Objects/Space/3DURL/Mars/Mars.obj', 'Sec0')");
        state.executeUpdate();
        state = con.prepareStatement("INSERT INTO Object" + " VALUES('Obj2','Saturn','Objects/Space/URL/Saturn.png','Objects/Space/3DURL/Saturn/Saturn.obj', 'Sec0')");
        state.executeUpdate();
        state = con.prepareStatement("INSERT INTO Object" + " VALUES('Obj3','Moon','Objects/Space/URL/Moon.png','Objects/Space/3DURL/Moon/Moon.obj', 'Sec0')");
        state.executeUpdate();
        state = con.prepareStatement("INSERT INTO Object" + " VALUES('Obj4','Pluto','Objects/Space/URL/Pluto.png','Objects/Space/3DURL/Pluto/Pluto.obj', 'Sec0')");
        state.executeUpdate();
        state = con.prepareStatement("INSERT INTO Object" + " VALUES('Obj5','Neptune','Objects/Space/URL/Neptune.png','Objects/Space/3DURL/Neptune/Neptune.obj', 'Sec0')");
        state.executeUpdate();

        //Section Shape
        state = con.prepareStatement("INSERT INTO Object" + " VALUES('Obj6','Sphere','Objects/Shape/URL/Sphere.png','Objects/Shape/3DURL/Sphere/Sphere.obj', 'Sec1')");
        state.executeUpdate();
        state = con.prepareStatement("INSERT INTO Object" + " VALUES('Obj7','Cuboid','Objects/Shape/URL/Cuboid.png','Objects/Shape/3DURL/Cuboid/Cuboid.obj', 'Sec1')");
        state.executeUpdate();
        state = con.prepareStatement("INSERT INTO Object" + " VALUES('Obj8','Cube','Objects/Shape/URL/Cube.png','Objects/Shape/3DURL/Cube/Cube.obj', 'Sec1')");
        state.executeUpdate();
        state = con.prepareStatement("INSERT INTO Object" + " VALUES('Obj9','Cone','Objects/Shape/URL/Cone.png','Objects/Shape/3DURL/Cone/Cone.obj', 'Sec1')");
        state.executeUpdate();
        state = con.prepareStatement("INSERT INTO Object" + " VALUES('Obj10','Torus','Objects/Shape/URL/Torus.png','Objects/Shape/3DURL/Torus/Torus.obj', 'Sec1')");
        state.executeUpdate();
        state = con.prepareStatement("INSERT INTO Object" + " VALUES('Obj11','Cylinder','Objects/Shape/URL/Cylinder.png','Objects/Shape/3DURL/Cylinder/Cylinder.obj', 'Sec1')");
        state.executeUpdate();

        System.out.println("Data inserted");

        con.close();
    }

}
