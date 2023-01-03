//Jason Buras Problem 3: Point 2D
public class Point2D {
    private double x;
    private double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point2D other) {
        return Math.sqrt((this.x - other.getX()) * (this.x - other.getX()) + (this.y - other.getY()) * (this.y - other.getY()));
    }

    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public void moveBy(double dx, double dy){
        this.x += dx;
        this.y += dy;
    }

    public void moveTo(double x, double y){
        this.x=x;
        this.y=y;
    }

    public String toString(){
        return String.format("(%.1f,%.1f)", x,y);

    }

}