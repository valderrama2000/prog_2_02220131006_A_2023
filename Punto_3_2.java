
package Punto_3;

import java.util.Random;
import java.util.Scanner;

public class Punto_3_2 {

    public static void main(String[] args) {
        Random P = new Random();
        int p = (P.nextInt(23)+1);
        
        Scanner S = new Scanner(System.in);
        String [] nombre = new String [p];
        int [] cantidad = new int [p];
        double [] precio = new double [p];
        
         
        int i=0;   
        while(i<p){
            System.out.println("ingrese nombre");
            nombre[i] = S.next();

            System.out.println("Ingrese cantidad");
            cantidad[i] = S.nextInt();

            System.out.println("Ingrese precio");
            precio[i] = S.nextDouble();
            
            i++;
        }
        i = 0;       
        while(i<p){
            System.out.println("Nombre --> "+nombre[i]+"\nCantidad ---> " +cantidad[i]+"\nPrecios -----> " + precio[i]);          
            i++;   
        }
    }
}
    

