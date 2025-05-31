

import java.io.*;

public class Task4{
    public static void main(String[] args) {
        String filePath = "\"C:\\Users\\Raviteja\\OneDrive\\Documents\\Food Website\\ice_cream.jpg\"";

        try {
            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);

            String line;

            System.out.println("Contents of the file:");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close(); 
            fr.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

