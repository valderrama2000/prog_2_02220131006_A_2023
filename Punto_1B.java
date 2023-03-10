import java.util.Scanner;
import java.util.Random;

public class Punto_1B {

    public static void main(String[] args) {
        Random r = new Random();
        int numeroA = r.nextInt(100) + 1; // Genera un número aleatorio del 1 al 100
        int intentos = 10;
        boolean acertado = false;
        Scanner sc = new Scanner(System.in);

        System.out.println("Adivina un número del 1 al 100 en " + intentos + " intentos.");

        do {
            System.out.print("Introduce un número: ");
            int numeroIntroducido = sc.nextInt();
            intentos--;

            if (numeroIntroducido == numeroA) {
                acertado = true;
                System.out.println("¡Enhorabuena, has acertado el número en " + (10 - intentos) + " intentos!");
            } else if (numeroIntroducido < numeroA) {
                System.out.println("El número a adivinar es mayor. Te quedan " + intentos + " intentos.");
            } else {
                System.out.println("El número a adivinar es menor. Te quedan " + intentos + " intentos.");
            }
        } while (!acertado && intentos > 0);

        if (!acertado) {
            System.out.println("¡Lo siento, has agotado tus intentos! El número a adivinar era " + numeroA + ".");
        }
    }
    
}
