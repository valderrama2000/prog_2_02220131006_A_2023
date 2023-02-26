package taller_3;

import java.util.Scanner;

public class Punto_9 {

    public static void main(String[] args) {
        Scanner Za = new Scanner (System.in);
        
        System.out.print("Cuanto es el valor de la cuenta del usuario--> ");
         double Tt = Za.nextDouble();
         
         double Ds = Tt*0.15;
         double TD = Tt-Ds;
         
         System.out.println("La factura del usiario con todo y decuanbto es de-->"+TD);
    }
    
}
