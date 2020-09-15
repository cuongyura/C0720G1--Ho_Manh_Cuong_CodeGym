package __6_extend.bai_tap._3_classpoint_and_moveablepoint;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(5.5f,4.5f,10.5f,9.5f);
        System.out.println(moveablePoint.toString());
        System.out.println(moveablePoint.movablePoint());

    }
}
