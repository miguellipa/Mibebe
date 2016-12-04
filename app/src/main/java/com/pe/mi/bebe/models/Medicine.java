package com.pe.mi.bebe.models;

public class Medicine {

    private int id;
    private String name;

    public Medicine(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Medicine(){

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
}
