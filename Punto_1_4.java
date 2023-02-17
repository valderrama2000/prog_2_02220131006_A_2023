
package Punto_1;

import java.util.Random;


public class Punto_1_4 {


    public static void main(String[] args) {
        
        Random P = new Random();
        int p = (P.nextInt(2023)+1);
        
        Random F = new Random();
        int f = (F.nextInt(2023)+1);
       
        int[] R=new int [f+1];
        for(int N=0;N<=f;N++){
            
            R[N]=N;
        }
        
        for(int array:R){
            System.out.println("Tabla De Multplicar Del "+ p +" -------> "+ p + "*"+ array +" = " + p*array);
        }
        
        System.out.println("El numero A= "+p );
        System.out.println("El numero B= "+f);
    }
    
}
