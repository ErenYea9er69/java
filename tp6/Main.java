package tp6;

public class Main {

    public static void main(String[] args) {
        Livre l1 = new Livre("Prince", 1, 100, "machiavelli", "peter");
        Article a1 = new Article("svt", 2, 50, "joe");
        Article a2 = new Article("info", 2, 55, "ai");
        Bibliotheque biblio1 = new Bibliotheque();
        biblio1.ajout_doc(l1);
        biblio1.ajout_doc(a1);
        biblio1.ajout_doc(a2);

        biblio1.Inventaire_doc();

    }
}
