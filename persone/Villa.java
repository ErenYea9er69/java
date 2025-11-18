package persone;

public class Villa extends PropriétePrivee {

    private boolean avecPiscine;

    public Villa(int id, personne reponsable, String adresse, int surface, int nbpieces, boolean avecPiscine) {
        super(id, reponsable, adresse, surface, nbpieces);
        this.avecPiscine = avecPiscine;
    }

    public boolean isAvecPiscine() {
        return avecPiscine;
    }

    public void setAvecPiscine(boolean avecPiscine) {
        this.avecPiscine = avecPiscine;
    }

    public String toString() {
        return super.toString() + ", avecPiscine: " + avecPiscine;
    }

    private double calculImpot() {
        
        
    
}

}
