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
public class createTable {

    public static void main(String[] args) throws ClassNotFoundException, SQLException   {

        sectionTable();
        userTable();
        objectTable();
    }

    /**
     * This method is used to create the user table on ALHK database.
     */
    static public void userTable() throws ClassNotFoundException, SQLException  {
        Connection con = Database.getConnection();

        Statement st = con.createStatement();

        String sql = "CREATE TABLE User "
                + "(Username VARCHAR(20) not null, "
                + "Password VARCHAR(15) not null,"
                + "First_Name VARCHAR(20),"
                + "Last_Name VARCHAR(20),"
                + "Email VARCHAR(50),"
                + "Section_ID VARCHAR(20),"
                + "PRIMARY KEY (Username),"
                + "FOREIGN KEY (Section_ID)"
                + "REFERENCES Section(Section_ID)"
                + "ON DELETE CASCADE"
                + ")";

        st.executeUpdate(sql);
        System.out.println("Table is created");

        con.close();
    }

    /**
     * This method is used to create the section table on ALHK database.
     */
    static public void sectionTable() throws ClassNotFoundException, SQLException  {
        Connection con = Database.getConnection();

        Statement st = con.createStatement();

        String sql = "CREATE TABLE Section"
                + "(Section_ID VARCHAR(20) not null, "
                + "Section_Name VARCHAR(50) not null,"
                + "Section_Description TEXT,"
                + "Section_Image LONGTEXT,"
                + "PRIMARY KEY (Section_ID))";

        st.executeUpdate(sql);
        System.out.println("Table is created");

        con.close();
    }

    /**
     * This method is used to create the object table on ALHK database .
     */
    static public void objectTable() throws ClassNotFoundException, SQLException  {
        Connection con = Database.getConnection();

        Statement st = con.createStatement();

        String sql = "CREATE TABLE Object "
                + "(Object_ID VARCHAR(20) not null, "
                + "Object_Name VARCHAR(50),"
                + "Object_URL LONGTEXT,"
                + "3D_URL LONGTEXT,"
                + "Section_ID VARCHAR(20)," 
                + "PRIMARY KEY (Object_ID),"
                + "FOREIGN KEY (Section_ID)"
                + "REFERENCES Section(Section_ID)"
                + "ON DELETE CASCADE"
                + ")";

        st.executeUpdate(sql);
        System.out.println("Table is created");

        con.close();
    }

}
