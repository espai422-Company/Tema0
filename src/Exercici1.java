/*
A aquest programa hem de definir dos nombre enters amb el valor que vulgueu
vosaltres. Per pantalla hem de mostrar la suma, la resta la multiplicació i la divisió
d'aquests dos nombres. (Una línia per cada resultat.)
*/

import java.util.Scanner;

public class Exercici1 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Demana els nombres enters
        var a = readInt("Introduix el primer nombre enter");
        var b = readInt("Introduix el segon nombre enter");

        // Imprimeix els resultats
        System.out.println("La suma de " + a + " i " + b + " és " + (a + b));
        System.out.println("La resta de " + a + " i " + b + " és " + (a - b));
        System.out.println("La multiplicació de " + a + " i " + b + " és " + (a * b));
        System.out.println("La divisió de " + a + " i " + b + " és " + (a / b));

    }

    // Demana un nombre enter per la terminal fins que aquest compleix amb el format
    private static int readInt(String msg) {
        System.out.println("Introdueix un nombre enter: ");
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            return readInt(msg);
        }
    }
}
