package __6_extend.bai_tap._1_classcircle_and_classcynlinder;

public class Cylinder extends Circle {

    // properties:
    private double height;

    // method constructor:

    public Cylinder() {

    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }



    // get and set:


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double volumeCylinder(){
        return Math.PI*this.getRadius()*this.getRadius()*this.height;

    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                '}'+super.toString();
    }
}
