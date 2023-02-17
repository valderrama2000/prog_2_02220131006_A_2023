
package Punto_3;

import java.util.Random;
import java.util.Scanner;


public class Punto_3_4 {


    public static void main(String[] args) {
       Random P = new Random();
        int p = (P.nextInt(2)+1);
        
        Scanner S = new Scanner(System.in);
        String [] nombre = new String [p];
        int [] cantidad = new int [p];
        double [] precio = new double [p];
       
        int k=0;
        
        for(int l: cantidad ){
            
            System.out.println("ingrese nombre");
            nombre[k] = S.next();

            System.out.println("Ingrese cantidad");
            cantidad[k] = S.nextInt();

            System.out.println("Ingrese precio");
            precio[k] = S.nextDouble();
            k++;
        }
        int s=0;
        for(int l: cantidad){
           System.out.println("Nombre --> "+nombre[s]+"\nCantidad ---> " +cantidad[s]+"\nPrecios -----> " + precio[s]);
        }
        
    }
    
}
