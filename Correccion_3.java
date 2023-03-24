package co.edu.udes.correccion_1;

import java.util.Scanner;

public class Correccion_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el número de latas: ");
        int numLatas = sc.nextInt();

        int numPisos = 0;
        int numLatasUsadas = 0;

        while (numLatasUsadas < numLatas) {
            numPisos++;
            numLatasUsadas += numPisos;
        }

        if (numLatasUsadas > numLatas) {
            numPisos--;
            numLatasUsadas -= numPisos;
        }

        if (numLatasUsadas == numLatas) {
            System.out.println("El número de latas es adecuado para apilar.");
        } else {
            System.out.println("El número de latas no es adecuado para apilar.");
            System.out.println("El número más cercano de latas que se puede apilar es " + numLatasUsadas + ".");
        }
    }
    
}
