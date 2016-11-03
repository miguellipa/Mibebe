package com.pe.mi.bebe.models;


public class Vaccine_child {

    private int id;
    private String date_suggested;
    private String date_register;
    private int picture;
    private Child child;
    private Vaccine_plan vaccine_plan;

    public Vaccine_child(int id, String date_suggested, int picture, String date_register, Child child, Vaccine_plan vaccine_plan) {
        this.id = id;
        this.date_suggested = date_suggested;
        this.picture = picture;
        this.date_register = date_register;
        this.child = child;
        this.vaccine_plan = vaccine_plan;
    }

    public Vaccine_plan getVaccine_plan() {
        return vaccine_plan;
    }

    public void setVaccine_plan(Vaccine_plan vaccine_plan) {
        this.vaccine_plan = vaccine_plan;
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate_suggested() {
        return date_suggested;
    }

    public void setDate_suggested(String date_suggested) {
        this.date_suggested = date_suggested;
    }

    public String getDate_register() {
        return date_register;
    }

    public void setDate_register(String date_register) {
        this.date_register = date_register;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }

    private String get_vaccine_plan (){
        return "Consulta plan de vacunación " + getChild().getName();
    }

    private String update_vaccine_plan (){
        return "Actualizar plan de vacunación " + getChild().getName();
    }

    private String add_vaccine_plan (){
        return "Registrar plan de vacunación " + getChild().getName();
    }
}
