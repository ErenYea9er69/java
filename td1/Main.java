package td1;


public class Main {
    public static void main(String[] args) {
        Dictionnaire d = new Dictionnaire("dictionnaire", 3);
        Mot_dict m1 = new Mot_dict("salem", "3aslema");
        Mot_dict m2 = new Mot_dict("rise", "9oum 3al sbe7");
        Mot_dict m3 = new Mot_dict("bed", "win nor9dou");
        d.Ajouter_mot(m1);

        d.Ajouter_mot(m2);

        d.Ajouter_mot(m3);

        d.Trier();
        d.Lister_dictionnaire();

        d.Supprimer_mot(m2);
        d.Lister_dictionnaire();    

    }
    
}
