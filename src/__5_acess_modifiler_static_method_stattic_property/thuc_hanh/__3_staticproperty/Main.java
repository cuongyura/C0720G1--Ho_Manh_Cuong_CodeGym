package __5_acess_modifiler_static_method_stattic_property.thuc_hanh.__3_staticproperty;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Mazda 3","Skyactiv 3");

        System.out.println(Car.numberOfCars);

        Car car2 = new Car("Mazda 6","Skyactiv 6");

        System.out.println(Car.numberOfCars);

    }
}
