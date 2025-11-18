package persone;

public class ProprieteProfessionnelle extends propriete {


    private int nbEmployes;
    private boolean estEtatique;

    public ProprieteProfessionnelle(int id, personne reponsable, String adresse, int surface, int nbEmployes, boolean estEtatique) {
        super(id, reponsable, adresse, surface);
        this.nbEmployes = nbEmployes;
        this.estEtatique = estEtatique;
    }
    public int getNbEmployes() {
        return nbEmployes;
    }
    

}
