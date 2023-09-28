import java.util.Scanner;

/**
 * <h1>Exercici 2</h1>
 * <p>
 * A aquesta activitat hem de dissenyar un programa que et faci la mitjana de les notes
 * d'un alumne, per a això el programa t'ha de sol·licitar el nom de l'alumne i les notes
 * de les 3 avaluacions per pantalla i mostrar el resultat final.
 * </p>
 */

public class Exercici2 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introdueix el nom de l'alumne");
        var nom = scanner.nextLine();

        var nota1 = readDouble("Introdueix la nota de la primera avaluació");
        var nota2 = readDouble("Introdueix la nota de la segona avaluació");
        var nota3 = readDouble("Introdueix la nota de la tercera avaluació");

        System.out.println("La nota mitjana de " + nom + " és " + ((nota1 + nota2 + nota3) / 3));
    }

    // Funcio que demana un nombre double per terminal fins que aquest compleix amb el format
    private static double readDouble(String msg) {
        System.out.println(msg);
        try {
            return scanner.nextDouble();
        } catch (Exception e) {
            scanner.next();
            return readDouble(msg);
        }
    }
}
