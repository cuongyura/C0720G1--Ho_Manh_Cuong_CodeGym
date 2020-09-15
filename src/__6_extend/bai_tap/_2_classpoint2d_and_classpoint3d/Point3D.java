package __6_extend.bai_tap._2_classpoint2d_and_classpoint3d;

public class Point3D extends Point2D {
    // properties:

    private float z = 0.0f;

    // constructor method:

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    // get and set:


    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ(){

        return new float[]{this.getX(),this.getY(),z};
    }




    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                '}'+super.toString();
    }
}
