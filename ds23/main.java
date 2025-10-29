package ds23;

public class main {
    
    public static void main(String[] args) {
        Pepiniere p = new Pepiniere();
        p.ajouterPlante(new Arbre("Arbre1", 20, 1, 10, "caduque"));
        p.ajouterPlante(new Arbre("Arbre2", 60, 2, 15, "persistant"));
        p.ajouterPlante(new Fleur("Fleur1", 5, 1, 5, "rouge", 2));
        p.afficherInventaire();
        System.out.println("Total CO2 absorbe: " + p.totalCO2Absorbe());
        System.out.println("Nombre d'arbres caduques: " + p.compterArbresCaduques());
    }
}
