public class Tester{
  public static void main(String[] args){
      Point P1 = new Point(1,1);
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
  }
}
