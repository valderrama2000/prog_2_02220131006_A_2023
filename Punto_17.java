package taller_3;

import java.util.Scanner;

public class Punto_17 {

    public static void main(String[] args) {
        Scanner G = new Scanner(System.in);
        
        System.out.print("Ingrese la hora de salida (HH)--> ");
        int HH = G.nextInt();
        System.out.print("Ingrese los minutos de salida (MM)--> ");
        int MM = G.nextInt();
        System.out.print("Ingrese los segundos de salida (SS)--> ");
        int SS = G.nextInt();
        System.out.print("Ingrese la velocidad del vehículo (en km/h)--> ");
        double Vc = G.nextDouble();
        System.out.print("Ingrese la distancia entre los puntos A y B (en km)--> ");
        double x = G.nextDouble();
        
        
        int ts = (HH * 3600) + (MM * 60) + SS;
        
        
        int tv = (int) Math.round((x / Vc) * 3600);
        
        
        int tll = ts + tv;
        
        
        int llh = tll / 3600;
        int llm = (tll % 3600) / 60;
        int lls = tll % 60;
        
        System.out.println("la hora de llegada es " +llh+":"+llm+":"+lls);
        
    }
    
}
