package pe.edu.urp.mibebe.models;


public class Vaccine_plan {

    private int id;
    private String nmes;
    private Vaccine vaccine;

    public Vaccine_plan(int id, String nmes, Vaccine vaccine) {
        this.id = id;
        this.nmes = nmes;
        this.vaccine = vaccine;
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
