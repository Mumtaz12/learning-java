package Experimenting;

public class LinearInterpolation {

    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public LinearInterpolation(double x1, double y1, double x2, double y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getY(double x){
        return y1 + (x -x1)/(x2-x1) * (y2-y1);
    }
}

// rules
// x1 <= x <= x2
// y1 <= y <= y2