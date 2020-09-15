package __04_class_and_object.bai_Tap._1_QuadraticEquation;

public class QuadraticEquation {

    // properties:

    private double a;
    private double b;
    private double c;

    // constructor:


    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    // get and set:


    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant(double a, double b, double c){
        double delta = b*b - 4*a*c;
        return delta;
    }

    public double getRoot1(){
       double r1 = (-b + Math.sqrt(getDiscriminant(a,b,c)))/2*a;
       return r1;
    }

    public double getRoot2(){
        double r2 = (-b - Math.sqrt(getDiscriminant(a,b,c)))/2*a;
        return r2;
    }

    @Override
    public String toString() {
        return "QuadraticEquation{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
