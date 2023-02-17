
package Punto_2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Punto_2_4 {


    public static void main(String[] args) {
        
        int Y=0;
        
        Random K = new Random();
        int k = (K.nextInt(06)+1);
        
        Scanner N = new Scanner(System.in);    
        
        int H[] = new int [k];
        
        double A=0,Pro,Med,Mod=0;
      
        System.out.println("Ingrese la cantidad de numeros --> " + k);
        
        Arrays.sort(H);
        
        for(int L:H){
            System.out.println((Y+1)+":");
            H[Y] = N.nextInt();
            A += H[Y];
            Y++;
        }
        Arrays.sort(H);
        for(int L:H){
            System.out.println("Orden "+H[L]);
        }

        //promedio
    }
    
}
