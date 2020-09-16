package __7_abtractclass_and_interface.thuc_Hanh._2_Comparable;

import __6_extend.bai_tap._1_classcircle_and_classcynlinder.Circle;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    private boolean filled;
    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color);
        this.filled = filled;
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 1;
    }

}
