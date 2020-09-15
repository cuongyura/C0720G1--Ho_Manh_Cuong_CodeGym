package __04_class_and_object.bai_Tap._3_Fan;

public class Main {

    public static void main(String[] args) {

    // Create an object Fan:

     Fan fan = new Fan(Fan.FAST,true,10,"yellow");
     Fan fan1 = new Fan(Fan.MEDIUM,false,10,"yellow");

     fan.showInFor();

     fan1.showInFor();

    }
}
