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

package Day8Assignment;
import java.util.Scanner;
import Day8Assignment.Line;
import Day8Assignment.Point;

public class LineComparisonProblem {
    public static void main(String[] args){

            Scanner scanner = new Scanner(System.in);
            double[] A = new double[4];
            double[] B = new double[4];

            System.out.println("Input the value of X co ordinate of Point1");
            A[0] = scanner.nextDouble();
            System.out.println("Input the value of Y co ordinate of Point1");
            B[0] = scanner.nextDouble();

            System.out.println("Input the value of X co ordinate of Point2");
            A[1] = scanner.nextDouble();
            System.out.println("Input the value of Y co ordinate of Point2");
            B[1] = scanner.nextDouble();

            System.out.println("Input the value of X co ordinate of Point3");
            A[2] = scanner.nextDouble();
            System.out.println("Input the value of Y co ordinate of Point3");
            B[2] = scanner.nextDouble();

           System.out.println("Input the value of X co ordinate of Point4");
           A[3] = scanner.nextDouble();
           System.out.println("Input the value of Y co ordinate of Point4");
           B[3] = scanner.nextDouble();

            Point p1 = new Point(A[0], B[0]);
            Point p2 = new Point(A[1], B[1]);
            Point p3 = new Point(A[2], B[2]);
            Point p4 = new Point(A[3], B[3]);

            Line l1 = new Line(p1, p2);
            Line l2 = new Line(p3, p4);

            equals(l1, l2);
            compareTo(l1, l2);

    }
    public static void equals(Line l1, Line l2){

        if (l1.lineLength() == l2.lineLength()){
            System.out.println("Both the lines are equal in length");
        }

        else{
            System.out.println("The lines are not equal in length");
        }
    }

    public static void compareTo(Line l1, Line l2){
        if (l1.lineLength() > l2.lineLength()){
            System.out.println("The First Line is longer than the Second Line ");
        }
        else if (l2.lineLength() > l1.lineLength()){
            System.out.println("The Second Line is longer than the First line ");
        }
        else{
            System.out.println("Both the lines are equal in length");
        }
    }
}
