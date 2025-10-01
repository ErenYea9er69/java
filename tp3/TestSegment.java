

public class TestSegment {
    public static void main(String[] args) {
        Point A = new Point("A",0, 0);
        Point B = new Point("B",4, 0);
        Segment s1 = new Segment(A, B);

        System.out.println("seg s1:" + s1.toString());
        System.out.println("long " + s1.Longueur());

        Point C = new Point("C", 2, 0);
        System.out.print("point C apartin a seg s ?");
        System.out.println(s1.Appartient(C));

        s1.translaterSeg(1, 2);
        System.out.println("seg s1 ap trans" + s1.toString());
    }
}
