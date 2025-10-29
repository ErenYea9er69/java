package jeux;


public class main {

    public static void main(String[] args) {
        jeu maMain = new jeu();
        terrains t = new terrains("B");
        maMain.ajouterCarte(t);
        creatures c = new creatures(6, " Gobelin", 4, 6);
        maMain.ajouterCarte(c);
        sortileges s = new sortileges(1, "Amplificatum",  "Il augmente la taille de l'objet ou de 'animal visé");
        maMain.ajouterCarte(s);
        System.out.println("La j'ai en stock :");
        maMain.affiche();
        maMain.jouer();
        maMain.jouer();
    
}

}
