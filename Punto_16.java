package taller_3;

import java.util.Scanner;

public class Punto_16 {

    public static void main(String[] args) {
        Scanner K = new Scanner(System.in);
        
        System.out.print("Introdisca la velosidad del primer carro-->");
        double C1= K.nextDouble();
        
        System.out.print("Ingrese la velosidad del segundo carro que va mas rapido de el primero-->");
        double C2 = K.nextDouble();
        
        System.out.print("Ingrese la distancia entre los carros-->");
        double Ds = K.nextDouble();
        
        double tiempo = (Ds/(C1-C2))*60;
        
        System.out.println("El segundo carro alcansara al primero en "+tiempo+"minutos");
    }
}
