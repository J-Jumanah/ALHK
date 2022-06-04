/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 * Imports.
 */
import java.util.*;

/**
 *
 * @author jumanah
 */
public class Sections {

    private String sectionID;
    private String sectionName;
    private String sectionDescription;
    private String sectionImage;

    /**
     * ArrayList that store image object.
     */
    private ArrayList<ImgObject> IMGList = new ArrayList<ImgObject>();

    /**
     * Empty Constructor.
     */
    public Sections() {
    }

    /**
     * Constructor with parameter.
     */
    public Sections(String sectionID, String sectionName, String sectionDescription, String sectionImage) {
        this.sectionID = sectionID;
        this.sectionName = sectionName;
        this.sectionDescription = sectionDescription;
        this.sectionImage = sectionImage;
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

    /**
     * set/get of section name attribute.
     */
    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    /**
     * set/get of section description attribute.
     */
    public String getSectionDescription() {
        return sectionDescription;
    }

    public void setSectionDescription(String sectionDescription) {
        this.sectionDescription = sectionDescription;
    }

    /**
     * set/get of ArrayList ImgObject attribute.
     */
    public ArrayList<ImgObject> getIMGList() {
        return IMGList;
    }

    public void addIMGList(ImgObject imgObject) {
        this.IMGList.add(imgObject);
    }

    /**
     * set/get of section Image attribute.
     */
    public String getSectionImage() {
        return sectionImage;
    }

    public void setSectionImage(String sectionImage) {
        this.sectionImage = sectionImage;
    }

}
