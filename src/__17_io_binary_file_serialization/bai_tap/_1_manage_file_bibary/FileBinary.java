package __17_io_binary_file_serialization.bai_tap._1_manage_file_bibary;

import java.io.*;
import java.util.List;

public class FileBinary {
    private static String FILE_PATH = "src/__17_io_binary_file_serialization/bai_tap/_1_manage_file_bibary/data/productBinary.dat";


    public static void writeObjectList(List<ProductBinary> productBinaryList) {
        FileOutputStream fos;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(FILE_PATH);
            oos = new ObjectOutputStream(fos);

            oos.writeObject(productBinaryList);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }


    public static List<ProductBinary> readObjectList() {
        FileInputStream fis;
        ObjectInputStream ois = null;
        List<ProductBinary> productBinaryList = null;

        try {
            fis = new FileInputStream(FILE_PATH);
            ois = new ObjectInputStream(fis);

            productBinaryList = (List<ProductBinary>) ois.readObject();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return productBinaryList;
    }



}
