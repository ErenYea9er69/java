package td1;

public class Mot_dict {
    private String mot;
    private String definition;

    public Mot_dict(String mot, String definition) {
        this.mot = mot;
        this.definition = definition;
    }

    public String getMot() {
        return mot;
    }

    public String getDefinition() {
        return definition;
    }

    public String setMot(String a){
        return definition=a;
    }
    public String setDefinition(String a){
        return mot=a;
    }

    public Boolean synonyme(String a) {
        return (mot.equals(a));
    }

    @Override
    public String toString() {
        return "Mot_dict{" + "mot='" + mot +'\'' +", definition='" + definition + '\'' + '}';




    
}
}
