package __6_extend.bai_tap._1_classcircle_and_classcynlinder;

public class Circle {


    // properties:

    private double radius;
    private String color;
    private Circle  f;
    private boolean filled = true;

    // method constructor:


    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle(double radius) {
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    // get and set:


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // get area:

    public double areaCircle(){
        return this.radius*this.radius*Math.PI;
    }

    public double perimeterCircle(){
        return 2*this.radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
