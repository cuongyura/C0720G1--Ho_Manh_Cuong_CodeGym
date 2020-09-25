package case_study_furama.Commons;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
    // declare variable read and write file:

    private static BufferedReader bufferedReader;
    private static BufferedWriter bufferedWriter;
    private static String path;

    // method to write file:
    // declare a array string to cup properties

    public static void writeFile(String[] content) {
        try {
             bufferedWriter = new BufferedWriter(new FileWriter(path, true));
             // write file:
             bufferedWriter.write(StringUtils.concat(content,StringUtils.COMMA));
             // give down it line:
            bufferedWriter.newLine();

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // method read file:
    public static List<String> readFile() {
        // create a array list to contain properties:
        List<String> arrayContent = new ArrayList<String>();
        try {

            bufferedReader = new BufferedReader(new FileReader(path));

            // read all content in file CSV:
            String line = null;

            while ((line = bufferedReader.readLine()) != null) {
                 arrayContent.add(line);
            }

            bufferedReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return arrayContent;
    }

    // method to update path:
    public static void setFullPathFile(String fileName) {

        StringBuffer path = new StringBuffer("E:\\Module2\\src\\case_study_furama\\Data\\");
        // add name file:
        path.append(fileName);
        // add tail file:
        path.append(StringUtils.CSV);

        FileUtils.path = path.toString();

    }


}
