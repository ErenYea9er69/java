package persone;

public class Fiscalite {
    public static void main(String[] args) {
        personne p1 = new personne(12345678, "Ben Ali", "Ahmed");
        personne p2 = new personne(87654321, "Trabelsi", "Fatma");
        personne p3 = new personne(11223344, "Hamdi", "Mohamed");

        Lotissement lotissement = new Lotissement(10);

        ProprietePrivee prop1 = new ProprietePrivee(1, p1, "Corniche", 350, 4);
        Villa villa1 = new Villa(2, p2, "Dar Chaabane", 400, 6, true);
        Appartement app1 = new Appartement(3, p2, "Hammamet", 1200, 8, 3);
        ProprieteProfessionnelle propProf1 = new ProprieteProfessionnelle(4, p3, "Korba", 1000, 50, true);
        ProprieteProfessionnelle propProf2 = new ProprieteProfessionnelle(5, p1, "Bir Bouragba", 2500, 400, false);

        lotissement.ajouter(prop1);
        lotissement.ajouter(villa1);
        lotissement.ajouter(app1);
        lotissement.ajouter(propProf1);
        lotissement.ajouter(propProf2);

        System.out.println("Liste des proprietes du lotissement:");
        lotissement.afficherProprietes();

        System.out.println("\nNombre global de pieces: " + lotissement.getnbPieces());

        ProprietePrivee minProp = lotissement.getMinImpot();
        if (minProp != null) {
            System.out.println("\nPropriete privee avec le moins d'impots:");
            System.out.println("Proprietaire: " + minProp.getReponsable().toString());
            System.out.println("Montant des impots: " + minProp.calculImpot() + " DT");
        }

        lotissement.supprimer(app1);
        System.out.println("\nListe des proprietes apres suppression de l'appartement de Hammamet:");
        lotissement.afficherProprietes();

        System.out.println("\n--- Test avec LotissementPrivee ---");
        Lotissement lt = new LotissementPrivee(10);
        lt.ajouter(prop1);
        lt.ajouter(villa1);
        lt.ajouter(app1);
        System.out.println("Tentative d'ajout d'une propriete professionnelle: " + lt.ajouter(propProf1));

        System.out.println("\nListe des proprietes du lotissement prive:");
        lt.afficherProprietes();
        System.out.println("\nNombre de pieces dans le lotissement prive: " + lt.getnbPieces());
    }
}