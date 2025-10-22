package tp6;

public class Document {
    private String titre;
    private int numIdentification;
    private int nbPages;

    public Document(String titre, int numIdentification, int nbPages) {
        this.titre = titre;
        this.numIdentification = numIdentification;
        this.nbPages = nbPages;
    }

    public String getTitre() {
        return titre;
    }

    public int getNumIdentification() {
        return numIdentification;
    }

    public int getNbPages() {
        return nbPages;
    }

    public String Edition() {
        return "document";
    }

    public String toString() {
        return "titre=" + titre + ", numIdentification=" + numIdentification + ", nbPages=" + nbPages ;
    }
}
