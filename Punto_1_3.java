
package Punto_1;

import java.util.Random;


public class Punto_1_3 {


    public static void main(String[] args) {
        
        int w=0;
        
        Random L = new Random();
        int l = (L.nextInt(2023)+1);
        
        Random K = new Random();
        int k = (K.nextInt(2023)+1);
        
            do{
              System.out.println("Tabla De Multplicar Del "+l+" -------> "+ l + "*"+ w +" = " + l*k);
            }while(w++<k);
            
        System.out.println("El numero A= "+l );
        System.out.println("El numero B= "+k);
    }
    
}
