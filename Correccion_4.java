package co.edu.udes.correccion_1;

import java.util.Scanner;

public class Correccion_4 {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el número de elementos de la serie de Fibonacci a visualizar: ");
        int numElementos = sc.nextInt();

        int fib1 = 0;
        int fib2 = 1;

        System.out.print("La serie de Fibonacci con " + numElementos + " elementos es: " + fib1 + " " + fib2);

        for (int i = 2; i < numElementos; i++) {
            int fib3 = fib1 + fib2;
            System.out.print(" " + fib3);
            fib1 = fib2;
            fib2 = fib3;
        }
        
    }
    
}
