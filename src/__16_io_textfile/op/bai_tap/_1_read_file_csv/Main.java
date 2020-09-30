package __16_io_textfile.op.bai_tap._1_read_file_csv;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    private static ArrayList<String> listArrays = new ArrayList<>();

    public static void main(String[] args) {

        try {
            FileIO.getToFileCSV();
            for (String str : listArrays){
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
