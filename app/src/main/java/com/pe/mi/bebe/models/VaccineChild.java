package com.pe.mi.bebe.models;


public class VaccineChild {

    private int id;
    private String dateSuggested;
    private String dateRegister;
    private int picture;
    private Child child;
    private VaccinePlan vaccinePlan;

    public VaccineChild(int id, String date_suggested, int picture, String date_register, Child child, VaccinePlan vaccine_plan) {
        this.id = id;
        this.dateSuggested = date_suggested;
        this.picture = picture;
        this.dateRegister = date_register;
        this.child = child;
        this.vaccinePlan = vaccine_plan;
    }

    public VaccineChild(){

    }

    public VaccinePlan getVaccinePlan() {
        return vaccinePlan;
    }

    public void setVaccinePlan(VaccinePlan vaccinePlan) {
        this.vaccinePlan = vaccinePlan;
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

    public String getDateSuggested() {
        return dateSuggested;
    }

    public void setDateSuggested(String dateSuggested) {
        this.dateSuggested = dateSuggested;
    }

    public String getDateRegister() {
        return dateRegister;
    }

    public void setDateRegister(String dateRegister) {
        this.dateRegister = dateRegister;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }

    public String getVaccineChildPlan (){
        return "Consulta plan de vacunación de " + getChild().getName();
    }

    public String updateVaccinePlan (){
        return "Actualizar plan de vacunación " + getChild().getName();
    }

    public String addVaccinePlan (){
        return "Registrar plan de vacunación " + getChild().getName();
    }

    public String getVaccineName(){
        return null;
    }

}
