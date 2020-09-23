package case_study_furama.Models;

public class Villa extends Services{
    // properties:
    private String standrdRoom;
    private String descriptionConvent;
    private double areaPool;
    private int numberFloors;

    // method constructor:

    public Villa() {
    }

    public Villa(String id, String fullName, double areaUse, double rentalCosts, int maximumPeoples, String rentalType, String standrdRoom, String descriptionConvent, double areaPool, int numberFloors) {
        super(id, fullName, areaUse, rentalCosts, maximumPeoples, rentalType);
        this.standrdRoom = standrdRoom;
        this.descriptionConvent = descriptionConvent;
        this.areaPool = areaPool;
        this.numberFloors = numberFloors;
    }

    // get and set properties of villa:


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

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
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
        return "Villa{" +
                "standrdRoom='" + standrdRoom + '\'' +
                ", descriptionConvent='" + descriptionConvent + '\'' +
                ", areaPool=" + areaPool +
                ", numberFloors=" + numberFloors +
                '}' + super.toString();
    }
}
