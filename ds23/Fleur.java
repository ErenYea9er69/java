package ds23;

public class Fleur extends Plante {

    private String couleur;
    private int moisF;

    public Fleur(String nom, int hauteur, int age, double prix, String couleur, int moisF) {

        super(nom, hauteur, age, prix);
        this.couleur = couleur;
        this.moisF = moisF;
    }
    public void description(){
        System.out.println(super.toString() + " Fleur [couleur=" + couleur + ", moisF=" + moisF + "]");

    }


    public void fleurir(){
        if (moisF==1 || moisF==2 || moisF==3){
            System.out.println("la fleur est en fleur");
        }
        else {
            System.out.println("la fleur n'est pas en fleur");
        }
    }






    
}
