package com.pe.mi.bebe.models;


public class Medical_event {

    private int id;
    private String name;
    private String event_date;
    private int picture;
    private Child child;
    private Medicine medicine;
    private Medical_exam medical_exam;
    private Health_problem health_problem;
    private Doctor doctor;

    public Medical_event(int id, String name, String event_date, Medical_exam medical_exam, Child child, int picture, Medicine medicine, Doctor doctor, Health_problem health_problem) {
        this.id = id;
        this.name = name;
        this.event_date = event_date;
        this.medical_exam = medical_exam;
        this.child = child;
        this.picture = picture;
        this.medicine = medicine;
        this.doctor = doctor;
        this.health_problem = health_problem;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    public Medicine getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }

    public Medical_exam getMedical_exam() {
        return medical_exam;
    }

    public void setMedical_exam(Medical_exam medical_exam) {
        this.medical_exam = medical_exam;
    }

    public Health_problem getHealth_problem() {
        return health_problem;
    }

    public void setHealth_problem(Health_problem health_problem) {
        this.health_problem = health_problem;
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

    public String getEvent_date() {
        return event_date;
    }

    public void setEvent_date(String event_date) {
        this.event_date = event_date;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }


    private String get_medical_event() {
        return "Consultar indidencia medica " + getChild().getName();
    }

    private String add_medical_event() {
        return "Registrar indidencia medica "+ getChild().getName();
    }

    private String update_medical_event() {
        return "Actualizar indidencia medica "+ getChild().getName();
    }

}
