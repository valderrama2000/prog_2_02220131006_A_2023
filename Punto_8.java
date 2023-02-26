package taller_3;

import java.util.Scanner;

public class Punto_8 {

    public static void main(String[] args) {
        Scanner en =new Scanner(System.in);
        
        System.out.print("Ingrese la ganacias de $teven =");
        double sueldo = en.nextDouble();
        
        System.out.print("Veneta #1-->");
        double n1= en.nextDouble();
        
        System.out.print("Venta #2-->");
        double n2 = en.nextDouble();
        
        System.out.print("Venta #3-->");
        double n3 = en.nextDouble();
        
        double GxV = (n1+n2+n3)*0.10;
        double GT = (GxV+sueldo);
        
        System.out.println("Las ventas de $teven son de-->"+GxV+"+"+sueldo+"="+GT);
    }
    
}
