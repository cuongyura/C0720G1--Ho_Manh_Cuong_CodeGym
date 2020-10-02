package __16_io_textfile.op.thuc_hanh._1_total_number_in_file_text;

import java.io.*;

public class ReadFileExample {
    public static void main(String[] args) {
        try {
            readFileText("src/__16_io_textfile/op/thuc_hanh/_1_total_number_in_file_text/total.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFileText(String filePath) throws IOException {

         // read file follows link:
         File file = new File(filePath);

         // check file if isEmpty exp:

        if(!file.exists()) {
            throw new FileNotFoundException();
        }

        // read file and proceed add number:

        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = "";
        int sum = 0;

        while ((line = br.readLine()) != null) {

            System.out.println(line);
            sum += Integer.parseInt(line);
        }
        br.close();

        // show total number in file:
        System.out.println("total is : " + sum);

    }
}
