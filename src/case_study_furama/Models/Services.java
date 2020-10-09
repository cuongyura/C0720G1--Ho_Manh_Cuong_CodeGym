package case_study_furama.Models;

public abstract class Services {
    // properties:
    private String id;
    private String fullName;
    private double areaUse;
    private double rentalCosts;
    private int maximumPeoples;
    private String rentalType;

    // method constructor:

    public Services() {
    }

    public Services(String id, String fullName, double areaUse, double rentalCosts, int maximumPeoples, String rentalType) {
        this.id = id;
        this.fullName = fullName;
        this.areaUse = areaUse;
        this.rentalCosts = rentalCosts;
        this.maximumPeoples = maximumPeoples;
        this.rentalType = rentalType;
    }

    // get and set properties:


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getAreaUse() {
        return areaUse;
    }

    public void setAreaUse(double areaUse) {
        this.areaUse = areaUse;
    }

    public double getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(double rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public int getMaximumPeoples() {
        return maximumPeoples;
    }

    public void setMaximumPeoples(int maximumPeoples) {
        this.maximumPeoples = maximumPeoples;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    public abstract void showInFor();

    @Override
    public String toString() {
        return "Services{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", areaUse=" + areaUse +
                ", rentalCosts=" + rentalCosts +
                ", maximumPeoples=" + maximumPeoples +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}
