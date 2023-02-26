package taller_3;

import java.util.Scanner;

public class Punto_18 {

    public static void main(String[] args) {
        Scanner Nombre = new Scanner(System.in);
        
        System.out.print("Ingrese el primer Nombre -->");
        String nombre = Nombre.nextLine();
         System.out.print("Ingrese el Primer apellido -->");
        String primer_apellido = Nombre.nextLine();
         System.out.print("Ingrese el segundo apellido -->");
        String segundo_apellido = Nombre.nextLine();
        
        char Inombre=nombre.charAt(0);
        char Iprimer_apellido=primer_apellido.charAt(0);
        char Isegundo_apellido=segundo_apellido.charAt(0);
        
        System.out.print("las inisiales son \n"+Inombre+"\n"+Iprimer_apellido+"\n"+Isegundo_apellido+"\n");
    }
}
