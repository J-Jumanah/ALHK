/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.*;

/**
 *
 * @author jumanah
 */
public class creatDatabase {

    public static void main(String[] args) throws ClassNotFoundException, SQLException  {

        Connection con = null;

        Class.forName("com.mysql.jdbc.Driver");

        //set the path for the database
        String ConnectionURL = "jdbc:mysql://localhost:3306";
        //0252
        //create connection
        con = DriverManager.getConnection(ConnectionURL, "root", "WadyanGo123456");
        //Our pass for MySQL: Jumanah (1106Moon), Fay (Aa123456), Jamela (Jamela123@!!), Wedayn (WadyanGo123456)

        Statement st = con.createStatement();

        String database = "ALHK";

        st.executeUpdate("CREATE SCHEMA " + database);

        System.out.println("Database is created");

        con.close();

    }
}
