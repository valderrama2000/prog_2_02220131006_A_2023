package co.edu.udes.correccion_1;

import java.util.Arrays;
import java.util.Scanner;

public class Correccion_7 {

    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);

        // Pedimos al usuario el tamaño de los vectores
        System.out.print("Introduce el tamaño de los vectores: ");
        int tam = sc.nextInt();

        // Creamos los vectores
        int[] vector1 = new int[tam];
        int[] vector2 = new int[tam];
        int[] vector3 = new int[2 * tam];

        // Pedimos al usuario los valores del primer vector
        System.out.println("Introduce los valores del primer vector:");
        for (int i = 0; i < tam; i++) {
            System.out.print("Valor " + (i+1) + ": ");
            vector1[i] = sc.nextInt();
        }

        // Pedimos al usuario los valores del segundo vector
        System.out.println("Introduce los valores del segundo vector:");
        for (int i = 0; i < tam; i++) {
            System.out.print("Valor " + (i+1) + ": ");
            vector2[i] = sc.nextInt();
        }

        // Fusionamos los vectores y los ordenamos ascendente y descendente
        int k = 0;
        for (int i = 0; i < tam; i++) {
            vector3[k++] = vector1[i];
            vector3[k++] = vector2[i];
        }
        Arrays.sort(vector3);
        int[] vector4 = Arrays.copyOf(vector3, vector3.length);
        for (int i = 0; i < vector4.length / 2; i++) {
            int temp = vector4[i];
            vector4[i] = vector4[vector4.length - i - 1];
            vector4[vector4.length - i - 1] = temp;
        }

        // Imprimimos los resultados
        System.out.println("Vector fusionado y ordenado ascendente: " + Arrays.toString(vector3));
        System.out.println("Vector fusionado y ordenado descendente: " + Arrays.toString(vector4));
    
    }
    
}
