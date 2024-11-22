public class Point {
    public double x; 
    public double y;
    
    public Point(double x,  double y){
        this.x = x;
        this.y = y;
    }
    
    public static Point centerOfMass(Point[] points) {
        double sumx = 0;
        double sumy = 0;
        
        for (Point point: points) {
            sumx += point.x;
            sumy += point.y;
        }
        
        return new Point(sumx / points.length, sumy / points.length);
    }
    
    // Main method for testing
    public static void main(String[] args) {
        Point[] points = {
            new Point(1,  2), 
            new Point(3,  4), 
            new Point(5,  6)
        };

        Point center = Point.centerOfMass(points);
        System.out.println("Center of Mass:  " + center);
    }
}

