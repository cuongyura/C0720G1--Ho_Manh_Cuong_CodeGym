package __7_abtractclass_and_interface.thuc_Hanh._3_delpoyment_comparator;

import __6_extend.bai_tap._1_classcircle_and_classcynlinder.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {


    @Override
    public int compare(Circle c1, Circle c2) {
        if (c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
    }
}
