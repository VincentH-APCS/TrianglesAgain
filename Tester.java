//public class Tester{
  //public static void main(String[] args){
    /*  Point P1 = new Point(1,1);
      Point P2 = new Point(5,7);
      Point P3 = new Point(-2,-1);
      Triangle Delta = new Triangle(P1, P2, P3);
      Triangle Gamma = new Triangle(0,0,4,0,4,4);
      Triangle Omega = new Triangle(0.1,0.1,-1.9,0.1,-0.9,-1.63205);
     System.out.println(P1.distanceTo(P2));
      System.out.println(P3.distanceTo(P2));
      System.out.println(P1.distanceTo(P3));
      System.out.println(Delta.getPerimeter());
      System.out.println(Gamma.getPerimeter());
      System.out.println(Delta.getArea());
      System.out.println(Gamma.getArea());
      System.out.println(Delta.classify());
      System.out.println(Gamma.classify());
      System.out.println(Omega.classify());
      System.out.println(Delta.toString());
      System.out.println(Gamma.toString());
      System.out.println(Omega.toString());
      System.out.println(Delta.toString());
      Point TheNewVertex = new Point(1.1, 1.4);
      Delta.setVertex(2,TheNewVertex);
      Delta.setVertex(1,P3);
      System.out.println(Delta.toString()); */
//  }
//}
public class Tester {
    public static void main(String[] args) {
        int err = 0;
        Point p1 = new Point(1, 2);
        Point p2 = new Point(p1);
        Point p3 = new Point(8, 3);
        Point p4 = new Point(15, -3);
        Triangle t1 = new Triangle(p1, p3, p4);
        Triangle t2 = new Triangle(0, 0, 1, 0, 0, 1);
        Triangle t3 = new Triangle(0, 0, 4, 0, 2, 2 * Math.sqrt(3));

        err += check("p1.getX()", p1.getX(), 1.0);
        err += check("p2.getY()", p2.getY(), 2.0);
        err += check("p1.distanceTo(p3)", p1.distanceTo(p3), 7.0710678118654755);
        err += check("p1.equals(p2)", p1.equals(p2), true);
        err += check("p1.equals(p3)", p1.equals(p3), false);
        err += check("t1.getPerimeter()", t1.getPerimeter(), 31.156681016476867);
        err += check("t1.getPerimeter()", t1.getArea(), 24.499999999999975);
        err += check("t1.classify()", t1.classify(), "scalene");
        err += check("t2.classify()", t2.classify(), "isosceles");
        err += check("t3.classify()", t3.classify(), "equilateral");
        err += check("t3.toString()", t1.toString(), "v1(1.0, 2.0) v2(8.0, 3.0) v3(15.0, -3.0)");
        t2.setVertex(1, p4);
        err += check("t2.toString()", t2.toString(), "v1(0.0, 0.0) v2(15.0, -3.0) v3(0.0, 1.0)");

        if (err == 0) System.out.println("All good!");
        else if (err == 1) System.out.println("Uh oh... 1 error found.");
        else System.out.println("Uh oh... " + err + " errors found.");
    }

    public static int check(String name, Object actual, Object expected) {
        if (actual.equals(expected)) return 0;
        else {
            System.out.println("Failure on " + name + ": Expected \"" +
                                expected + "\", got \"" + actual + "\".");
            return 1;
        }
    }
}
