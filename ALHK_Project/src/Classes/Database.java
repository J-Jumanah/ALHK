/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 * Imports.
 */
import Interfaces.*;
import java.sql.*;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import sun.security.util.Password;

/**
 *
 * @author jumanah
 */
public class Database {

    private static Connection connection;
    public static String emailChange;

    /**
     * This method is used to return database connection
     *
     * @throws Exception
     */
    public static Connection getConnection() throws  ClassNotFoundException,SQLException   {
        connection = null;
        //Load JDBC driver
        Class.forName("com.mysql.jdbc.Driver");
        //Create connection
        connection = DriverManager.getConnection("jdbc:mysql://MYSQL8001.site4now.net/db_a86a9e_alhk", "a86a9e_alhk", "Jamela123");
        return connection;
    }

    /**
     * This method is used to return true if the username and password match the
     * one found in the database and false if they do not match.
     *
     * @param username
     * @param password
     */
    public static boolean checkLogin(String username, String password) throws ClassNotFoundException, SQLException  {
        String username_DB, password_DB;
        //Create connection object
        connection = getConnection();
        //Create statment object
        Statement state = connection.createStatement();
        //Query to retrieve username and password from database
        ResultSet resultSet = state.executeQuery("SELECT Username,Password FROM user WHERE Username =+'" + username + "'");
        while (resultSet.next()) {
            username_DB = resultSet.getString("Username");
            password_DB = resultSet.getString("Password");
            if (username_DB.equalsIgnoreCase(username) && password_DB.equals(password)) {
                return true;
            }
        }
        //close connection
        connection.close();
        return false;
    }

    /**
     * This method is used to return false if the username is found in the
     * database and true if it does not exist.
     *
     * @param username
     */
    public static boolean checkUsername(String username) throws ClassNotFoundException, SQLException  {
        String username_DB;
        //Create connection object
        connection = getConnection();
        //Create statment object
        Statement state = connection.createStatement();
        //Query to retrieve username and password from database
        ResultSet resultSet = state.executeQuery("SELECT Username FROM user WHERE Username =+'" + username + "'");
        while (resultSet.next()) {
            username_DB = resultSet.getString("Username");
            if (username_DB.equalsIgnoreCase(username)) {
                //found 
                return false;
            }
        }
        //close connection
        connection.close();
        //not found 
        return true;
    }

    /**
     * This method is used to return true if the email is found in the database
     * and false if it does not exist.
     *
     * @param email
     * @throws java.lang.Exception
     */
    public static boolean checkEmail(String email) throws ClassNotFoundException, SQLException  {
        String email_DB;
        //Create connection object
        connection = getConnection();
        //Create statment object
        Statement state = connection.createStatement();
        //Query to retrieve email from database
        ResultSet resultSet = state.executeQuery("SELECT Email FROM user WHERE Email =+'" + email + "'");
        while (resultSet.next()) {
            email_DB = resultSet.getString("Email");
            if (email_DB.equalsIgnoreCase(email)) {
                //found on db
                return true;
            }
        }
        //close connection
        connection.close();
        //not found
        return false;
    }

    /**
     * This method is used to add new user1 information to database.
     *
     * @param user
     * @throws java.lang.Exception
     */
    public static void addUserInfo(User user) throws ClassNotFoundException, SQLException  {
        //Create connection object
        connection = getConnection();
        //Create statment object
        Statement state = connection.createStatement();
        //Query to insert new user1 data into database
        state.executeUpdate("INSERT INTO user VALUES ('" + user.getUserName() + "', '" + user.getPassword() + "', '" 
                + user.getFirstName() + "', '" + user.getLastName() + "', '" + user.getEmail() + "', NULL )");
        //close connection
        connection.close();
    }

    /**
     * This method is used to retrieve user1 information .
     *
     * @param username
     * @throws java.lang.Exception
     */
    public static User displayUserInfo(String username) throws ClassNotFoundException, SQLException  {
        User user = new User();
        //Create connection object
        connection = getConnection();
        //Create statment object
        Statement state = connection.createStatement();
        //Query to retrieve user1 info from database
        ResultSet resultSet = state.executeQuery("SELECT * FROM user WHERE Username =+'" + username + "'");
        //store user information in user object; to display it on the profile
        while (resultSet.next()) {
            user.setUserName(resultSet.getString("Username"));
            user.setFirstName(resultSet.getString("First_Name"));
            user.setLastName(resultSet.getString("Last_Name"));
            user.setPassword(resultSet.getString("Password"));
            user.setEmail(resultSet.getString("Email"));
            emailChange = resultSet.getString("Email");
        }
        //close connection
        connection.close();
        return user;
    }

    /**
     * This method is used to update the password when it was forgotten by the user.
     *
     * @param email
     * @param password
     * @throws java.lang.Exception
     */
    public static void updatePassword(String email, String password) throws ClassNotFoundException, SQLException  {
        //Create connection object
        connection = getConnection();
        //Query to update user1 data
        String query = "update user set Password = ? WHERE Email = ?";
        PreparedStatement preparedStmt = connection.prepareStatement(query);
        preparedStmt.setString(1, email);
        preparedStmt.setString(2, password);
        //Execute the java preparedstatement
        preparedStmt.executeUpdate();
        //Display successfully message 
        JOptionPane.showMessageDialog(null, " Your information has been sucessfully updated!");
        //close 
        connection.close();
    }

