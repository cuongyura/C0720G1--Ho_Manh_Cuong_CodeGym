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

        scanner.nextLine();
        System.out.println("Please input id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please input name: ");
        String name = scanner.nextLine();
        System.out.println("Please input price: ");
        int price = scanner.nextInt();
        Product product = new Product(id, name, price);

        // add file in array list:
        listProduct.add(product);
        System.out.println("Add new product complete!....");
    }


    // delete:
    private static void deleteProduct() {
        showInformationOfProducts();
        scanner.nextLine();
        System.out.println("Please input id product you want delete information: ");
        int valueId = scanner.nextInt();

        for (int i = 0; i < listProduct.size(); i++) {
            if (valueId == listProduct.get(i).getId()) {
                listProduct.remove(i);
                System.out.println("Delete compelete!!!....");
                break;
            }
        }
    }

    // edit:
    private static void editProduct() {

         System.out.println("Please input ide edit information: ");
         int idEdit = scanner.nextInt();

         System.out.println("Please input new name: ");
         String newName = scanner.nextLine();

         System.out.println("Please input new price: ");
         int newprice = scanner.nextInt();

         for (int i = 0; i < listProduct.size(); i++) {
             if(idEdit == listProduct.get(i).getId()){
                   listProduct.get(i).setName(newName);
                   listProduct.get(i).setPrice(newprice);
             }
         }
    }

    // find student CSv:
    public static void findproduct() {
        scanner.nextLine();
        showInformationOfProducts();
        int choose =0;
        do {
            System.out.println("1. id. \n" +
                    "2. name. \n" +
                    "3. back to menu. \n" +
                    "4. exit.");
            System.out.println("Please input choose by id or name to search information: : ");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    scanner.nextLine();
                    System.out.println("Please input find id: ");
                    int newId = scanner.nextInt();

                    for (int i = 0; i < listProduct.size(); i++) {
                        if (newId == (listProduct.get(i).getId())) {
                            System.out.println(listProduct.get(i).toString());
                        }
                    }
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.println("Please input find name: ");
                    String newName = scanner.nextLine();

                    for (int i = 0; i < listProduct.size(); i++) {
                        if (newName.equals(listProduct.get(i).getName())) {
                            System.out.println(listProduct.get(i).toString());
                        }
                    }
                    break;
                case 3:
                    displayMainMenu();
                case 4:
                    System.exit(0);
                    break;
            }


        } while (choose >= 1 && choose <= 4);


    }
}
