package persone;

public interface GestionPropriete {
    int MAX_PROPRIETES = 100;

    void afficherProprietes();

    boolean ajouter(propriete p);

    boolean supprimer(propriete p);
}