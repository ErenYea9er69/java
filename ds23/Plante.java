package ds23;

public class Plante {
    private String nom;
    private int hauteur;
    private int age;  
    private double prix;  

    public Plante(String nom, int hauteur, int age, double prix) {
        this.nom = nom;
        this.hauteur = hauteur;
        this.age = age;
        this.prix = prix;
    }
    
    public int getHauteur() {
        return hauteur;
    }

    public String toString() {
        return "Plante [nom=" + nom + ", hauteur=" + hauteur + ", age=" + age + ", prix=" + prix + "]";
    }

    public void description(){
        System.out.println(toString());
    }
}