    /**
     * This method is used to retrieve sections information from the database
     * @throws java.lang.Exception
     */
    public static ArrayList<Sections> onLoadSection() throws ClassNotFoundException, SQLException  {
        //Create connection object
        connection = getConnection();
        //Use the class section to store sections in the array retrieved from the database
        ArrayList<Sections> section = new ArrayList();
        PreparedStatement state = connection.prepareStatement("SELECT * FROM section");
        ResultSet resultSet = state.executeQuery();
        String ID = "", Name = "", Description = "", SectionImage = "";
        for (int i = 0; resultSet.next(); i++) {
            ID = resultSet.getString("Section_ID");
            Name = resultSet.getString("Section_Name");
            Description = resultSet.getString("Section_Description");
            SectionImage = resultSet.getString("Section_Image");
            section.add(new Sections(ID, Name, Description, SectionImage));
        }

        //close connection
        connection.close();
        return section;
    }

    /**
     * This method is used to retrieve and display the objects under the
     * specified section whose ID was sent via the parameter.
     *
     * @param section_ID
     * @throws java.lang.Exception
     */
    public static Sections displayAllImages(String section_ID) throws ClassNotFoundException, SQLException  {
        //Create connection object
        connection = getConnection();
        PreparedStatement state = connection.prepareStatement("SELECT * FROM Object WHERE Section_ID ='" + section_ID + "'");
        ResultSet resultSet = state.executeQuery();
        //We use imgObj to store all related objects of the spisfic section in arrayList contain objects
        Sections imgObj = new Sections();
        String ID = "", Name = "", URL = "", URL_3D = "", SectionID = "";
        for (int i = 0; resultSet.next(); i++) {
            ID = resultSet.getString("Object_ID");
            Name = resultSet.getString("Object_Name");
            URL = resultSet.getString("Object_URL");
            URL_3D = resultSet.getString("3D_URL");
            SectionID = resultSet.getString("Section_ID");
            imgObj.addIMGList(new ImgObject(ID, Name, URL, URL_3D, SectionID));
        }
        //close connection
        connection.close();
        return imgObj;

    }

    /**
     * This method is used to get sections ID from database.
     * @throws java.lang.Exception
     */
    public static ArrayList<String> getSectionID() throws ClassNotFoundException, SQLException  {
        //Create connection object
        connection = getConnection();
        //Use arrayList to store paths that get from database and use them after to display specific section contents
        ArrayList<String> sectionID = new ArrayList();
        PreparedStatement state = connection.prepareStatement("SELECT Section_ID FROM section");
        ResultSet resultSet = state.executeQuery();
        String ID = "";
        for (int i = 0; resultSet.next(); i++) {
            ID = resultSet.getString("Section_ID");
            sectionID.add(ID);
        }
        //close connection
        connection.close();
        return sectionID;
    }

    /**
     * This method is used to get URLs of the 3D objects stored in database,
     * to be displayed.
     *
     * @param section_ID
     * @throws java.lang.Exception
     */
    public static ArrayList<String> getObject3D_URL(String section_ID) throws ClassNotFoundException, SQLException  {
        //Create connection object
        connection = getConnection();
        //Use arrayList to store URLs that get from database then display the selected object
        ArrayList<String> object_3D_URL = new ArrayList();
        PreparedStatement state = connection.prepareStatement("SELECT 3D_URL FROM Object WHERE Section_ID ='" + section_ID + "'");
        ResultSet resultSet = state.executeQuery();
        String URL = "";
        while (resultSet.next()) {
            URL = resultSet.getString("3D_URL");
            object_3D_URL.add(URL);
        }
        //close connection
        connection.close();
        return object_3D_URL;
    }

    /**
     * This method is used to update user information.
     * 
     * @throws java.lang.Exception
     */
    public static void updateUserProfile() throws ClassNotFoundException, SQLException  {
        //Create connection object
        connection = getConnection();
        //Query to update user1 data
        String query = "UPDATE User set First_Name = ? ,Last_Name = ?, Email = ? , Password = ? WHERE Username = ?";
        PreparedStatement preparedStmt = connection.prepareStatement(query);
        String names[] = Profile.fullNameText.getText().split(" ");
        //Set the string value to the given index
        preparedStmt.setString(1, names[0]);//First name
        preparedStmt.setString(2, names[1]);//Last name
        preparedStmt.setString(3, Profile.emailText.getText());
        preparedStmt.setString(4, Profile.passText.getText());
        //username
        preparedStmt.setString(5, Profile.usernameText.getText());
        //Execute the java preparedstatement
        preparedStmt.executeUpdate();
        //Display successfully message 
        JOptionPane.showMessageDialog(null, "You have sucessfully updated your profile.");
        //close 
        connection.close();
    }
}
