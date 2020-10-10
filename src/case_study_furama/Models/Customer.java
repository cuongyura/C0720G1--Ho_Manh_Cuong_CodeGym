package case_study_furama.Models;

import org.w3c.dom.ls.LSOutput;

public class Customer implements Comparable<Customer> {
    // properties:

    private String nameCustomer;
    private String dayOfBirth;
    private String gender;
    private String idCard;
    private String phoneNumber;
    private String email;
    private String TypeCustomer;
    private String address;
    private Services useServices;

    // method constructor:

    public Customer() {
    }

    public Customer(String nameCustomer, String dayOfBirth, String gender, String idCard, String phoneNumber, String email, String typeCustomer, String address, Services useServices) {
        this.nameCustomer = nameCustomer;
        this.dayOfBirth = dayOfBirth;
        this.gender = gender;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        TypeCustomer = typeCustomer;
        this.address = address;
        this.useServices = useServices;
    }

    // get and set:


    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTypeCustomer() {
        return TypeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        TypeCustomer = typeCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Services getUseServices() {
        return useServices;
    }

    public void setUseServices(Services useServices) {
        this.useServices = useServices;
    }

    public void showInFor(){
         System.out.println(this.toString());
    }
    @Override
    public String toString() {
        return "Customer{" +
                "nameCustomer='" + nameCustomer + '\'' +
                ", dayOfBirth='" + dayOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", idCard='" + idCard + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", TypeCustomer='" + TypeCustomer + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
    @Override
    public int compareTo(Customer o) {
        int result = getNameCustomer().compareTo(o.getNameCustomer());
        if (result == 0) {
            //22/12/2000
            result = getDayOfBirth().substring(6,10).compareTo(o.getDayOfBirth().substring(6,10));
        }
        return result;
    }
}
