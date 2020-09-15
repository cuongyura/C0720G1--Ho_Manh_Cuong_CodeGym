package __04_class_and_object.thuc_hanh.__Lop_Chu_Nhat;

public class Rectangle {

     // properties:
     private double wight;
     private double height;

     // constructor:


    public Rectangle() {
    }

    public Rectangle(double wight, double height) {
        this.wight = wight;
        this.height = height;
    }

    public double getWight() {
        return wight;
    }

    public void setWight(double wight) {
        this.wight = wight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return this.wight * this.height;
    }

    public double getPerimeter(){
        return (this.wight + this.height)/2;
    }

    public void display(){
        System.out.println(this.toString());
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "wight=" + wight +
                ", height=" + height +
                '}';
    }
}
