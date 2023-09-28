import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercici4 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Introduce a String: ");
            var str = br.readLine();

            System.out.println("Introduce an int: ");
            var i = Integer.parseInt(br.readLine());

            System.out.println("Introduce a float: ");
            var f = Float.parseFloat(br.readLine());

            System.out.println("Introduce a double: ");
            var d = Double.parseDouble(br.readLine());

            // Your code to process the inputs goes here

        } catch (IOException e) {
            System.err.println("Error reading input: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error: Please enter a valid number.");
        }
    }
}
