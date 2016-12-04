package com.pe.mi.bebe.models;


public class Doctor {
    private int id;
    private String especiality;

    public Doctor(int id, String especiality) {
        this.id = id;
        this.especiality = especiality;
    }

    public Doctor(){

    }

    public String getEspeciality() {
        return especiality;
    }

    public void setEspeciality(String especiality) {
        this.especiality = especiality;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
