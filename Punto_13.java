package taller_3;

import java.util.Scanner;

public class Punto_13 {

    public static void main(String[] args) {
       Scanner R = new Scanner (System.in);
       
       System.out.print("Ingrese el numero que sera usado en la fotmula-->");
       double n = R.nextDouble();
       
       double Rz2 = Math.sqrt(n);
       double Rz3 = Math.cbrt(n);
       
       System.out.println("El numero "+n+" al ser sometido alas ecuaciones dio el resultado");
        System.out.println("En la Raiz cuadrada es de-->"+Rz2);
        System.out.println("En la Raiz cubica es de-->"+Rz3);
        
    }
    
}
