package com.pe.mi.bebe.models;

public class Child_development {

    private int id;
    private String name;
    private int month;



    public Child_development(int id, String name, int month) {
        this.id = id;
        this.name = name;
        this.month = month;
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

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }


}
