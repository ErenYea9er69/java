package persone;

public class ProprietePrivee extends propriete {
    private int nbpieces;

    public ProprietePrivee(int id, personne reponsable, String adresse, double surface, int nbpieces) {
        super(id, reponsable, adresse, surface);
        this.nbpieces = nbpieces;
    }

    public int getNbpieces() {
        return nbpieces;
    }

    public void setNbpieces(int nbpieces) {
        this.nbpieces = nbpieces;
    }

    public String toString() {
        return super.toString() + ", nbpieces: " + nbpieces;
    }

    public double calculImpot() {
        return (surface / 100) * 50 + nbpieces * 10;
    }
}