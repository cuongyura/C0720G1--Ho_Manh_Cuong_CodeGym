package __16_io_textfile.bai_tap._1_copy_file_io;

import java.io.*;

public class CopyFileIO {

    private static String PATH_FILE_1 = "src/__16_io_textfile/bai_tap/_1_copy_file_io/data/file1.txt";
    private static String PATH_FILE_2 = "src/__16_io_textfile/bai_tap/_1_copy_file_io/data/file2.txt";

    public static void main(String[] args) {
          copyFileOfCSV();

    }

    private static void copyFileOfCSV() {
        try {

            FileReader fileReader = new FileReader(PATH_FILE_1);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            FileWriter fileWriter = new FileWriter(PATH_FILE_2);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String line = null;

            while ((line = bufferedReader.readLine())!= null){

                bufferedWriter.write(line);
                bufferedWriter.newLine();

            }
            bufferedReader.close();
            bufferedWriter.close();
        } catch (FileNotFoundException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        }
    }


}
