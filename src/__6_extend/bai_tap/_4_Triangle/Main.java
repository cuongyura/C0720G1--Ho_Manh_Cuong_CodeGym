package __6_extend.bai_tap._4_Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a: ");
        double a = sc.nextDouble();
        System.out.println("Nhập b: ");
        double b = sc.nextDouble();
        System.out.println("Nhập c: ");
        double c = sc.nextDouble();
        Triangle triangle = new Triangle(a,b,c);
        if((a + b) > c && (a + c) > b && (b + c > a) && ( a > 0) && b > 0 && c > 0){
            System.out.println(triangle.toString()+"\n -> Là ba cạnh của tam giác");
            if((a==b) && (b==c) && (c==a)){
                System.out.println(" Đây là tam giac đều: ");
                System.out.println("Chu vi là: "+"\n"+triangle.getPerimeterEquilateralTriangle());
                System.out.println("Diện tích là: "+"\n"+triangle.getAreaEquilateralTriangle());

            }else if((a==b) || (b==c) || (a == c)){
                System.out.println(" Đây là tam giác cân: ");
                System.out.println("Chu vi là: "+"\n"+triangle.getPerimeterIsoscelesTriangle());
                System.out.println("Diện tích là: "+"\n"+triangle.getAreaIsoscelesTriangle());
            }else if((a*a == b*b+c*c) || (b*b == a*a + c*c) || (c*c == a * a + b*b) ){
                System.out.println("Đây là tam giác vuông");
                System.out.println("Chu vi là: "+"\n"+triangle.getPerimeterRightTriangle());
                System.out.println("Diện tích là: "+"\n"+triangle.getAreaRightTriangle());
            }else {
                System.out.println("Đây là tam giác thường");
                System.out.println("Chu vi là: "+"\n"+triangle.getPerimeterTrianglesOften());
                System.out.println("Diện tích là: "+"\n"+triangle.getAreaTrianglesOften());

            }
        }else {
            System.out.println("{ "+a+", "+b+", "+c+", "+" }"+"\n -> không hợp lệ");
        }

    }
}
