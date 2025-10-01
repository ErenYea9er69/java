public class Point {
    int abs;
    int ord;
    String nom;

    public Point() {
        this.abs =0;
        this.ord =0;
        this.nom ="";
    }

    public Point(String nom, int abs, int ord) {
        this.nom =nom;
        this.abs =abs;
        this.ord =ord;
    }

    public void Affiche() {
        System.out.println(nom + "("+abs +"," + ord +")");
    }

    public double Distance(Point p) {
        int dx =  this.abs -p.abs;
        int dy= this.ord- p.ord;
        return Math.sqrt(dx*dx + dy* dy);
    }
}
