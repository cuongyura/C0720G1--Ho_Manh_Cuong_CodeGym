package __17_io_binary_file_serialization.bai_tap._1_manage_file_bibary;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        /*String id, String name, String manufacturer, double price, String description*/
        List<ProductBinary> productBinaryList = new ArrayList<>();
        productBinaryList.add(new ProductBinary("1", "Tu", "hana",2,"kkk"));
        productBinaryList.add(new ProductBinary("2", "Luyen", "hana",2,"kkk"));


        FileBinary.writeObjectList(productBinaryList);

        List<ProductBinary> output = FileBinary.readObjectList();

        for (ProductBinary productBinary : output) {
            System.out.println(productBinary);
        }
    }
}
