/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 * Imports.
 */
import com.sun.j3d.utils.applet.MainFrame;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author apple
 */
public class ALHKProject {

    static Object_3D applet;
    public static java.awt.Frame frame;

    /**
     * To open a new window that contains the 3D object.
     */
    public static void main(String[] args) {
        applet = new Object_3D();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        //MainFrame provides an AWT frame (window) for an applet allowing the applet to run as an application.
        frame = new MainFrame(applet, screenSize.width, screenSize.height);

    }

    /**
     * Used for the project interfaces.
     */
    public static void setColor(JPanel panel) {
        panel.setBackground(new Color(147, 197, 254));
    }

    public static void resetColor(JPanel panel1, JPanel panel2, JPanel panel3) {
        panel1.setBackground(new Color(92, 140, 215));
        panel2.setBackground(new Color(92, 140, 215));
        panel3.setBackground(new Color(92, 140, 215));
    }

}
