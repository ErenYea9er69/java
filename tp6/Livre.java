package tp6;

public class Livre extends Article {
    private String editeur;

    public Livre(String titre, int numIdentification, int nbPages, String auteur, String editeur) {
        super(titre, numIdentification, nbPages, auteur);
        this.editeur = editeur;
    }

    public String getEditeur() {
        return editeur;
    }

    @Override
    public String Edition() {
        return "livre";
    }

    public String toString() {
        return super.toString() + ", editeur=" + editeur;
    }

}

