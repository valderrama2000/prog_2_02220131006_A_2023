package taller_3;

import java.util.Scanner;

public class Punto_4 {

    public static void main(String[] args) {
        
       System.out.print("inglese el numero 1--->");
       Scanner Numero1 = new Scanner(System.in);
       int Nu1=Numero1.nextInt();
       
       System.out.print("ingrese el numnero 2-->");
       Scanner Numero2 = new Scanner(System.in);
       int Nu2=Numero2.nextInt();
       
        System.out.println("buen teniuednis estois nuemros sumaremos,restaresmos,dividiremos y multiplicaremos");
        System.out.println("SUMA");
        int suma=Nu1+Nu2;
        System.out.println(suma);
        System.out.println("RESTA");
        int resta = Nu1-Nu2;
        System.out.println(resta);
        System.out.println("DIVICION");
        if(Nu2 <= 0){
            
            System.out.println("la bivision entre "+Nu2+" no se puede ");
    }else{
            double division = Nu1/Nu2;
            System.out.println(division);
        }
        
        System.out.println("MULTIPICACION");
        int multi = Nu1*Nu2;
        System.out.println(multi);
    }
    
}
