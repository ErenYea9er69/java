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

    public String Edition() {
        return "Article";
    }

    @Override
    public String toString() {
        return super.toString() + ", auteur=" + auteur;
    }
    

}
