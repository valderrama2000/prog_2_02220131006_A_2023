
package Punto_2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Punto_2_3 {


    public static void main(String[] args) {
        int T=0;
        
        Random F = new Random();
        int f = (F.nextInt(06)+1);
        
        Scanner S = new Scanner(System.in);    
        
        double G[] = new double [f];
      
        System.out.println("Ingrese la cantidad de numeros --> " + f);
        
        do{
            System.out.print("Diguite el numero " +(T+1)+"--> ");
            G[T]=S.nextFloat();
            T++;
        }while(T<f);
        
        Arrays.sort(G);
        int j=0;
        do{
            System.out.println("Orden "+G[j]);
            j++;
        }while(j<G.length);
        
        //Promedio
        double  Pro = 0.0;
        int U=0;
        do{
            Pro = Pro + G [U];
            U++;
        }while(U<G.length);
        Pro = Pro / G.length;
        System.out.println("El Promedio es ---> "+Pro);
        
        //Mediana
        int Med = 0;
        if(G.length==0){
          Med = (int) G[0];  
        }else{
            if(G.length %2 == 0){
                Med = (int) ((G[(G.length/2)- 1] + G[(G.length/2)])/2);
            }else{
                Med = (int) G[G.length/2];
            }
        }
        System.out.println("Mediuana es ---> "+ Med);
        
        //Moda
        int Mod = 0;
        int Repeticiones = 0;
        int M=0;
        do{
            int nR = 0;
            int m=0;
            do{
                if(G[M]==G[m]){
                    nR++;
                }
                if(nR>Repeticiones){
                    Mod = (int) G[M];
                    Repeticiones = nR;
                }
                m++;
            }while(m<G.length);
            M++;
        }while(M < G.length);
        System.out.println("La Moda es ---> "+ Mod);
    }
    
}
