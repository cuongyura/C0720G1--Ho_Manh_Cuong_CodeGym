package __7_abtractclass_and_interface.thuc_Hanh._1_classanimal_and_interfaceedible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck - cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
