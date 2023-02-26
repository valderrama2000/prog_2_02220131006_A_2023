package taller_3;
import java.util.Scanner;

public class Punto_12 {

    public static void main(String[] args) {
        Scanner XY = new Scanner(System.in);
        
        System.out.print("Ingrese la cordenada X #1-->");
        double x1 = XY.nextDouble();
        System.out.print("Ingrese la cordenada Y #1-->");
        double y1 = XY.nextDouble();
        
        System.out.print("Ingrese la cordenada del X #2-->");
        double x2 = XY.nextDouble();
        System.out.print("Ingrese la cordenada de Y #2-->");
        double y2 = XY.nextDouble();
        
        double Distancia = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        System.out.println("La distancia entre los puntos (" + x1 + "," + y1 + ") y (" + x2 + "," + y2 + ") es " + Distancia);
             
    }
    
}
