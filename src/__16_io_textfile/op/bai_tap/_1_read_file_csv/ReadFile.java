package __16_io_textfile.op.bai_tap._1_read_file_csv;

import java.io.*;

public class ReadFile {
    public static void main(String[] args) {
        try {
            getFile("src/__16_io_textfile/op/bai_tap/_1_read_file_csv/file.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void getFile(String pathFile) throws IOException {

         // read file link:
         File file = new File(pathFile);

         // if : file isEmpty:

         if(!file.exists()) {
             throw new FileNotFoundException();
         }

         // read line file:

        BufferedReader br = new BufferedReader( new FileReader(file));
         String line = "";
         int sum = 0;

         while ((line = br.readLine()) != null) {
             System.out.println(line);

         }
         br.close();


    }

}
