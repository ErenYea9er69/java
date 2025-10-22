package tp6;


public class Article extends Document {
    private String auteur;

    public Article(String titre, int numIdentification, int nbPages, String auteur) {
        super(titre, numIdentification, nbPages);
        this.auteur = auteur;
    }

    public String getAuteur() {
        return auteur;
    }

    @Override
    public String Edition() {
        return "Article";
    }

    public String toString() {
        return super.toString() + ", auteur=" + auteur;
    }
    

}
