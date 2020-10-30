public class Triangle{
  private Point v1, v2, v3;
  public Triangle(Point a, Point b, Point c){
    v1 = a;
    v2 = b;
    v3 = c;
  }
  public Triangle(double x1, double y1, double x2, double y2,double x3, double y3){
    v1 = new Point(x1,y1);
    v2 = new Point(x2,y2);
    v3 = new Point(x3,y3);

  }

  public double getPerimeter(){
    return v1.distanceTo(v2) + v1.distanceTo(v3) + v3.distanceTo(v2);
  }
  public double getArea(){
    double s =(v1.distanceTo(v2) + v1.distanceTo(v3) + v3.distanceTo(v2)) / 2;
    return  Math.sqrt((s * (s - v1.distanceTo(v2)) *
                          (s - v1.distanceTo(v3)) *
                          (s - v2.distanceTo(v3))));

}
  public String classify(){
    double sl1 = Math.round(v1.distanceTo(v2) * 10000.0) / 10000.0;
    double sl2 = Math.round(v1.distanceTo(v3) * 10000.0) / 10000.0;
    double sl3 = Math.round(v3.distanceTo(v2) * 10000.0) / 10000.0;
    if(sl1 == sl2 && sl2 == sl3){
      return "equilateral";
    }
    else if(sl1 == sl2 || sl1 == sl3 || sl2 == sl3){
      return "isosceles";
    }
    else return "scalene";
}
  public String toString(){
    return ("v1("+ v1.getX()+ ", " + v1.getY() + ") v2(" + v2.getX()+ ", " +
    v2.getY() + ") v3(" + v3.getX()+ ", " + v3.getY() + ")");
  }
}
