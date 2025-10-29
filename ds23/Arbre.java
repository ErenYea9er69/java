package ds23;

public class Arbre extends Plante {
    private String type_Feuillage;
    private final double AbsorMoyenne = 22;

    public Arbre(String nom, int hauteur, int age, double prix, String type_Feuillage) {
        super(nom, hauteur, age, prix);
        this.type_Feuillage = type_Feuillage;
    }
    
    public void description(){
        System.out.println(super.toString() + " Arbre [type_Feuillage=" + type_Feuillage + "]");
    }
    
    public String getType_Feuillage() {
        return type_Feuillage;
    }

    public double AbsorberCO2(int hauteur){
        if (hauteur > 50){
            return AbsorMoyenne + 3;
        } else {
            return AbsorMoyenne;
        }
    }
}
