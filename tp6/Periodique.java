package tp6;

public class Periodique extends Document {
    private String frequence;

    public Periodique(String titre, int numIdentification, int nbPages, String frequence) {
        super(titre, numIdentification, nbPages);
        this.frequence = frequence;
    }

    public String getFrequence() {
        return frequence;
    }

    public String Edition() {
        return "Periodique";
    }
    @Override
    public String toString() {
        return super.toString() + ", frequence=" + frequence;
    }

}
