public class Utilisateurs {

    private String nom;
    protected boolean isSubscribed;
    private int nbWatched;
    private Content[] watchedContent;
    private final int MAX_WATCHED = 100;

    public Utilisateurs(String nom) {
        this.nom = nom;
        this.isSubscribed = false;
        this.nbWatched = 0;
        this.watchedContent = new Content[MAX_WATCHED];
    }

    public int getNbWatched() {
        return this.nbWatched;
    }
    
    public boolean isSubscribed() {
        return this.isSubscribed;
    }

    public Content[] getWatchedContent() {
        return watchedContent;
    }

    public boolean canPlay(Content content) {
        if (content.isFree || this.isSubscribed) {
            return true;
        }
        return false;
    }

    public void addWatchedContent(Content content) {
        if (this.nbWatched < MAX_WATCHED) {
            this.watchedContent[this.nbWatched] = content;
            this.nbWatched++;
        }  
    }

    public String[] getWatchedGenres(){

        String[] genres = new String[this.nbWatched];
        int np = 0;
        
        for (int i = 0; i < this.nbWatched; i++) {
            if (this.watchedContent[i] != null) {
                boolean genreExists = false;
                for (int j = 0; j < np; j++) {
                    if (genres[j] != null && genres[j].equals(this.watchedContent[i].genre)) {
                        genreExists = true;
                        break;
                    }
                }
                if (!genreExists) {
                    genres[np] = this.watchedContent[i].genre;
                    np++;
                }
            }
        }
        return genres;
    }
}