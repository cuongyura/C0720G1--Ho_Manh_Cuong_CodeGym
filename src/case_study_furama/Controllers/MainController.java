package case_study_furama.Controllers;

import case_study_furama.Commons.ConvertUtils;
import case_study_furama.Commons.FileUtils;
import case_study_furama.Commons.Validators;
import case_study_furama.Exceptions.*;
import case_study_furama.Models.*;

import java.util.*;

public class MainController {

    public static Scanner scanner = new Scanner(System.in);

    private static String COMA = ",";
    private static String FILE_VILA = "E:\\Module2\\src\\case_study_furama\\Data\\villa.csv";
    private static String FILE_HOUSE = "E:\\Module2\\src\\case_study_furama\\Data\\house.csv";
    private static String FILE_ROOM = "E:\\Module2\\src\\case_study_furama\\Data\\room.csv";
    private static String FILE_CUSTOMER = "E:\\Module2\\src\\case_study_furama\\Data\\customer.csv";
    private static String FILE_BOOKING = "E:\\Module2\\src\\case_study_furama\\Data\\booking.csv";
    public static String FILE_EMPLOYEE = "E:\\Module2\\src\\case_study_furama\\Data\\employee.csv";
    private static int chooseCus;

    private static  List<Customer> customerList = new ArrayList<>();
    private static  List<Villa> villaList = new ArrayList<>();
    private static  List<House> houseList = new ArrayList<>();
    private static  List<Room> roomList = new ArrayList<>();
    public static  List<Employee> employeeList = new ArrayList<>();
    public static Stack<Employee> listStack = new Stack<>();

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
                    "7.\tShow Queue of Customer\n" +
                    "8.\tFind File Of Employee(Stack)\n" +
                    "9.\tExit\n");
            System.out.println("Please input choose (1 - 9): ");
            choose = Integer.parseInt(scanner.nextLine());
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
                    showQueueOfCustomers();
                    break;
                case 8:
                    Cabinet.findFileOfEmployee();
                    break;
                case 9:
                    System.exit(0);
                    break;
                default:
                    displayMainMenu();
                    break;
            }
        } while (choose >= 1 && choose <= 9);
    }


    private static void showQueueOfCustomers() {

         // create method a queue:
         Queue<Customer> customerQueue = new LinkedList<>();

         // show list customer:
         showInformationOfCustomer();

         customerQueue.add(customerList.get(3));
         customerQueue.add(customerList.get(5));
         customerQueue.add(customerList.get(1));

         Customer customer = null;

         System.out.println("--------------------");
         System.out.println("List customer who buy ticket: ");
         while (!customerQueue.isEmpty()){
              customer = customerQueue.poll();
              customer.showInFor();

          }


    }



    public static void showInformationOfEmployee() {
        readAllEmployee();
        Map<Integer, Employee> employeeMap = new TreeMap<>();
       int index = 1;
       for (Employee employee : employeeList) {
           employeeMap.put(employee.getId(), employee);
//           System.out.println(index++ + ". " + employee);
       }


       for (Integer key : employeeMap.keySet()) {
           System.out.println(key + " " + employeeMap.get(key));
       }

    }

    private static void addNewBooking() {
        int choose1 = 1;
        customerList = new ArrayList<>();
        showInformationOfCustomer();
        System.out.println("Vui lòng chọn khách hàng: ");
        chooseCus = Integer.parseInt(scanner.nextLine());
        do {
            System.out.println("1.\tBooking Villa\n" +
                    "2.\tBooking House\n" +
                    "3.\tBooking Room\n" +
                    "4.\tBack to menu\n" +
                    "5.\tExit");
            System.out.println("nhập số (1-5): ");
            choose1 = Integer.parseInt(scanner.nextLine());
            switch (choose1) {
                case 1:
                    bookingVilla();
                    break;
                case 2:
                    bookingHouse();
                    break;
                case 3:
                    bookingRoom();
                    break;
                case 4:
                    displayMainMenu();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("nhập lại:");
                    break;
            }
        }while (choose1 >=1 && choose1 <=5);
    }
    private static void bookingRoom() {
        showAllRoom();
        System.out.println("chọn Room: ");
        int room = Integer.parseInt(scanner.nextLine());
        customerList.get(chooseCus - 1).setUseServices(roomList.get(room - 1));
        String line;
        line = customerList.get(chooseCus - 1).getNameCustomer() + COMA +
                customerList.get(chooseCus - 1).getDayOfBirth() + COMA +
                customerList.get(chooseCus - 1).getGender() + COMA +
                customerList.get(chooseCus - 1).getIdCard() + COMA +
                customerList.get(chooseCus - 1).getPhoneNumber() + COMA +
                customerList.get(chooseCus - 1).getEmail() + COMA +
                customerList.get(chooseCus - 1).getTypeCustomer() + COMA +
                customerList.get(chooseCus - 1).getAddress() + COMA +
                customerList.get(chooseCus - 1).getUseServices().getId() + COMA +
                customerList.get(chooseCus - 1).getUseServices().getFullName() + COMA +
                customerList.get(chooseCus - 1).getUseServices().getAreaUse() + COMA +
                customerList.get(chooseCus - 1).getUseServices().getRentalType() + COMA +
                customerList.get(chooseCus - 1).getUseServices().getMaximumPeoples() + COMA +
                customerList.get(chooseCus - 1).getUseServices().getRentalType();
        FileUtils.writeFile(line,FILE_BOOKING);
        System.out.println("booking Room thành công!");
        displayMainMenu();
    }
    private static void bookingHouse() {
        showAllHouse();
        System.out.println("chọn House: ");
        int house = Integer.parseInt(scanner.nextLine());
        customerList.get(chooseCus - 1).setUseServices(houseList.get(house - 1));
        String line;
        line = customerList.get(chooseCus - 1).getNameCustomer() + COMA +
                customerList.get(chooseCus - 1).getDayOfBirth() + COMA +
                customerList.get(chooseCus - 1).getGender() + COMA +
                customerList.get(chooseCus - 1).getIdCard() + COMA +
                customerList.get(chooseCus - 1).getPhoneNumber() + COMA +
                customerList.get(chooseCus - 1).getEmail() + COMA +
                customerList.get(chooseCus - 1).getTypeCustomer() + COMA +
                customerList.get(chooseCus - 1).getAddress() + COMA +
                customerList.get(chooseCus - 1).getUseServices().getId() + COMA +
                customerList.get(chooseCus - 1).getUseServices().getFullName() + COMA +
                customerList.get(chooseCus - 1).getUseServices().getAreaUse() + COMA +
                customerList.get(chooseCus - 1).getUseServices().getRentalCosts() + COMA +
                customerList.get(chooseCus - 1).getUseServices().getMaximumPeoples() + COMA +
                customerList.get(chooseCus - 1).getUseServices().getRentalType();
        FileUtils.writeFile(line, FILE_BOOKING);
        System.err.println("booking House thành công!");
        displayMainMenu();
    }
    private static void bookingVilla() {
        showAllVilla();
        System.out.println("chọn Villa:");
        int villa = Integer.parseInt(scanner.nextLine());
        customerList.get(chooseCus - 1).setUseServices(villaList.get(villa - 1));
        String line;
        line = customerList.get(chooseCus - 1).getNameCustomer() + COMA +
                customerList.get(chooseCus - 1).getDayOfBirth() + COMA +
                customerList.get(chooseCus - 1).getGender() + COMA +
                customerList.get(chooseCus - 1).getIdCard() + COMA +
                customerList.get(chooseCus - 1).getPhoneNumber() + COMA +
                customerList.get(chooseCus - 1).getEmail() + COMA +
                customerList.get(chooseCus - 1).getTypeCustomer() + COMA +
                customerList.get(chooseCus - 1).getAddress() + COMA +
                customerList.get(chooseCus - 1).getUseServices().getId() + COMA +
                customerList.get(chooseCus - 1).getUseServices().getFullName() + COMA +
                customerList.get(chooseCus - 1).getUseServices().getAreaUse() + COMA +
                customerList.get(chooseCus - 1).getUseServices().getRentalCosts() + COMA +
                customerList.get(chooseCus - 1).getUseServices().getMaximumPeoples() + COMA +
                customerList.get(chooseCus - 1).getUseServices().getRentalType();
        FileUtils.writeFile(line, FILE_BOOKING);
        System.err.println("booking Villa thành công!");
        displayMainMenu();
    }

    public static void readAllEmployee() {

        List<String> listStr = FileUtils.readObject(FILE_EMPLOYEE);
        for (String line : listStr) {
            String[] split = line.split(",");
            if(split.length != 1){
                Employee employee = new Employee(Integer.parseInt(split[0]), split[1],Integer.parseInt(split[2]),split[3]);
                employeeList.add(employee);
                listStack.add(employee);
            }
        }
    }
    private static void readAllCustomer() {
        List<String> listStr = FileUtils.readObject(FILE_CUSTOMER);

        for (String line : listStr) {

            String[] split = line.split(",");

            if (split.length != 1) {
                Customer customer = new Customer(split[0], split[1], split[2], split[3], split[4], split[5], split[6], split[7], null);
                customerList.add(customer);

            }
        }
    }
    private static void showInformationOfCustomer() {
        readAllCustomer();

        Collections.sort(customerList);
        int index = 1;
        for (Customer customer : customerList) {
            System.out.println(index++ + ". " + customer);
        }

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
                    showAllVilla();
                    break;
                case 2:
                    showAllHouse();
                    break;
                case 3:
                    showAllRoom();
                    break;
                case 4:
                    showAllVillaNotDuplicate();
                    break;
                case 5:
                    showAllHouseNotDuplicate();
                    break;
                case 6:
                    showAllRoomNotDuplicate();
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

    private static void showAllRoomNotDuplicate() {
        readAllRoom();
        Set<String> stringSet = new TreeSet<>();

        for (Room room : roomList){
            stringSet.add(room.getFullName());
        }
        for (String str : stringSet ) {
            System.out.println(str);
        }



    }

    private static void showAllHouseNotDuplicate() {
        readAllHouse();
        Set<String> stringSet = new TreeSet<>();

        for (House house : houseList){
            stringSet.add(house.getFullName());
        }
        for (String str : stringSet ) {
            System.out.println(str);
        }

    }

    private static void showAllVillaNotDuplicate() {
        readAllVilla();
        Set<String> stringSet = new TreeSet<>();

        for (Villa villa : villaList){
             stringSet.add(villa.getFullName());
        }
        for (String str : stringSet ) {
            System.out.println(str);
        }
    }
    private static void readAllRoom() {

        List<String> listStr = FileUtils.readObject(FILE_ROOM);

        for (String line : listStr) {

            String[] split = line.split(",");

            if (split.length != 1) {

                Room room = new Room(split[0], split[1], Double.parseDouble(split[2]), Double.parseDouble(split[3]), Integer.parseInt(split[4]), split[5], new EtraServices(split[6], split[7], Double.parseDouble(split[8])));
                roomList.add(room);
            }
        }
    }
    private static void showAllRoom() {

            int index = 1;
            for (Room room : roomList) {
                System.out.println(index++ + ". " + room);
            }
        }

    private static void readAllHouse() {

        List<String> listStr = FileUtils.readObject(FILE_HOUSE);

        for (String line : listStr) {

            String[] split = line.split(",");

            if (split.length != 1) {

                House house = new House(split[0], split[1], Double.parseDouble(split[2]), Double.parseDouble(split[3]), Integer.parseInt(split[4]), split[5],
                        split[6], split[7], Integer.parseInt(split[8]));
                houseList.add(house);

            }
        }
    }
    private static void showAllHouse() {
             readAllHouse();
            int index = 1;
            for (House house : houseList) {
                System.out.println(index++ + ". " + house);
            }
        }



    private static void readAllVilla(){
        List<String> listStr = FileUtils.readObject(FILE_VILA);

        for (String line : listStr) {

            String[] split = line.split(",");

            if (split.length != 1) {
                Villa villa = new Villa(split[0], split[1], Double.parseDouble(split[2]), Double.parseDouble(split[3]), Integer.parseInt(split[4]),
                        split[5], split[6], split[7], Double.parseDouble(split[8]), Integer.parseInt(split[9])
                );
                villaList.add(villa);
            }
    }


    }
    private static void showAllVilla() {
        readAllVilla();
        int index = 1;
        for (Villa villa: villaList) {
            System.out.println(index++ + ". " + villa);
        }
    }

    private static void addNewCustomer() {
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
        String typeCustomer = scanner.nextLine();
        System.out.println("Please input address: ");
        String address = scanner.nextLine();
        Services useService = null;
        Customer customer = new Customer(nameCustomer, dayOfBirth, gender, idCard, phoneNumber, email, typeCustomer, address, useService);

        String line =
                customer.getNameCustomer() + COMA +
                        customer.getDayOfBirth() + COMA +
                        customer.getIdCard() + COMA +
                        customer.getPhoneNumber() + COMA +
                        customer.getEmail() + COMA +
                        customer.getTypeCustomer() + COMA +
                        customer.getAddress() + COMA +
                        customer.getUseServices() + "\n";
        FileUtils.writeFile(line, FILE_CUSTOMER);

        System.out.println("Add complete!!! .... ");

    }


    private static void addNewServices() {
        scanner.nextLine();
        int choose = 0;
        do {
            System.out.println("1.\tAdd New Villa\n" +
                    "2.\tAdd New House\n" +
                    "3.\tAdd New Room\n" +
                    "4.\tBack to menu\n" +
                    "5.\tExit\n");
            System.out.println("Please choose service to add: ");
            choose = Integer.parseInt(scanner.nextLine());

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
                    System.exit(0);
                    break;
            }

        } while (choose >= 1 && choose <= 5);

    }

    private static void addNewRoom() {

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
            areaUse = Double.parseDouble(scanner.nextLine());
        } while (!Validators.isMoreThan(areaUse, 30));

        double rentalCosts = 0;
        do {
            System.out.println("Please input rentalCosts: ");
            rentalCosts = Double.parseDouble(scanner.nextLine());
        } while (!Validators.isMoreThan(rentalCosts, 0));

        int maximumPeoples = 0;
        do {
            System.out.println("Please input  maximumPeoples: ");
            maximumPeoples = Integer.parseInt(scanner.nextLine());
        } while (!Validators.isMoreThan(maximumPeoples, 0, 20));

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
        double priceMoney = Double.parseDouble(scanner.nextLine());
        EtraServices etraServices = new EtraServices(nameServiceGoWith, unit, priceMoney);

        Room room = new Room(id, fullName, areaUse, rentalCosts, maximumPeoples, rentalType, etraServices);

        String line =
                        room.getId() + COMA +
                        room.getFullName() + COMA +
                        room.getAreaUse() + COMA +
                        room.getRentalCosts() + COMA +
                        room.getMaximumPeoples() + COMA +
                        room.getRentalType() + COMA +
                        etraServices.getNameServiceGoWith() + COMA +
                        etraServices.getUnit() + COMA +
                        etraServices.getPriceMoney() + "\n";

        FileUtils.writeFile(line, FILE_ROOM);
        System.out.println("Room add complete!!!! .... ");
    }


    private static void addNewHouse() {
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
            areaUse = Double.parseDouble(scanner.nextLine());
        } while (!Validators.isMoreThan(areaUse, 30));

        double rentalCosts = 0;
        do {
            System.out.println("Please input rentalCosts: ");
            rentalCosts = Double.parseDouble(scanner.nextLine());
        } while (!Validators.isMoreThan(rentalCosts, 0));

        int maximumPeoples = 0;
        do {
            System.out.println("Please input  maximumPeoples: ");
            maximumPeoples = Integer.parseInt(scanner.nextLine());
        } while (!Validators.isMoreThan(maximumPeoples, 0, 20));

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
            numberFloors = Integer.parseInt(scanner.nextLine());
        } while (!Validators.isMoreThan(numberFloors, 0));

        House house = new House(id, fullName, areaUse, rentalCosts, maximumPeoples, rentalType, standrdRoom
                , descriptionConvent, numberFloors);
        String line =
                house.getId() + COMA +
                        house.getFullName() + COMA +
                        house.getAreaUse() + COMA +
                        house.getRentalCosts() + COMA +
                        house.getMaximumPeoples() + COMA +
                        house.getRentalType() + COMA +
                        house.getStandrdRoom() + COMA +
                        house.getDescriptionConvent() + COMA +
                        house.getNumberFloors() + "\n";

        FileUtils.writeFile(line, FILE_HOUSE);
        System.out.println("Villa add complete!!!! .... ");
    }

    private static void addNewVilla() {

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

        double areaUse;
        do {
            System.out.println("Please input areaUse: ");
            areaUse = Double.parseDouble(scanner.nextLine());
        } while (!Validators.isMoreThan(areaUse, 30));

        double rentalCosts = 0;
        do {
            System.out.println("Please input rentalCosts: ");
            rentalCosts = Double.parseDouble(scanner.nextLine());
        } while (!Validators.isMoreThan(rentalCosts, 0));

        int maximumPeoples = 0;
        do {
            System.out.println("Please input  maximumPeoples: ");
            maximumPeoples = scanner.nextInt();
        } while (!Validators.isMoreThan(maximumPeoples, 0, 20));
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
            areaPool = Double.parseDouble(scanner.nextLine());
        } while (!Validators.isMoreThan(areaPool, 30));
        int numberFloors = 0;
        do {
            System.out.println("Please input numberFloors: ");
            numberFloors = Integer.parseInt(scanner.nextLine());
        } while (!Validators.isMoreThan(numberFloors, 0));

        Villa villa = new Villa(id, fullName, areaUse, rentalCosts, maximumPeoples, rentalType, standrdRoom
                , descriptionConvent, areaPool, numberFloors);
        String line =
                villa.getId() + COMA +
                        villa.getFullName() + COMA +
                        villa.getAreaUse() + COMA +
                        villa.getRentalCosts() + COMA +
                        villa.getMaximumPeoples() + COMA +
                        villa.getRentalType() + COMA +
                        villa.getStandrdRoom() + COMA +
                        villa.getDescriptionConvent() + COMA +
                        villa.getAreaPool() + COMA +
                        villa.getNumberFloors() + "\n";

        FileUtils.writeFile(line, FILE_VILA);
        System.out.println("Villa add complete!!!! .... ");
    }
}
