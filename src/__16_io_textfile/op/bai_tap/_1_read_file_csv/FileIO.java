package __16_io_textfile.op.bai_tap._1_read_file_csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileIO {

    private static final String PATH = "src/__16_io_textfile/op/bai_tap/_1_read_file_csv/data/listnation.csv";

    // method read file .csv:
    public static BufferedReader bufferedReader = null;

    public static void getToFileCSV() throws IOException {

        ArrayList<String> listStr = new ArrayList<String>();
        String line = null;
        bufferedReader = new BufferedReader(new FileReader(PATH));

        while ((line = bufferedReader.readLine())!= null) {
            String[] splitData = line.split(",");
            for (String str : listStr){
                System.out.println(str);
            }

        }
    }

}
