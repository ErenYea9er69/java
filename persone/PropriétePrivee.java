package persone;

public class PropriétePrivee extends propriete {
    private int nbpieces;


    public PropriétePrivee(int id, personne reponsable, String adresse, int surface, int nbpieces) {
        super(id, reponsable, adresse, surface);
        this.nbpieces = nbpieces;
    }
    



   
    
}
