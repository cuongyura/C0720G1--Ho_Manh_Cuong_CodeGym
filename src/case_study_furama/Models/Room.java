package case_study_furama.Models;

public class Room extends Services {
    // properties:
    private EtraServices ServiceFree;

    // method constructor:


    public Room(String id, String fullName, double areaUse, double rentalCosts, int maximumPeoples, String rentalType, EtraServices serviceFree) {
        super(id, fullName, areaUse, rentalCosts, maximumPeoples, rentalType);
        ServiceFree = serviceFree;
    }

    public Room() {

    }

    // get and set properties :


    public EtraServices getServiceFree() {
        return ServiceFree;
    }

    public void setServiceFree(EtraServices serviceFree) {
        ServiceFree = serviceFree;
    }

    @Override
    public void showInFor() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Room{" +
                "ServiceFree=" + ServiceFree +
                '}' + super.toString();
    }
}
