package __6_extend.bai_tap._3_classpoint_and_moveablepoint;

public class Point {

    // properties:

    protected float x = 0.0f;
    protected float y = 0.0f;

    // constructor method:


    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // get and set:


    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY(){

        return new float[]{this.x,this.y};
    }

    // to string():

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
