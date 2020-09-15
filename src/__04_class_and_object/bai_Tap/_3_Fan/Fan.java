package __04_class_and_object.bai_Tap._3_Fan;

public class Fan {

    // final:

    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // properties:

    private int Speed = SLOW;
    private boolean on  = false;
    private double radius = 5;
    private String color = "blue";

    //constructor:

    public Fan() {

    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.Speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // get and set:


    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

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
    public void showInFor(){
        System.out.println(this.toString());
    }
    @Override
    public String toString() {
        if(on) {
            return "Fan{" +
                    "Speed=" + Speed +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}'+" => Fan is on";

        } else {
            return "Fan{" +
                    "Speed=" + Speed +
                    ", on=" + on +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}'+ " => Fan is Off ";
        }
    }
}
