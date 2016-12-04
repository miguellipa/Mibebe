package com.pe.mi.bebe.models;


public class MedicalExam {

    private int id;
    private String name;
    private int type;

    public MedicalExam(int id, String name, int type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public MedicalExam(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
