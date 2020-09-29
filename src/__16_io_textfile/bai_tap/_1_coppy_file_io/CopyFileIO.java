package __16_io_textfile.bai_tap._1_coppy_file_io;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFileIO {
    public static void main(String[] args) {
          copyFileOfCSV();
    }

    private static void copyFileOfCSV() {

        InputStream inputStream = null;
        OutputStream outputStream = null;

        try {
            inputStream = new FileInputStream(new File(PATH_CSV_FILE1));
            inputStream = new FileInputStream(new File(PATH_CSV_1));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }


}
