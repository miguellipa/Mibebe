package com.pe.mi.bebe.models;


public class MedicalEvent {

    private int id;
    private String name;
    private String eventDate;
    private int picture;
    private Child child;
    private Medicine medicine;
    private MedicalExam medicalExam;
    private HealthProblem healthProblem;
    private Doctor doctor;

    public MedicalEvent(int id, String name, String event_date, MedicalExam medical_exam, Child child, int picture, Medicine medicine, Doctor doctor, HealthProblem healthProblem) {
        this.id = id;
        this.name = name;
        this.eventDate = event_date;
        this.medicalExam = medical_exam;
        this.child = child;
        this.picture = picture;
        this.medicine = medicine;
        this.doctor = doctor;
        this.healthProblem = healthProblem;
    }

    public MedicalEvent(){

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

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public MedicalExam getMedicalExam() {
        return medicalExam;
    }

    public void setMedicalExam(MedicalExam medicalExam) {
        this.medicalExam = medicalExam;
    }

    public HealthProblem getHealthProblem() {
        return healthProblem;
    }

    public void setHealthProblem(HealthProblem healthProblem) {
        this.healthProblem = healthProblem;
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


    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }


    public String getMedicalEvent() {
        return "Consultar indidencia medica de " + getChild().getName();
    }

    public String addMedicalEvent() {
        return "Registrar indidencia medica de "+ getChild().getName();
    }

    public String updateMedicalEvent() {
        return "Actualizar indidencia medica de "+ getChild().getName();
    }

    public String getDoctorName() {
        return null;
    }

}
