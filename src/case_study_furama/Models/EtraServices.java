package case_study_furama.Models;

public class EtraServices {

    // properties:
    private String nameServiceGoWith;
    private String unit;
    private double priceMoney;

    // method constructor:


    public EtraServices() {
    }

    public EtraServices(String nameServiceGoWith, String unit, double priceMoney) {
        this.nameServiceGoWith = nameServiceGoWith;
        this.unit = unit;
        this.priceMoney = priceMoney;
    }

    // get and set:


    public String getNameServiceGoWith() {
        return nameServiceGoWith;
    }

    public void setNameServiceGoWith(String nameServiceGoWith) {
        this.nameServiceGoWith = nameServiceGoWith;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getPriceMoney() {
        return priceMoney;
    }

    public void setPriceMoney(double priceMoney) {
        this.priceMoney = priceMoney;
    }

    @Override
    public String toString() {
        return "EtraServices{" +
                "nameServiceGoWith='" + nameServiceGoWith + '\'' +
                ", unit='" + unit + '\'' +
                ", priceMoney=" + priceMoney +
                '}';
    }
}
