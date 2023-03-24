
package co.edu.udes.correccion_1;

import java.util.Scanner;

public class Correccion_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce el número de segundos: ");
        int segundos = input.nextInt();
        
        int dias = segundos / 86400;
        segundos = segundos % 86400;
        
        int horas = segundos / 3600;
        segundos = segundos % 3600;
        
        int minutos = segundos / 60;
        segundos = segundos % 60;
        
        // Formato 24H
        System.out.printf("%d días, %02d:%02d:%02d%n", dias, horas, minutos, segundos);
        
        // Formato 12H
        String am_pm = (horas < 12) ? "AM" : "PM";
        int horas_12h = (horas > 12) ? (horas - 12) : horas;
        System.out.printf("%d días, %02d:%02d:%02d %s%n", dias, horas_12h, minutos, segundos, am_pm);
    }
}
