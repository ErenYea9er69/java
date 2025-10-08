package td1;

public class Dictionnaire {

    private int nb_mots;
    private Mot_dict[] Dict;
    private String nom;

    public Dictionnaire(String nom, int nb_mots) {
        this.nom = nom;
        this.nb_mots = nb_mots;
        this.Dict = new Mot_dict[nb_mots];
    }

    void Ajouter_mot(Mot_dict m){
        if (nb_mots < 0){
            Dict[0]=m;

        }
        else{
            for (int i=0; i<nb_mots;i++){
                if (Dict[i]==null){
                    Dict[i]=m;
                    break;
                }
            }
        }

    }
    



void Trier(){
    for (int i=0; i<nb_mots-1;i++){
        for (int j=i+1; j<nb_mots;j++){
            if (Dict[i].getMot().compareTo(Dict[j].getMot())>0){
                Mot_dict t=Dict[i];
                Dict[i]=Dict[j];
                Dict[j]=t;
            }
        }
    }



}

void Supprimer_mot(Mot_dict a){
    for (int i=0; i<nb_mots;i++){

        if (Dict[i].synonyme(a.getMot()   )){
            Dict[i]=null;
            nb_mots--;
            break;
            
        }
    }


}

String Recherche_dicho(String mot){

    int i=0;
    int n=nb_mots-1;
    String s="";
    boolean t=false;
    while (n!=0 && t==false){
        if (Dict[i].getMot().equals(mot)){
            s=  Dict[i].getDefinition();
            t=true;
        }
        else{
            n--;
            i++;
        }
        

    }
    if (t==false){
        s="no mot";
    }
    return s;

}

void Lister_dictionnaire(){
    for (int i=0; i<Dict.length;i++){
        if (Dict[i]!=null){
            System.out.println(Dict[i].toString());
        }

    }






}

int Nombre_synonymes(Mot_dict a){
    int s=0;
    for (int i=0; i<nb_mots;i++){
        if (Dict[i].synonyme(a.getMot()   )){
            s++;
        }
    }
    return s;
        

    
}

}

