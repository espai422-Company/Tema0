import java.util.Scanner;

/**
 * <h1>Exercici 1</h1>
 * <p>
 * A aquesta activitat hem de dissenyar un programa que et faci la mitjana de les notes
 * d'un alumne, per a això el programa t'ha de sol·licitar el nom de l'alumne i les notes
 * de les 3 avaluacions per pantalla i mostrar el resultat final.
 * </p>
 */


public class Exercici1 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Demana els nombres enters
        var a = readInt("Introduix el primer nombre enter");
        var b = readInt("Introduix el segon nombre enter");

        // Imprimeix els resultats
        System.out.println("La suma de " + a + " i " + b + " és " + (a + b));
        System.out.println("La resta de " + a + " i " + b + " és " + (a - b));
        System.out.println("La multiplicació de " + a + " i " + b + " és " + (a * b));
        // divisió entera
        System.out.println("La divisió de " + a + " i " + b + " és " + (a / b));

    }

    // Demana un nombre enter per la terminal fins que aquest compleix amb el format
    private static int readInt(String msg) {
        System.out.println(msg);

        try {
            return scanner.nextInt();
        } catch (Exception e) {
            scanner.next(); // buidar el buffer
            return readInt(msg);
        }
    }
}

