package Collection;

class AssietteCarree extends Assiette {
    private double cote;
    
    public AssietteCarree(int annee, double cote) {
        super(annee);
        this.cote = cote;
    }

    public double surface() {
        return  cote * cote;
    }

    public double valeur() {
        int age = 2025 - annee;
        if (age < 50) {
            return 0;
        }
        return (age - 50)*5;
    }
    
}
