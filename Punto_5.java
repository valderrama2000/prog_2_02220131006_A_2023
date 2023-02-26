package taller_3;

import java.util.Scanner;

public class Punto_5 {


    public static void main(String[] args) {
        
         System.out.print("de cuanto es la Temperatura--->");
        Scanner temperatura = new Scanner(System.in);
        float Temperatura = temperatura.nextInt();
        
        float fahrenheit;
        fahrenheit = 32+(9*Temperatura/5);
        
        System.out.println("los grados indicados en Fahrenheit son-->"+fahrenheit);
    }
    
}
