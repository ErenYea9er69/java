package persone;

public class personne {
    protected int cin;
    protected String nom;
    protected String prenom;

    public personne(int cin, String nom, String prenom) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
    }
     public String getnom() {
        return nom;
     }
     public String getprenom() {
        return prenom;
     }
     public int getcin() {
        return cin;
     }

     public void setnom( String nom) {
        this.nom = nom;
     }
        public void setprenom( String prenom) {
            this.prenom = prenom;
        }
        public void setcin( int cin) {
            this.cin = cin;
        }

    public String toString() {
        return "cin: " + cin + ", nom: " + nom + ", prenom: " + prenom; 

    }
    
}
