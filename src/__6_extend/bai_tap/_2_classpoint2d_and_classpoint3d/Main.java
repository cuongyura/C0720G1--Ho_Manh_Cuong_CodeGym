package __6_extend.bai_tap._2_classpoint2d_and_classpoint3d;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please input x: ");
        float x = sc.nextFloat();
        System.out.println("Please input y: ");
        float y = sc.nextFloat();
        System.out.println("Please input z: ");
        float z = sc.nextFloat();
        Point2D point2D = new Point2D(x,y);
        System.out.println(Arrays.toString(point2D.getXY()));
        System.out.println(point2D.toString());
        Point3D point3D = new Point3D(x,y,z);
        System.out.println(point3D.toString());
    }
}
