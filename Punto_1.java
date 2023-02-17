
package Punto_1;

import java.util.Random;


public class Punto_1 {


    public static void main(String[] args) {
        Random S = new Random();
        int N = (S.nextInt(2023)+1);
        
        Random T = new Random();
        int I = (T.nextInt(2023)+1);
        
        int factor_s = N;
            for(int factor_i=0; factor_i <= I; factor_i++){
             System.out.println("Tabla De Multplicar Del "+factor_s+" -------> "+ factor_s + "*"+ factor_i +" = " + factor_s*factor_i);
            }
               
        System.out.println("El numero A= "+N );
        System.out.println("El numero B= "+I);
    }
    
}
