package Collection;


class Collection {

    public static void main(String[] args) {
        Ustensile[] us = new Ustensile[5];
        us[0] = new AssietteRonde(1926, 8.4);
        us[1] = new Cuillere(1881, 7.3);
        us[2] = new AssietteCarree(1935, 5.6);
        us[3] = new Cuillere(1917, 8.8);
        us[4] = new AssietteRonde(1837, 5.4);

        afficherCuilleres(us);
        afficherSurfaceAssiettes(us);
        afficherValeurTotale(us);
    }

    static void afficherCuilleres(Ustensile[] us) {
        int nb = 0;
        for (int i = 0; i < us.length; i++) {
            if (us[i] instanceof Cuillere) {
                nb++;
                    System.out.println(us[i]);
            }
        }
    }

    static void afficherSurfaceAssiettes(Ustensile[] us) {
        double somme = 0;
        for (int i = 0; i < us.length; i++) {
            if (us[i] instanceof AssietteCarree) {
                AssietteCarree assiette = (AssietteCarree) us[i];
                somme += assiette.surface();
            }
            if (us[i] instanceof AssietteRonde) {
                AssietteRonde assiette = (AssietteRonde) us[i];
                somme += assiette.surface();
            }

        }
    }

    static void afficherValeurTotale(Ustensile[] us) {
        double somme = 0;
        for (int i = 0; i < us.length; i++) {
              if (us[i] instanceof AssietteRonde) {
                AssietteRonde asr = (AssietteRonde) us[i];
                somme += asr.valeur();
            }
             if (us[i] instanceof AssietteCarree) {
                AssietteCarree asc = (AssietteCarree) us[i];
                somme += asc.valeur();
            }
             if (us[i] instanceof Cuillere) {
                Cuillere cu = (Cuillere) us[i];
                somme += cu.valeur();

        
        }
    }
}

}
