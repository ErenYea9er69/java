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

    public void setMot(String mot) {
        this.mot = mot;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public boolean synonyme(String mot) {
        return this.mot.equalsIgnoreCase(mot);
    }

    public Boolean equals(Mot_dict a) {
        return (mot.equals(a.mot) && definition.equals(a.definition));
    }

    @Override
    public String toString() {
        return "Mot: " + mot + ", Definition: " + definition;
    }
}
