
package taller_3;

import java.util.Scanner;

public class Punto_3 {


    public static void main(String[] args) {
         System.out.println("de cuanto es la base ");
        Scanner Base = new Scanner(System.in);
        int base = Base.nextInt();
        
        System.out.println("de cuanto es el alto ");
        Scanner Alto = new Scanner(System.in);
        int alto = Alto.nextInt();
        
        System.out.println("teniendo el Alto-->"+alto+" y la Base-->"+base+" Podemos sacar la hipotenusa");
        
        double  hipotenusa = Math.hypot(alto, base);
        System.out.println("La hipotenusa es -->"+hipotenusa);
        
    }
    
}
