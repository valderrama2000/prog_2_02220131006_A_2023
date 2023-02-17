
package Punto_2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Punto_2_1 {


    public static void main(String[] args) {
        
        Random P = new Random();
        int p = (P.nextInt(06)+1);
        
        Scanner z = new Scanner(System.in);    
        
        double q[] = new double [p];
      
        System.out.println("Ingrese la cantidad de numeros --> " + p);
        
        for (int X=0;X<p;X++){
            System.out.print("Diguite el numero " +(X+1)+"--> ");
            q[X]=z.nextFloat(); 
        }
        
        Arrays.sort(q);
        for(int L=0;L<q.length;L++){
            System.out.println("Orden "+q[L]);
        }
        //Promedio
        double  Pro = 0.0;
        for(int L = 0;L<q.length;L++){
            Pro = Pro + q [L];
        }
        Pro = Pro / q.length;
        System.out.println("El Promedio es ---> "+Pro);
        
        //Mediana
        int Med = 0;
        if(q.length==0){
          Med = (int) q[0];  
        }else{
            if(q.length %2 == 0){
                Med = (int) ((q[(q.length/2)- 1] + q[(q.length/2)])/2);
            }else{
                Med = (int) q[q.length/2];
            }
        }
        System.out.println("Mediuana es ---> "+ Med);
        
        //Moda
        int Mod = 0;
        int Repeticiones = 0;
        for(int M=0; M<q.length; M++){
            int nR = 0;
            for(int m=0; m<q.length; m++){
                if(q[M]==q[m]){
                    nR++;
                }
                if(nR>Repeticiones){
                    Mod = (int) q[M];
                    Repeticiones = nR;
                }
            }
        }
        System.out.println("La Moda es ---> "+ Mod);
    }
}
    

