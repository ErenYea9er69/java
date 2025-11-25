public class Serie extends Content {
    private int nbEpisodes;
    private int dureeEpisode;

    public Serie(String title, String genre, boolean isFree, int nbEpisodes, int dureeEpisode) {
        super(title, genre, isFree);
        this.nbEpisodes = nbEpisodes;
        this.dureeEpisode = dureeEpisode;
    }

    public void afficheDetails() {
        System.out.println("serie" + title + "genere: " + genre + " ep" + nbEpisodes + "time" + dureeEpisode + " gratui" + isFree);
    }


    public int getDuration() {
        return nbEpisodes * dureeEpisode;
    }
}