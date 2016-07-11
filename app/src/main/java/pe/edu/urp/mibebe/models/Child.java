package pe.edu.urp.mibebe.models;

import java.util.Date;

/**
 * Created by MIGUEL on 5/07/2016.
 */
public class Child {

    private int childid;
    private String name;
    private String date_of_birth;
    private int photo;

    public Child(int childid,String name,String date_of_birth,int photo){
        this.setChildid(childid);
        this.name = name;
        this.date_of_birth = date_of_birth;
        this.setPhoto(photo);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }


    public int getChildid() {
        return childid;
    }

    public void setChildid(int childid) {
        this.childid = childid;
    }
}
