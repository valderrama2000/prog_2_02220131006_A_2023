package taller_3;

import java.util.Scanner;

public class Punto_14 {

    public static void main(String[] args) {
      
        Scanner N =new Scanner(System.in);
        
        System.out.println("Ingrese dos numeros-->");
        int d=N.nextInt();
        
        int  N1 = d/10;
        int N2 = d%10;
        
        int nI = N2*10+N1;
        
        System.out.println("El balor final es -->"+nI);
    }
    
}
