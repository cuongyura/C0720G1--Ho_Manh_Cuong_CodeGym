    package case_study_furama.Commons;

    import java.io.*;
    import java.util.ArrayList;
    import java.util.List;

    public class FileUtils {

        // write file:

        public static void writeFile(String line, String fileName){
            try {
                FileWriter fileWriter = new FileWriter(fileName, true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(line);
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        // read file:

        public static List<String> readObject(String fileName) {
            List<String> listStr = new ArrayList<>();
            try {
                FileReader fileReader = new FileReader(fileName);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line = null;

                while ((line = bufferedReader.readLine()) != null) {
                    listStr.add(line);
                }
                bufferedReader.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return  listStr;
        }



    }
