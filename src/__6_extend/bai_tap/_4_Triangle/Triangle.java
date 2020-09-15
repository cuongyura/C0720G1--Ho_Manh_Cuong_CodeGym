package __6_extend.bai_tap._4_Triangle;

import java.util.Scanner;

public class Triangle {

    Scanner sc = new Scanner(System.in);
    // Thuộc tính:

    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    // Hàm khởi tạo:
    public Triangle(){

    }
    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // geter, set ter:
    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }


    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }


    // chu vi và diện tích tam giác thường:

    public double getPerimeterTrianglesOften(){
        return side1+side2+side3;
    }
    public double getAreaTrianglesOften(){
        System.out.println(" Mời bạn nhập vào chiều cao: ");
        double height = sc.nextDouble();
        return (side1*height)/2;
    }
    // chu vi và diện tích tam giác vuông:

    public double getPerimeterRightTriangle(){
        System.out.println(" Mời bạn nhập vào chiều cao: ");
        double height = sc.nextDouble();
        return side1+side2+height;
    }
    public double getAreaRightTriangle(){
        return (side1+side2)/2;
    }
    // chu vi và diện tích tam giác đều:
    public double getPerimeterEquilateralTriangle(){
        return side1*3;
    }

    public double getAreaEquilateralTriangle(){
        double a = Math.sqrt(3)/4;
        return side1*side1*a;
    }

    // chu vi và diện tích tam giác cân:

    public double getPerimeterIsoscelesTriangle(){
        return side1*2+side3;
    }
    public double getAreaIsoscelesTriangle(){
        System.out.println(" Mời bạn nhập vào chiều cao: ");
        double height = sc.nextDouble();
        return (side1*height)/2;
    }

    @Override
    public String toString() {
        return  "   side1 = " + side1 +
                " , side2 = " + side2 +
                " , side3 = " + side3;
    }
}
