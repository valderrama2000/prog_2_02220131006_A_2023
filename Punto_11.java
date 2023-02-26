package taller_3;

import java.util.Scanner;

public class Punto_11 {

    public static void main(String[] args) {
        
        Scanner Ds = new Scanner(System.in);
        
        System.out.print("Distancia #1-->");
        double Ds1 = Ds.nextDouble();
        
        System.out.print("Distancia #2-->");
        double Ds2 = Ds.nextDouble();
        
        double DsT = Math.abs(Ds1-Ds2); 
        System.out.print("La distancia entre los puntos son de-->"+DsT);
    }
    
}
