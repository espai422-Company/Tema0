import java.util.Scanner;

/**
 * <h1>Exercici 3</h1>
 * <p>
 * A aquesta activitat hem de dissenyar un programa que calculi el sou d'un
 * treballador. Ha de demanar quantes hores fa feina al dia, quants de dies al mes fa
 * feina i a quant cobra les hores. Finalment ha de mostrar el resultat per pantalla.
 * </p>
 */

public class Exercici3 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        var horesDiaries = readDouble("Introdueix el nombre d'hores ");
        var diesAlMes = readDouble("Introdueix els dies al mes que treballa");
        var preuHora = readDouble("Introudeix que cobra cada hora");

        System.out.println("el salari es" + (horesDiaries * diesAlMes * preuHora));

    }


    /**
     * Demana un nombre enter per la terminal fins que aquest compleix amb el format
     * com que pot fer feine 1h i 30 min o treballar 2 dies i mig o cobrar 10.1€ l'hora, utilitzarem decimals
    */

    private static double readDouble(String msg) {
        System.out.println(msg);
        try {
            return scanner.nextDouble();
        } catch (Exception e) {
            scanner.next(); // Buidar el buffer
            return readDouble(msg);
        }
    }
}

