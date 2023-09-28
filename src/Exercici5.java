import java.io.*;
import java.util.Scanner;

public class Exercici5 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Introduce a path: ");
            var path = br.readLine();

            while (true) {

                System.out.println("Introduce a mode r (read) w (write) e(exit): ");
                var mode = br.readLine();

                switch (mode) {
                    case "r":
                        readFile(path);
                        break;
                    case "w":
                        writeFile(path);
                        break;
                    case "e":
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid mode.");
                        break;
                }
            }
        } catch(IOException e){
            System.err.println("Error reading input: " + e.getMessage());
        }
    }

    private static void readFile(String path) {
        try {
            File myObj = new File(path);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    private static void writeFile(String path) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {

            System.out.println("Introduce a el contingut a escriure a l'arxiu: ");
            var str = br.readLine();

            File myObj = new File(path);
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }

            FileWriter writer = new FileWriter(path, true);
            str = "\n" + str;
            writer.append(str);
            writer.close();
            System.out.println("Content written to the file.");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
