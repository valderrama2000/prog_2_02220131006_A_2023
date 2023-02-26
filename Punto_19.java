package taller_3;

import java.util.Scanner;

public class Punto_19 {

    public static void main(String[] args) {
        Scanner N = new Scanner(System.in);
        
        System.out.print("Cantidad de preguntas -->");
        int Kp = N.nextInt();
        System.out.print("Ingrese la cantidad de preguntas buenas-->");
        int Cr = N.nextInt();
        System.out.print("Igrese la cantidad de preguntas incorrectas-->");
        int Ir = N.nextInt();
        System.out.print("Ingrese lka contidad de preguntas en blanco-->");
        int Br = N.nextInt();
        
        if(Cr>Kp){
            System.out.println("impisoble");
        }
        if(Ir>Kp){
            System.out.println("imposible");
                
        }
        if(Br>Kp){
            System.out.println("imposible");
        }
        int Cantida = (Cr+Ir+Br);
        if(Cantida>Kp){
            System.out.println("Imposible");
        }
        int notaf=(Cr*5)-Ir;
        System.out.println("Los puntos son de -->"+notaf);
        
    }
    
}
