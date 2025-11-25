public class Movie extends Content {
    private int duration;

    public Movie(String title, String genre, boolean isFree, int duration) {
        super(title, genre, isFree);
        this.duration = duration;
    }
    public void afficheDetails() {
        System.out.println("movie: " + title + "genere: " + genre + " duree: " + duration + "gratui ?: " + isFree);
    }


    public int getDuration() {
        return duration;
    }
}