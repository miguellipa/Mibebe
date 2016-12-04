package com.pe.mi.bebe.models;


public class ChildDevelopmentPeriods {

    private int id;
    private String date;
    private double weight;
    private double size;
    private double headCircunference;
    private Child child;
    private ChildDevelopment childDevelopment;

    public ChildDevelopmentPeriods(int id, String date, double weight, double size, double head_circunference, Child child, ChildDevelopment child_development) {
        this.id = id;
        this.date = date;
        this.weight = weight;
        this.size = size;
        this.headCircunference = head_circunference;
        this.child = child;
        this.childDevelopment = child_development;
    }

    public ChildDevelopmentPeriods(){

    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
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

    public double getHeadCircunference() {
        return headCircunference;
    }

    public void setHeadCircunference(double headCircunference) {
        this.headCircunference = headCircunference;
    }

    public ChildDevelopment getChildDevelopment() {
        return childDevelopment;
    }

    public void setChildDevelopment(ChildDevelopment childDevelopment) {
        this.childDevelopment = childDevelopment;
    }

    public String addChildDevelopment() {

        return "Información de crecimiento registrada " + getChild().getName();

    }

    public String getChildDevelopmentPeriods() {

        return "Consulta control de crecimiento de "  + getChild().getName();

    }

}
