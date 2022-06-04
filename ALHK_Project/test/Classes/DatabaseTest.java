/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.sql.*;
import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author apple
 */
public class DatabaseTest {

    /**
     * Test of addUserInfo method, of class Database.
     */
    @Test
    public void testCheckLogin() throws Exception {
        System.out.println("checkLogin");
        String username = "fmane";
        String password = "12345";
        boolean expResult = true;
        boolean result = Database.checkLogin(username, password);
        assertEquals(expResult, result);

    }

    /**
     * Test of addUserInfo method, of class Database.
     */
    @Test
    public void testAddUserInfo() throws Exception {
        System.out.println("addUserInfo");
        User newUser = new User("imSara", "sara", "ahmed", "sara@gmail.com", "09876");
        Database.addUserInfo(newUser);
        Database.checkUsername("imSara");

    }

}
