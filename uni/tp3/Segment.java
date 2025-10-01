
public class Segment {
    Point seg1;
    Point seg2;

    public Segment() {
        this.seg1 =new Point();
        this.seg2= new Point();
    }



    public Segment(Point p1, Point p2) {
        this.seg1= p1;
        this.seg2 = p2;
    }



    public String toString() {
        return "["+seg1.nom +"(" + seg1.abs + ", " + seg1.ord +")"+
        seg2.nom + " (" + seg2.abs +"," +seg2.ord +")]";
    }




    public double Longueur() {
        return seg1.Distance(seg2);
    }

    public boolean Appartient(Point p) {
        double d1 =seg1.Distance(p);
        double d2= seg2.Distance(p);
        double d =Longueur();
        return Math.abs((d1 + d2)-d) < 0.0001;
    }


    public void translaterSeg(int a, int b) {
        seg1.abs +=a;
        seg1.ord +=b;
        seg2.abs+= a;
        seg2.ord+= b;
    }
}
