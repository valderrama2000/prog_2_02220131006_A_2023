
package Punto_2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Punto_2_2 {

    public static void main(String[] args) {
       
        int V=0;
        
        Random R = new Random();
        int r = (R.nextInt(06)+1);
        
        Scanner S = new Scanner(System.in);    
        
        double A[] = new double [r];
      
        System.out.println("Ingrese la cantidad de numeros --> " + r);
        
        while(V<r){
            System.out.print("Diguite el numero " +(V+1)+"--> ");
            A[V]=S.nextFloat();
            V++;
        }
        
        Arrays.sort(A);
        int j=0;
        while(j<A.length){
            System.out.println("Orden "+A[j]);
            j++;
        }
        
        //Promedio
        double  Pro = 0.0;
        int U=0;
        while(U<A.length){
            Pro = Pro + A [U];
            U++;
        }
        Pro = Pro / A.length;
        System.out.println("El Promedio es ---> "+Pro);
        
        //Mediana
        int Med = 0;
        if(A.length==0){
          Med = (int) A[0];  
        }else{
            if(A.length %2 == 0){
                Med = (int) ((A[(A.length/2)- 1] + A[(A.length/2)])/2);
            }else{
                Med = (int) A[A.length/2];
            }
        }
        System.out.println("Mediuana es ---> "+ Med);
        
        //Moda
        int Mod = 0;
        int Repeticiones = 0;
        int M=0;
        while(M < A.length){
            int nR = 0;
            int m=0;
            while(m<A.length){
                if(A[M]==A[m]){
                    nR++;
                }
                if(nR>Repeticiones){
                    Mod = (int) A[M];
                    Repeticiones = nR;
                }
                m++;
            }
            M++;
        }
        System.out.println("La Moda es ---> "+ Mod);
    }
    
}
