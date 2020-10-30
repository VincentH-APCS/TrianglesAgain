public class Tester{
  public static void main(String[] args){
      Point P1 = new Point(1,1);
      Point P2 = new Point(1,1);
      Point P3 = new Point(0,4);
      Point P4 = new Point(0,4);
      //System.out.println(P1.getX());
      //System.out.println(P1.getY());
      //System.out.println(P1.distanceTo(P2));
      System.out.println(P1.equals(P2));
      System.out.println(P3.equals(P4));
  }
}
