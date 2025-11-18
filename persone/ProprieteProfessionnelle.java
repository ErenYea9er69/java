package persone;

public class ProprieteProfessionnelle extends propriete {
    private int nbEmployes;
    private boolean estEtatique;

    public ProprieteProfessionnelle(int id, personne reponsable, String adresse, double surface, int nbEmployes, boolean estEtatique) {
        super(id, reponsable, adresse, surface);
        this.nbEmployes = nbEmployes;
        this.estEtatique = estEtatique;
    }

    public int getNbEmployes() {
        return nbEmployes;
    }

    public void setNbEmployes(int nbEmployes) {
        this.nbEmployes = nbEmployes;
    }

    public boolean isEstEtatique() {
        return estEtatique;
    }

    public void setEstEtatique(boolean estEtatique) {
        this.estEtatique = estEtatique;
    }

    public String toString() {
        return super.toString() + ", nbEmployes: " + nbEmployes + ", estEtatique: " + estEtatique;
    }

    public double calculImpot() {
        if (estEtatique) {
            return 0;
        } else {
            return (surface / 100) * 100 + nbEmployes * 30;
        }
    }
}