package jeux;

public class creatures extends Carte {

    private String nom;
    private int nbpointvie;
    private int nbpointdegat;


    public creatures(int cout,String nom, int nbpointvie, int nbpointdegat) {
         super(cout);
        this.nom = nom;
        this.nbpointvie = nbpointvie;
        this.nbpointdegat = nbpointdegat;

    }

    public String toString() {
        return " [nom=" + nom + ", nbpointvie=" + nbpointvie + ", nbpointdegat=" + nbpointdegat + "]";
    }

    
}
