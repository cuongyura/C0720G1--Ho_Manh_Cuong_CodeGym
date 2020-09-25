package __12_java_conllection_framework.bai_tap._1_practice_arrayList_linkedList_in_java_collection_framework;

import com.sun.security.jgss.GSSUtil;

import java.util.*;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Product> listProduct = new ArrayList<Product>();

    public static void main(String[] args) {
        displayMainMenu();
    }

    private static void displayMainMenu() {
        int choose = 0;
        do {
            System.out.println("1.\tAdd New Product.\n" +
                    "2.\tShow Information Of Product.\n" +
                    "3.\tdelete Product.\n" +
                    "4.\tedit Product.\n" +
                    "5.\tfind product.\n" +
                    "6.\tshow sort increase products.\n" +
                    "7.\tshow Sort Reduction Products.\n" +
                    "8.\tExit.\n");

            System.out.println("Please choose (1 - 8): ");
            choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    addNewProduct();
                    break;
                case 2:
                    showInformationOfProducts();
                    break;
                case 3:
                    deleteProduct();
                    break;
                case 4:
                    editProduct();
                    break;
                case 5:
                    findproduct();
                    break;
                case 6:
                    showSortInceaseProducts();
                    break;
                case 7:
                    showSortReductionProducts();
                    break;
                case 8:
                    System.exit(0);
                    break;

            }
        } while (choose >= 1 && choose <= 8);

    }

    private static void showSortReductionProducts() {
        Collections.sort(listProduct, new sortReduction());
        showInformationOfProducts();
    }

    private static void showSortInceaseProducts() {
        Collections.sort(listProduct, new sortIncrease());
        showInformationOfProducts();
    }


    private static void showInformationOfProducts() {
        for (Product product : listProduct) {
            System.out.println(product.toString());
        }

    }


    private static void addNewProduct() {

        Product product = new Product();

        scanner.nextLine();
        System.out.println("Please input id: ");
        product.setId(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Please input name: ");
        product.setName(scanner.nextLine());
        System.out.println("Please input price: ");
        product.setPrice(scanner.nextInt());

        // add file in array list:
        listProduct.add(product);
        System.out.println(listProduct);

        System.out.println("Add new product complete!....");
    }


    // delete:
    private static void deleteProduct() {
        showInformationOfProducts();
        scanner.nextLine();
        System.out.println("Please input id product you want delete information: ");
        int chooseDelete = scanner.nextInt();

        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getId() == chooseDelete) {
                listProduct.remove(i);
                System.out.println("Delete compelete!!!....");
                break;
            }
        }
    }

    // edit:
    private static void editProduct() {
        showInformationOfProducts();
        scanner.nextLine();
        System.out.println("Please input id product you want edit Information");
        int chooseEdit = scanner.nextInt();
        // show information eidt and select properties need fix:
        // select id:
        for (int i = 0; i < listProduct.size(); i++){
            if(listProduct.get(i).getId() == chooseEdit){
                // show properties of object:
                System.out.println("1. " + listProduct.get(i).getId());
                System.out.println("2. " + listProduct.get(i).getName());
                System.out.println("3. " + listProduct.get(i).getPrice());
                scanner.nextLine();
                System.out.println("Please choose properties of product you want edit: ");
                String chooseProperty = scanner.nextLine();
                // input data need change:
                System.out.println("Please enter value you want change: ");
                String valueProperty = scanner.nextLine();
                switch (chooseProperty){
                    case "1":
                        listProduct.get(i).setId(Integer.parseInt(valueProperty));
                        break;
                    case "2":
                        listProduct.get(i).setName(valueProperty);
                        break;
                    case "3":
                        listProduct.get(i).setPrice(Integer.parseInt(valueProperty));
                        break;
                }
                System.out.println("Edit complete!!!! ....");
                break;
            }
        }
    }

    // find student CSv:
    public static String findproduct() {
        Scanner scanner = new Scanner(System.in);
        boolean isFounded;
        String choice;
        while (true) {
            System.out.println("seach find: " +
                    "\n1. id." +
                    "\n2. name.");
            choice = scanner.nextLine();
            if (choice.equals("1") || choice.equals("2")) break;
            else System.out.println("Selection not true! ");
        }
        if (choice.equals("1")) {
            System.out.println("Please input id: ");
            String id = scanner.nextLine();
            isFounded = findProductBy("id", id);
        } else {
            System.out.println("Please input name");
            String name = scanner.nextLine();
            isFounded = findProductBy("name", name);
        }
        if (isFounded) return "find complete !...";
        else return "not find complete !...";
    }

    public static boolean findProductBy(String type, String value)  {
        showInformationOfProducts();
        boolean isFounded = false;
        for (Product product : listProduct) {
            switch (type) {
                case "id":
                    if (product.getId() == Integer.parseInt(value)) {
                        isFounded = true;
                        System.out.println(product.toString());
                    }
                    break;
                case "name":
                    if (product.getName().equals(value)) {
                        isFounded = true;
                        System.out.println(product.toString());
                    }
            }
        }
        return isFounded;
    }

}
