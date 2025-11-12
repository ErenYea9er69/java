package Collection;

public class AssietteRonde extends Assiette {
    private double rayon;
    
    public AssietteRonde(int annee, double rayon) {
        super(annee);
        this.rayon = rayon;
    }
    
    
    public double surface() {
        return 3.14 * rayon * rayon;
    }
    
    public double valeur() {
       int age = 2025 - annee;
        if (age < 50) {
            return 0;
        }
        return age - 50;
    }
}
