package __16_io_text_file.bai_tap._1_copy_file_io;

import java.io.*;

public class CopyFileIO {

    private static String PATH_FILE_1 = "src/__16_io_textfile/bai_tap/_1_copy_file_io/data/file1.txt";
    private static String PATH_FILE_2 = "src/__16_io_textfile/bai_tap/_1_copy_file_io/data/file2.txt";

    public static void main(String[] args) {
          copyFileOfCSV();

    }

    private static void copyFileOfCSV() {

        InputStream inputStream = null;
        OutputStream outputStream = null;

        try {

             inputStream = new FileInputStream(new File(PATH_FILE_1));
             outputStream = new FileOutputStream(new File(PATH_FILE_2));

             int length;
             byte[] buffer = new byte[1024];

             // copy the file content int bytes

            while ((length = inputStream.read(buffer)) > 0) {
                   outputStream.write(buffer, 0 , length);
            }

            System.out.println("File is copied successful! ");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }


}
