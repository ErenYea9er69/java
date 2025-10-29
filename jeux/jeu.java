package jeux;

public class jeu {

    private Carte[] TabCartes;
    private int max=100;
    private int nb;


    public void ajouterCarte(Carte c) {
        if (nb < max) {
            TabCartes[nb] = c;
            nb++;
        }
        else {
            System.out.println(" plein");
        }
    }

    public void jouer(){

        for (int i=0; i<nb; i++){
            if (TabCartes==null){
                
            
            if (TabCartes[i] instanceof terrains) {
                 terrains t = (terrains)TabCartes[i];
                    System.out.println("terrains: " + t.toString());
            }
            if (TabCartes[i] instanceof sortileges) {
                 sortileges s = (sortileges)TabCartes[i];
                    System.out.println("sortileges: " + s.toString());
            }
            if (TabCartes[i] instanceof creatures) {
                 creatures s = (creatures)TabCartes[i];
                    System.out.println("creatures: " + s.toString());
            }
            for(int j=nb-1; j>i; j--){
                TabCartes[j]=TabCartes[j-1];

            }
            TabCartes[nb-1]=null;
            nb--;
        }
        }


    }

    public void affiche(){
        for (int i=0; i<nb; i++){
            if (TabCartes[i] instanceof terrains) {
                 terrains t = (terrains)TabCartes[i];
                    System.out.println("terrains: " + t.toString());
            }
            if (TabCartes[i] instanceof sortileges) {
                 sortileges s = (sortileges)TabCartes[i];
                    System.out.println("sortileges: " + s.toString());
            }
            if (TabCartes[i] instanceof creatures) {
                 creatures s = (creatures)TabCartes[i];
                    System.out.println("creatures: " + s.toString());
            }
    }







    
}}
