package case_study_furama.Controllers;

import case_study_furama.Commons.ConvertUtils;
import case_study_furama.Commons.FileUtils;
import case_study_furama.Commons.StringUtils;
import case_study_furama.Commons.Validators;
import case_study_furama.Exceptions.*;
import case_study_furama.Models.*;

import java.util.*;

public class MainController {

    public static Scanner scanner = new Scanner(System.in);
    public static String VILLA = "villa";
    public static String HOUSE = "house";
    public static String ROOM = "room";
    public static String CUSTOMER = "customer";

    public static void main(String[] args) {
        displayMainMenu();
    }
    public static void displayMainMenu() {
        int choose = 0;
        do {
            System.out.println("1.\t Add New Services\n" +
                               "2.\tShow Services\n" +
                               "3.\tAdd New Customer\n" +
                               "4.\tShow Information of Customer\n" +
                               "5.\tAdd New Booking\n" +
                               "6.\tShow Information of Employee\n" +
                               "7.\tExit\n");
            System.out.println("Please input choose (1 - 7): ");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    addNewServices();
                    break;
                case 2:
                    showServices();
                    break;
                case 3:
                    addNewCustomer();
                    break;
                case 4:
                    showInformationOfCustomer();
                    break;
                case 5:
                    addNewBooking();
                    break;
                case 6:
                    showInformationOfEmployee();
                    break;
                case 7:
                    System.exit(0);
                    break;
            }
        } while (choose >= 1 && choose <= 7);
    }

    private static void showServices() {
        int choose = 0;
        do {
            System.out.println("1.\tShow all Villa\n" +
                    "2.\tShow all House\n" +
                    "3.\tShow all Room\n" +
                    "4.\tShow All Name Villa Not Duplicate\n" +
                    "5.\tShow All Name House Not Duplicate\n" +
                    "6.\tShow All Name Name Not Duplicate\n" +
                    "7.\tBack to menu\n" +
                    "8.\tExit\n");
            System.out.println("Please choose service to show: ");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    showAllService(VILLA);
                    break;
                case 2:
                    showAllService(HOUSE);
                    break;
                case 3:
                    showAllService(ROOM);
                    break;
                case 4:
                    showAllServiceNotDup(VILLA);
                    break;
                case 5:
                    showAllServiceNotDup(HOUSE);
                    break;
                case 6:
                    showAllServiceNotDup(ROOM);
                    break;
                case 7:
                     displayMainMenu();
                    break;
                case 8:
                    System.exit(0);
                    break;
            }
        } while (choose >= 1 && choose <= 8);

    }

    private static void showAllServiceNotDup(String fileName) {
        Set<String> setOfServices = new TreeSet<>();
        System.out.println("---------------------------------");
        System.out.println("List services not duplicate name: ");
        for (Services services : readAllServices(fileName)) {
            setOfServices.add(services.getFullName());

        }

        for (String name : setOfServices ) {
            System.out.println(name);
        }
    }


    private static void showAllService(String fileName) {

        List<Services> listServices = readAllServices(fileName);

        Services services = null;
        System.out.println("---------------------------------");
        System.out.println("List services: ");

        for (int i = 0; i < listServices.size(); i++ ) {
            services = listServices.get(i);
            System.out.println((i + 1)+". ");
            services.showInFor();

        }
        /*for (Services services : readAllServices(fileName)) {
            services.showInFor();

        }*/

        System.out.println("Show data complete!!! ... ");
    }


    public static List<Services> readAllServices(String fileName) {
        FileUtils.setFullPathFile(fileName);
        List<String> propertiesServices = FileUtils.readFile();
        List<Services> listOfServices = new ArrayList<>();
        String[] propertiesElement = null;
        Services services = null;
        for (String properties : propertiesServices) {
            propertiesElement = properties.split(StringUtils.COMMA);

            if (fileName.equals(VILLA)) {

                services = new Villa();

                ((Villa) services).setStandrdRoom(propertiesElement[6]);
                ((Villa) services).setDescriptionConvent(propertiesElement[7]);
                ((Villa) services).setAreaPool(Double.parseDouble(propertiesElement[8]));
                ((Villa) services).setNumberFloors(Integer.parseInt(propertiesElement[9]));

            } else if (fileName.equals(HOUSE)) {

                services = new House();

                ((House) services).setStandrdRoom(propertiesElement[6]);
                ((House) services).setDescriptionConvent(propertiesElement[7]);
                ((House) services).setNumberFloors(Integer.parseInt(propertiesElement[8]));

            } else if(fileName.equals(ROOM)) {

                EtraServices etraServices = new EtraServices(propertiesElement[6],propertiesElement[7],Double.parseDouble(propertiesElement[8]));
                services = new Room();
                ((Room) services).setServiceFree(etraServices);

            }

            services.setId(propertiesElement[0]);
            services.setFullName(propertiesElement[1]);
            services.setAreaUse(Double.parseDouble(propertiesElement[2]));
            services.setRentalCosts(Double.parseDouble(propertiesElement[3]));
            services.setMaximumPeoples(Integer.parseInt(propertiesElement[4]));
            services.setRentalType(propertiesElement[5]);

            listOfServices.add(services);

        }
        return listOfServices;

    }

    private static void showInformationOfEmployee() {
    }

    private static void addNewBooking() {

        // show information customer in file CSV:
        List<Customer> listCustomer = readAllCustomer();
        showInformationOfCustomer();

        int choose = 0;
        do {
            System.out.println("1.\tBooking Villa. \n" +
                               "2.\tBooking House. \n" +
                               "3.\tBooking Room. \n" +
                               "4.\tBack to menu.\n" +
                               "5.\tExit.\n" );
            System.out.println("Please input booking a services: ");
            choose = scanner.nextInt();
            List<Services> listOfService = null;
             switch (choose) {
                 case 1:
                     listOfService = readAllServices(VILLA);
                     showAllService(VILLA);
                     break;
                 case 2:
                     listOfService = readAllServices(HOUSE);
                     showAllService(HOUSE);

                     break;
                 case 3:
                     listOfService = readAllServices(ROOM);
                     showAllService(ROOM);
                     break;
                 case 4:
                     displayMainMenu();
                     break;
                 case 5:
                     System.exit(0);
                     break;
             }
         } while (choose >= 1 && choose <= 7);

        Customer customer = listCustomer.get(choose -1);
    }


    private static List<Customer> readAllCustomer(){
        FileUtils.setFullPathFile(CUSTOMER);
        List<String> propertiesCustomer = FileUtils.readFile();
        List<Customer> listOfCustomer = new ArrayList<>();
        String[] propertiesElement = null;
        Customer customer = null;
        for (String properties : propertiesCustomer) {
            propertiesElement = properties.split(StringUtils.COMMA);
             customer = new Customer();
             customer.setNameCustomer(propertiesElement[0]);
             customer.setDayOfBirth(propertiesElement[1]);
             customer.setGender(propertiesElement[2]);
             customer.setIdCard(propertiesElement[3]);
             customer.setPhoneNumber(propertiesElement[4]);
             customer.setEmail(propertiesElement[5]);
             customer.setTypeCustomer(propertiesElement[6]);
             customer.setAddress(propertiesElement[7]);

             listOfCustomer.add(customer);

        }
        Collections.sort(listOfCustomer);
        return listOfCustomer;
}
    private static void showInformationOfCustomer() {
        System.out.println("---------------------------------");
        System.out.println("List Customer: ");
        // lấy data CSV ra:
        List<Customer> listOfCustomer = readAllCustomer();


       /* for (Customer customer :listOfCustomers) {
            customer.showInFor();

        }*/

       // đánh dấu số thứ tự:
         Customer customer = null;
        for(int i = 0; i < listOfCustomer.size(); i++) {
            customer = listOfCustomer.get(i);
            System.out.println((i + 1)+". ");
            customer.showInFor();
        }

        System.out.println("Show data complete!!! ... ");
    }

    private static void addNewCustomer() {
        FileUtils.setFullPathFile(CUSTOMER);
         scanner.nextLine();
         boolean flag;
        String nameCustomer = null;
         do {
             flag = true;
             System.out.println("Please input nameCustomer: ");
             nameCustomer = scanner.nextLine();

             try {
                 Validators.isValidFullName(nameCustomer);
             } catch (NameException e) {
                 flag = false;
                 e.printStackTrace();
             }
         } while (!flag);

        String dayOfBirth = null;
         do {
             flag = true;
             System.out.println("Please input dayOfBirth: ");
             dayOfBirth = scanner.nextLine();
             scanner.nextLine();
             try {
                 Validators.isValidBirthday(dayOfBirth);
             } catch (BirthdayException e) {
                 flag = false;
                 e.printStackTrace();
             }
         } while (!flag);
        String gender = null;
         do {
             flag = true;
             System.out.println("Please input gender: ");
             gender = scanner.nextLine();

             try {
                 Validators.isValidGender(gender);
             } catch (GenderException e) {
                 flag = false;
                 e.printStackTrace();
             }

             ConvertUtils.normalizeStr(gender);
         } while (!flag);

        String idCard = null;
        do {
            flag = true;
            System.out.println("Please input idCard: ");
            idCard = scanner.nextLine();

            try {
                Validators.isValidIdCard(idCard);
            } catch (IdCardException e) {
                flag = false;
                e.printStackTrace();
            }
        } while (!flag);

        String phoneNumber = null;
        do {
            flag = true;
            System.out.println("Please input phone number: ");
            phoneNumber = scanner.nextLine();
            try {
                Validators.isValidIdCard(phoneNumber);
            } catch (IdCardException e) {
                flag = false;
                e.printStackTrace();
            }
        } while (!flag);

        String email = null;
         do {
             flag = true;
             System.out.println("Please input email: ");
             email = scanner.nextLine();

             try {
                 Validators.isValidEmail(email);
             } catch (EmailException e) {
                 flag = false;
                 e.printStackTrace();
             }
         } while (!flag);
         System.out.println("Please input TypeCustomer: ");
         String TypeCustomer = scanner.nextLine();
         System.out.println("Please input address: ");
         String address = scanner.nextLine();

         FileUtils.writeFile(new String[]{nameCustomer, dayOfBirth, gender, idCard,
                                          phoneNumber, email, TypeCustomer, address});
         System.out.println("Add complete!!! .... ");

    }


    private static void addNewServices() {
        int choose = 0;
        do {
            System.out.println("1.\tAdd New Villa\n" +
                    "2.\tAdd New House\n" +
                    "3.\tAdd New Room\n" +
                    "4.\tBack to menu\n" +
                    "5.\tExit\n");
            System.out.println("Please choose service to add: ");
            choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    addNewVilla();
                    break;
                case 2:
                    addNewHouse();
                    break;
                case 3:
                    addNewRoom();
                    break;
                case 4:
                    displayMainMenu();
                    break;
                case 5:
                    break;
            }

        } while (choose >= 1 && choose <= 5 );

    }

    private static void addNewRoom() {
        FileUtils.setFullPathFile(ROOM);

        scanner.nextLine();
        String id = null;
        do {
            System.out.println("Please input id: ");
            id = scanner.nextLine();
        } while (!Validators.isValidService(id, Validators.SERVICE_CODE_REGEX));

        String fullName = null;
        do {
            System.out.println("Please input full name service: ");
            fullName = scanner.nextLine();
        } while (!Validators.isValidService(fullName, Validators.SERVICE_NAME_REGEX));

        double areaUse = 0;
        do {
            System.out.println("Please input areaUse: ");
            areaUse = scanner.nextDouble();
        } while (!Validators.isMoreThan(areaUse,30));

        double rentalCosts = 0;
        do {
            System.out.println("Please input rentalCosts: ");
            rentalCosts = scanner.nextDouble();
        } while (!Validators.isMoreThan(rentalCosts,0));

        int maximumPeoples = 0;
        do {
            System.out.println("Please input  maximumPeoples: ");
            maximumPeoples = scanner.nextInt();
        } while (!Validators.isMoreThan(maximumPeoples,0,20));
        scanner.nextLine();
        String rentalType = null;
        do {
            System.out.println("Please input rentalType: ");
            rentalType = scanner.nextLine();
        } while (!Validators.isValidService(rentalType, Validators.SERVICE_NAME_REGEX));

        String nameServiceGoWith = null;
        do {
            System.out.println("Please input nameService Go With: ");
            nameServiceGoWith = scanner.nextLine();
        } while (!Validators.isValidExtraServiceName(nameServiceGoWith));
        System.out.println("Please input unit: ");
        String unit = scanner.nextLine();
        System.out.println("Please input priceMoney: ");
        double priceMoney = scanner.nextDouble();


        FileUtils.writeFile(new String[]{id, fullName, String.valueOf(areaUse), String.valueOf(rentalCosts),
                String.valueOf(maximumPeoples),rentalType,nameServiceGoWith,unit,String.valueOf(priceMoney)});
        System.out.println("Room add complete!!!! .... ");
    }

    private static void addNewHouse() {
        FileUtils.setFullPathFile(HOUSE);
        scanner.nextLine();
        String id = null;
        do {
            System.out.println("Please input id: ");
            id = scanner.nextLine();
        } while (!Validators.isValidService(id, Validators.SERVICE_CODE_REGEX));

        String fullName = null;
        do {
            System.out.println("Please input full name service: ");
            fullName = scanner.nextLine();
        } while (!Validators.isValidService(fullName, Validators.SERVICE_NAME_REGEX));

        double areaUse = 0;
        do {
            System.out.println("Please input areaUse: ");
            areaUse = scanner.nextDouble();
        } while (!Validators.isMoreThan(areaUse,30));

        double rentalCosts = 0;
        do {
            System.out.println("Please input rentalCosts: ");
            rentalCosts = scanner.nextDouble();
        } while (!Validators.isMoreThan(rentalCosts,0));

        int maximumPeoples = 0;
        do {
            System.out.println("Please input  maximumPeoples: ");
            maximumPeoples = scanner.nextInt();
        } while (!Validators.isMoreThan(maximumPeoples,0,20));
        scanner.nextLine();
        String rentalType = null;
        do {
            System.out.println("Please input rentalType: ");
            rentalType = scanner.nextLine();
        } while (!Validators.isValidService(rentalType, Validators.SERVICE_NAME_REGEX));
        String standrdRoom = null;
        do {
            System.out.println("Please input standrdRoom: ");
            standrdRoom = scanner.nextLine();
        } while (!Validators.isValidService(standrdRoom, Validators.SERVICE_NAME_REGEX));
        System.out.println("Please input descriptionConvent: ");
        String descriptionConvent = scanner.nextLine();

        int numberFloors = 0;
        do {
            System.out.println("Please input numberFloors: ");
            numberFloors = scanner.nextInt();
        } while (!Validators.isMoreThan(numberFloors,0));

        FileUtils.writeFile(new String[]{id, fullName, String.valueOf(areaUse), String.valueOf(rentalCosts),
                String.valueOf(maximumPeoples),rentalType, standrdRoom, descriptionConvent, String.valueOf(numberFloors)});
        System.out.println("House add complete!!!! .... ");
    }

    private static void addNewVilla() {
        FileUtils.setFullPathFile(VILLA);
        scanner.nextLine();
        String id = null;
        do {
            System.out.println("Please input id: ");
            id = scanner.nextLine();
        } while (!Validators.isValidService(id, Validators.SERVICE_CODE_REGEX));

        String fullName = null;
        do {
            System.out.println("Please input full name service: ");
            fullName = scanner.nextLine();
        } while (!Validators.isValidService(fullName, Validators.SERVICE_NAME_REGEX));

        double areaUse = 0;
        do {
            System.out.println("Please input areaUse: ");
            areaUse = scanner.nextDouble();
        } while (!Validators.isMoreThan(areaUse,30));

        double rentalCosts = 0;
        do {
            System.out.println("Please input rentalCosts: ");
            rentalCosts = scanner.nextDouble();
        } while (!Validators.isMoreThan(rentalCosts,0));

        int maximumPeoples = 0;
        do {
            System.out.println("Please input  maximumPeoples: ");
            maximumPeoples = scanner.nextInt();
        } while (!Validators.isMoreThan(maximumPeoples,0,20));
        scanner.nextLine();
        String rentalType = null;
        do {
            System.out.println("Please input rentalType: ");
            rentalType = scanner.nextLine();
        } while (!Validators.isValidService(rentalType, Validators.SERVICE_NAME_REGEX));
        String standrdRoom = null;
        do {
            System.out.println("Please input standrdRoom: ");
            standrdRoom = scanner.nextLine();
        } while (!Validators.isValidService(standrdRoom, Validators.SERVICE_NAME_REGEX));
        System.out.println("Please input descriptionConvent: ");
        String descriptionConvent = scanner.nextLine();
        double areaPool = 0;
        do {
            System.out.println("Please input area Pool : ");
            areaPool = scanner.nextDouble();
        } while (!Validators.isMoreThan(areaPool,30));
        int numberFloors = 0;
        do {
            System.out.println("Please input numberFloors: ");
            numberFloors = scanner.nextInt();
        } while (!Validators.isMoreThan(numberFloors,0));

        FileUtils.writeFile(new String[]{id, fullName, String.valueOf(areaUse), String.valueOf(rentalCosts),
                String.valueOf(maximumPeoples),rentalType, standrdRoom, descriptionConvent,
                String.valueOf(areaPool), String.valueOf(numberFloors)});
        System.out.println("Villa add complete!!!! .... ");
    }
}
