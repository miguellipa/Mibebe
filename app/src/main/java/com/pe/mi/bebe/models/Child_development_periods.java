package com.pe.mi.bebe.models;


public class Child_development_periods {

    private int id;
    private String date;
    private double weight;
    private double size;
    private double head_circunference;
    private Child child;
    private Child_development child_development;

    public Child_development_periods(int id, String date, double weight, double size, double head_circunference, Child child, Child_development child_development) {
        this.id = id;
        this.date = date;
        this.weight = weight;
        this.size = size;
        this.head_circunference = head_circunference;
        this.child = child;
        this.child_development = child_development;
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    public Child_development getChild_development() {
        return child_development;
    }

    public void setChild_development(Child_development child_development) {
        this.child_development = child_development;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getHead_circunference() {
        return head_circunference;
    }

    public void setHead_circunference(double head_circunference) {
        this.head_circunference = head_circunference;
    }



    public String add_Child_development() {

        return "Información de crecimiento registrada " + getChild().getName();

    }

    public String get_Child_development(int id_child) {

        return "Consulta control de crecimiento de codigo : "  + getChild().getChildid();

    }

}
