package persone;

public class Villa extends ProprietePrivee {
    private boolean avecPiscine;

    public Villa(int id, personne reponsable, String adresse, double surface, int nbpieces, boolean avecPiscine) {
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

    public double calculImpot() {
        double impot = super.calculImpot();
        if (avecPiscine) {
            impot += 200;
        }
        return impot;
    }
}