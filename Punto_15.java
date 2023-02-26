package taller_3;

import java.util.Scanner;

public class Punto_15 {

    public static void main(String[] args) {
        Scanner AB =new Scanner(System.in);
        
        System.out.print("Ingrese A=");
        int A = AB.nextInt();
        System.out.print("Ingrese B=");
        int B = AB.nextInt();
        
        int temporal= A;
        A= B;
        B=temporal;
        
        System.out.println("Balor de A"+A+" Balor de B"+B);
    }
    
}
