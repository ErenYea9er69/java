package persone;

public class LotissementPrivee extends Lotissement {

    public LotissementPrivee(int capacite) {
        super(capacite);
    }

    public boolean ajouter(propriete p) {
        if (p instanceof ProprietePrivee) {
            return super.ajouter(p);
        }
        return false;
    }

    public ProprietePrivee getproprieteByIndex(int i) {
        if (i >= 0 && i < nombre && tabProp[i] instanceof ProprietePrivee) {
            return (ProprietePrivee) tabProp[i];
        }
        return null;
    }

    public int getnbPieces() {
        return super.getnbPieces();
    }
}