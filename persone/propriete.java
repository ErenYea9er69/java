package persone;

public class propriete {
    protected int id;
    protected personne reponsable;
    protected String adresse;
    protected int surface;

    public propriete(int id, personne reponsable, String adresse, int surface) {
        this.id = id;
        this.reponsable = reponsable;
        this.adresse = adresse;
        this.surface = surface;
    }

    public int getId() {
        return id;
    }
    public personne getReponsable() {
        return reponsable;
    }
    public String getAdresse() {
        return adresse;
    }
    public int getSurface() {
        return surface;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setReponsable(personne reponsable) {
        this.reponsable = reponsable;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public void setSurface(int surface) {
        this.surface = surface;
    }
    public String toString() {
        return "id: " + id + ", reponsable:" + reponsable.toString() + " adresse: " + adresse + ", surface: " + surface;
    }

    


    
}
