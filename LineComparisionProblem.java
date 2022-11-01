package Day8Assignment;
public class Point{

     double x;
     double y;

        Point(double x, double y){
        this.x = x;
        this.y = y;
    }
}


package Day8Assignment;
import Day8Assignment.Point;
public class Line{

    Point p1;
    Point p2;
    private double lineDistance;

          Line(Point p1, Point p2){
          this.p1 = p1;
          this.p2 = p2;
    }

    public double lineLength(){
        lineDistance = Math.pow(Math.pow(p1.x - p2.x, 2) + Math.pow( p1.y - p2.y, 2), 0.5);
        return lineDistance;
    }
}
