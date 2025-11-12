package Collection;

abstract class Ustensile {
    protected int annee;
    
    public Ustensile(int annee) {
        this.annee = annee;
    }

    public double valeur() {
        int age = 2025 - annee;
        if (age < 30) {
            return 0;
        }
        return (age - 30)*2;
    }

    
}