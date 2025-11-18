package persone;

public class Lotissement implements GestionPropriete {
    protected propriete[] tabProp;
    protected int nombre;

    public Lotissement(int capacite) {
        tabProp = new propriete[capacite];
        nombre = 0;
    }

    public propriete getproprieteByIndex(int i) {
        if (i >= 0 && i < nombre) {
            return tabProp[i];
        }
        return null;
    }

    public int getnbPieces() {
        int total = 0;
        for (int i = 0; i < nombre; i++) {
            if (tabProp[i] instanceof ProprietePrivee) {
                total += ((ProprietePrivee) tabProp[i]).getNbpieces();
            }
        }
        return total;
    }

    public void afficherProprietes() {
        for (int i = 0; i < nombre; i++) {
            System.out.println(tabProp[i].toString() + ", impot: " + tabProp[i].calculImpot() + " DT");
        }
    }

    public boolean ajouter(propriete p) {
        if (nombre >= tabProp.length) {
            return false;
        }
        for (int i = 0; i < nombre; i++) {
            if (tabProp[i].getId() == p.getId()) {
                return false;
            }
        }
        tabProp[nombre] = p;
        nombre++;
        return true;
    }

    public boolean supprimer(propriete p) {
        for (int i = 0; i < nombre; i++) {
            if (tabProp[i].getId() == p.getId()) {
                for (int j = i; j < nombre - 1; j++) {
                    tabProp[j] = tabProp[j + 1];
                }
                tabProp[nombre - 1] = null;
                nombre--;
                return true;
            }
        }
        return false;
    }

    public ProprietePrivee getMinImpot() {
        ProprietePrivee minProp = null;
        double minImpot = Double.MAX_VALUE;
        for (int i = 0; i < nombre; i++) {
            if (tabProp[i] instanceof ProprietePrivee) {
                double impot = tabProp[i].calculImpot();
                if (impot < minImpot) {
                    minImpot = impot;
                    minProp = (ProprietePrivee) tabProp[i];
                }
            }
        }
        return minProp;
    }
}