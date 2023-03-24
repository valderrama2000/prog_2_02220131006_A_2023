package co.edu.udes.correccion_1;

import java.util.Scanner;

public class Correccion_8 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Definimos las constantes de la tabla
        final int NUM_ASIGNATURAS = 5;
        final String[] ASIGNATURAS = {"Programación", "Bases de datos", "Redes", "Sistemas operativos", "Inglés"};
        final int NUM_MESES = 12;

        // Creamos la matriz para almacenar los datos de la tabla
        int[][] tabla = new int[NUM_ASIGNATURAS][NUM_MESES];

        // Pedimos al usuario los datos de la tabla
        for (int i = 0; i < NUM_ASIGNATURAS; i++) {
            System.out.println("Asignatura: " + ASIGNATURAS[i]);
            for (int j = 0; j < NUM_MESES; j++) {
                System.out.print("Horas dedicadas en el mes " + (j+1) + ": ");
                tabla[i][j] = sc.nextInt();
            }
        }

        // Calculamos el total anual de horas dedicadas a cada asignatura
        int[] totalAnual = new int[NUM_ASIGNATURAS];
        for (int i = 0; i < NUM_ASIGNATURAS; i++) {
            for (int j = 0; j < NUM_MESES; j++) {
                totalAnual[i] += tabla[i][j];
            }
            System.out.println("Total anual de horas dedicadas a " + ASIGNATURAS[i] + ": " + totalAnual[i]);
        }

        // Calculamos el total mensual de horas dedicadas a estudiar
        int[] totalMensual = new int[NUM_MESES];
        for (int i = 0; i < NUM_MESES; i++) {
            for (int j = 0; j < NUM_ASIGNATURAS; j++) {
                totalMensual[i] += tabla[j][i];
            }
            System.out.println("Total mensual de horas dedicadas a estudiar en el mes " + (i+1) + ": " + totalMensual[i]);
        }

        // Buscamos la asignatura más estudiada
        int maxHoras = Integer.MIN_VALUE;
        String asignaturaMasEstudiada = "";
        for (int i = 0; i < NUM_ASIGNATURAS; i++) {
            if (totalAnual[i] > maxHoras) {
                maxHoras = totalAnual[i];
                asignaturaMasEstudiada = ASIGNATURAS[i];
            }
        }
        System.out.println("La asignatura más estudiada es " + asignaturaMasEstudiada + " con un total de " + maxHoras + " horas.");

        // Buscamos la asignatura menos estudiada
        int minHoras = Integer.MAX_VALUE;
        String asignaturaMenosEstudiada = "";
        for (int i = 0; i < NUM_ASIGNATURAS; i++) {
            if (totalAnual[i] < minHoras) {
                minHoras = totalAnual[i];
                asignaturaMenosEstudiada = ASIGNATURAS[i];
            }
        }
        System.out.println("La asignatura menos estudiada es " + asignaturaMenosEstudiada + " con un total de " + minHoras);
    }
    
}
