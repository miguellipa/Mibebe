package pe.edu.urp.mibebe.models;


public class Vaccine {

    private int id;
    private String name;
    private String composition;

    public Vaccine(int id, String name, String composition) {
        this.id = id;
        this.name = name;
        this.composition = composition;
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

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }
}
