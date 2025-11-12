package ds23;

public class Pepiniere {

    private Plante[] iventaire ;
    static final int MAX_PLANTES = 100;
    private int nbPlantes;

    public Pepiniere() {
        this.iventaire = new Plante[MAX_PLANTES];
        this.nbPlantes = 0;
    }

    public void ajouterPlante(Plante p) {
        if (nbPlantes < MAX_PLANTES) {
            iventaire[nbPlantes] = p;
            nbPlantes++;
        } else {
            System.out.println("error max");
        }
    }

    public void afficherInventaire() {
        for (int i = 0; i < nbPlantes; i++) {
            iventaire[i].description();
        }
    }

    public double totalCO2Absorbe() {
        double t = 0;
        for (int i = 0; i < nbPlantes; i++) {
            if (iventaire[i] instanceof Arbre) {
                Arbre arbre = (Arbre) iventaire[i];
                t += arbre.AbsorberCO2(arbre.getHauteur());
            }
        }
        return t;
    }

    public int compterArbresCaduques(){
        int count = 0;
        for (int i = 0; i < nbPlantes; i++){
            if (iventaire[i] instanceof Arbre){
                Arbre arbre = (Arbre) iventaire[i];
                if (arbre.getType_Feuillage().equals("caduque")){
                    count++;
                }
            }
        }
        return count;
    }





    
}
