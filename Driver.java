package Module2;

import java.awt.geom.Point2D;

public class Driver {
    public static void main(String[] args) {
        Point2D p1 = new myPoint2D(3, 5);
        Point2D p2 = new myPoint2D(3, 5);
        Point2D p3 = new myPoint2D(8, 9);
        Point2D p4 = new myPoint2D(2, 0);
        Point2D p5 = new myPoint2D(15, 15);
        Point2D[] myPoints = {p1, p2, p3, p4, p5};
        findDistances(myPoints);
        
    }
    
    public static void findDistances(Point2D[] points) {
        double dist;
        int length = points.length;
        for(int i=0; i<length; i++) {   
            for(int j=0; j<length; j++) {
                if(!points[i].equals(points[j])) {
                    dist = points[i].distance(points[j]);
                    if(dist < 10) {
                        System.out.println("The distance between " + points[i] + " and " + points[j] + " is " + dist + ".");
                    }
                }
            }
        }
    }
}
