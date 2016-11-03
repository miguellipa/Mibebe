package com.pe.mi.bebe.models;


public class Medical_center {

    private int id;
    private String especiality;

    public Medical_center(int id, String especiality) {
        this.id = id;
        this.especiality = especiality;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEspeciality() {
        return especiality;
    }

    public void setEspeciality(String especiality) {
        this.especiality = especiality;
    }
}
