package jeux;

public class sortileges extends Carte {

    public String nom;
    public String description;


    public sortileges(int cout, String nom, String description) {
        super(cout);
        this.nom = nom;
        this.description = description;

    }

    public String toString() {
        return " [nom=" + nom + ", description=" + description + "]";
    }
    
}
