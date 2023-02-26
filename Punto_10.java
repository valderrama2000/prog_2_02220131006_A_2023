package taller_3;

import java.util.Scanner;

public class Punto_10 {

    public static void main(String[] args) {
        Scanner Ac =  new Scanner(System.in);
        
        System.out.println("Ingrese las notas de parcial");
        System.out.print("#1-->");
        double P1 = Ac.nextDouble();
        System.out.print("#2-->");
        double P2 = Ac.nextDouble();
        System.out.print("#3-->");
        double P3 = Ac.nextDouble();
        double P4 = (P1+P2+P3)/3.0;
        double Pa = P4*0.55;
        System.out.println("las notas de los patciales son de -->"+Pa);
        
        System.out.println("Ingrese la nota del examen");
        System.out.print("Examen -->");
        double Ex = Ac.nextDouble();
        double ExT = Ex*0.30;
        System.out.println("la nota del examen es-->"+ExT);
        
        System.out.println("Ingrese la nota del taller final");
        System.out.print("Taller-->");
        double T = Ac.nextDouble();
        double tF = T*0.15;
        System.out.println("La nota del taller es-->"+tF);
        
        double Total = Pa+ExT+tF;
        
        System.out.println("las notas son de Parsial acomulada-->"+P4+" Examen-->"+ExT+" Taller-->"+tF+" Total de la Nota-->"+Total);
    }
}
