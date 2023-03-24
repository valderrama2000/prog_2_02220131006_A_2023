package co.edu.udes.correccion_1;

import java.util.Scanner;

public class Correccion_6 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();
        sc.close();

        String[] palabras = frase.split(" ");
        int numPalabras = palabras.length;

        System.out.println("Número de palabras: " + numPalabras);

        for (String palabra : palabras) {
            int numCaracteres = palabra.length();
            System.out.println("Palabra: " + palabra + " - Número de caracteres: " + numCaracteres);
        }
    }
    
}
