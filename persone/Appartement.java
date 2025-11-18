package persone;

public class Appartement extends PropriétePrivee {

    public int numEtage;

        public Appartement(int id, personne reponsable, String adresse, int surface, int nbpieces, int numEtage) {
        super(id, reponsable, adresse, surface, nbpieces);
        this.numEtage = numEtage;
    }

    public int getNumEtage() {
        return numEtage;
    }

    public void setNumEtage(int numEtage) {
        this.numEtage = numEtage;
    }

    public String toString() {
        return super.toString() + ", numEtage: " + numEtage;
    }


 

    
}
