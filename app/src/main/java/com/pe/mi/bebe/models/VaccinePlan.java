package com.pe.mi.bebe.models;


public class VaccinePlan {

    private int id;
    private String nmes;
    private Vaccine vaccine;

    public VaccinePlan(int id, String nmes, Vaccine vaccine) {
        this.id = id;
        this.nmes = nmes;
        this.vaccine = vaccine;
    }

    public VaccinePlan(){

    }


    public Vaccine getVaccine() {
        return vaccine;
    }

    public void setVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNmes() {
        return nmes;
    }

    public void setNmes(String nmes) {
        this.nmes = nmes;
    }
}
