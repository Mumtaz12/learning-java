package Section06.Point;

public class Point {
    private int x;
    private int y;

    public Point() {

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        double d = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        return d;
    }

    public double distance(int x, int y) {
        double d = Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
        return d;
    }

    public double distance(Point xy) {
        double d = Math.sqrt(Math.pow(xy.x - this.x, 2) + Math.pow(xy.y - this.y, 2));
        return d;
    } 

}
