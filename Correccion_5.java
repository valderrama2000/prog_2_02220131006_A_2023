package co.edu.udes.correccion_1;

import java.util.Scanner;


public class Correccion_5 {

    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el número de asteriscos para la base del triángulo: ");
        int numAsteriscos = sc.nextInt();

        System.out.print("Introduce la alineación del triángulo (D = Derecha, I = Izquierda): ");
        char alineacion = sc.next().charAt(0);

        for (int i = 1; i <= numAsteriscos; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        if (alineacion == 'D') {
            for (int i = 1; i <= numAsteriscos; i++) {
                for (int j = 1; j <= numAsteriscos - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else if (alineacion == 'I') {
            for (int i = 1; i <= numAsteriscos; i++) {
                for (int j = 1; j <= numAsteriscos - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else {
            System.out.println("Opción de alineación inválida. Por favor ingrese 'D' para derecha o 'I' para izquierda.");
        }
    }
    
}
