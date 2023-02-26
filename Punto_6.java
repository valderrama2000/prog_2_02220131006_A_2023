package taller_3;

import java.util.Scanner;

public class Punto_6 {

    public static void main(String[] args) {
         Scanner V = new Scanner(System.in);

        System.out.print("Introduce el primer número--->");
        double num1 = V.nextDouble();

        System.out.print("Introduce el segundo número--->");
        double num2 = V.nextDouble();

        System.out.print("Introduce el tercer número--->");
        double num3 = V.nextDouble();

        double media = (num1 + num2 + num3) / 3;

        System.out.println("La media de los tres números es: " + media);

    }
    
}
