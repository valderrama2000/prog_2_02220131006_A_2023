
package Punto_1;

import java.util.Random;


public class Punto_1_2 {


    public static void main(String[] args) {
        int q =0;
        
        Random X = new Random();
        int Z = (X.nextInt(2023)+1);
        
        Random V = new Random();
        int B = (V.nextInt(2023)+1);
                
        while(q<=B){
            
            System.out.println("Tabla De Multplicar Del "+Z+" -------> "+ Z + "*"+ q +" = " + Z*B);
            q++;
        }
        
        System.out.println("El numero A= "+Z );
        System.out.println("El numero B= "+B);
    }
    
}
