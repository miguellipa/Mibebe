package com.pe.mi.bebe.models;

public class Child {

    private int childid;
    private String name;
    private String date_of_birth;
    private int photo;
    private double weight;
    private double size;
    private int idcart;

    public Child(int childid, String name, String date_of_birth, double weight, double size, int photo, int idcart) {
        this.childid = childid;
        this.name = name;
        this.date_of_birth = date_of_birth;
        this.weight = weight;
        this.size = size;
        this.photo = photo;
        this.idcart = idcart;
    }

    public Child(int childid,String name,String date_of_birth,int photo){
               this.setChildid(childid);
                this.name = name;
                this.date_of_birth = date_of_birth;
                this.setPhoto(photo);
            }

    public int getChildid() {
        return childid;
    }

    public void setChildid(int childid) {
        this.childid = childid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public int getIdcart() {
        return idcart;
    }

    public void setIdcart(int idcart) {
        this.idcart = idcart;
    }



}
