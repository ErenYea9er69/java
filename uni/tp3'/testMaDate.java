import java.util.Scanner;

public class testMaDate {
public static void main(String[] args) {
Scanner sn = new Scanner(System.in);


    MaDate d1 = new MaDate(12, 5, 2025);
    MaDate d2 = new MaDate(16, 3, 2004);
    MaDate d3 = new MaDate(2036);

    System.out.println("Jour de d1: " + d1.getJour());
    System.out.println("Jour de d2: " + d2.getJour());
    System.out.println("Jour de d3: " + d3.getJour());

    d1.setAnnee(2004);
    d1.setMois(10);
    d1.setJour(3);

    d2.setAnnee(2042);
    d2.setMois(11);
    d2.setJour(1);

    System.out.println("Date d1: " + d1.toString());
    System.out.println("Date d2: " + d2.toString());
    System.out.println("Date d3: " + d3.toString());

    System.out.println("Menu:");
    System.out.println("1. Ajout d’un jour");
    System.out.println("2. Ajout de plusieurs jours");
    System.out.println("3. Ajout d’un mois");
    System.out.println("4. Ajout d’une année");

    int choix = sn.nextInt();

    if (choix == 1) {
        d1.ajouterUnJour();
    } else if (choix == 2) {
        System.out.print("Nombre de jours à ajouter: ");
        int n = sn.nextInt();
        d1.ajouterPlusieursJours(n);
    } else if (choix == 3) {
        d1.ajouterUnMois();
    } else if (choix == 4) {
        d1.ajouterUnAn();
    }

    System.out.println("Nouvelle date d1: " + d1.toString());
    sn.close();
}

}
