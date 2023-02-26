package taller_3;

import java.util.Scanner;

public class Punto_7 {

    public static void main(String[] args) {
        
        Scanner H = new Scanner (System.in);
        
        System.out.print("hola que cnatidad desea poner para la convercion -->");
        int minutos=H.nextInt();
        
        int horas = minutos/60;
        int rsto = minutos%60;
        
        System.out.print("El timpo en horas es --->"+horas+" y los minutos sabrantes-->"+rsto);
    }
    
}
