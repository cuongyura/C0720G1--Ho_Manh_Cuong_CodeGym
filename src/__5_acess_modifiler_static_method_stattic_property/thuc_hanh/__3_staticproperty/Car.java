package __5_acess_modifiler_static_method_stattic_property.thuc_hanh.__3_staticproperty;

public class Car {
    private String name;

    private String engine;



    public static int numberOfCars;



    public Car(String name, String engine) {

        this.name = name;

        this.engine = engine;

        numberOfCars++;

    }



    // getters and setters


}


