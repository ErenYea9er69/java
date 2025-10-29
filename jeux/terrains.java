package jeux;

public class terrains extends Carte {

    private String color;

    
    public terrains(String color) {

        super(0);
        switch (color) {
            case "r":
                this.color = "Rouge";
                break;
            case "B":
                this.color = "blanc";
                break;
            case "V":
                this.color = "Vert";
                break;
            case "b":
                this.color = "bleu";
                break;
            default:
                this.color = "Inconnu";
                break;
        
    }
}

    

public String toString() {
    return "cout"+ super.getcout() + "color" + color;}

}