package case_study_furama.Models;

public class House extends Services {
    // properties:
    private String standrdRoom;
    private String descriptionConvent;
    private int numberFloors;

    // method constructor:

    public House() {
    }

    public House(String id, String fullName, double areaUse, double rentalCosts, int maximumPeoples, String rentalType, String standrdRoom, String descriptionConvent, int numberFloors) {
        super(id, fullName, areaUse, rentalCosts, maximumPeoples, rentalType);
        this.standrdRoom = standrdRoom;
        this.descriptionConvent = descriptionConvent;
        this.numberFloors = numberFloors;
    }

    // get and set of House:

    public String getStandrdRoom() {
        return standrdRoom;
    }

    public void setStandrdRoom(String standrdRoom) {
        this.standrdRoom = standrdRoom;
    }

    public String getDescriptionConvent() {
        return descriptionConvent;
    }

    public void setDescriptionConvent(String descriptionConvent) {
        this.descriptionConvent = descriptionConvent;
    }

    public int getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(int numberFloors) {
        this.numberFloors = numberFloors;
    }

    @Override
    public void showInFor() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "House{" +
                "standrdRoom='" + standrdRoom + '\'' +
                ", descriptionConvent='" + descriptionConvent + '\'' +
                ", numberFloors=" + numberFloors +
                '}'+ super.toString();
    }
}
