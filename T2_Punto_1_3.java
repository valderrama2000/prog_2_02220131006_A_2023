
import java.util.Scanner;


public class T2_Punto_1_3 {


    public static void main(String[] args) {
        
        String palabra = " ";
        int p = 0;
        Scanner leer = new Scanner(System.in);
    
        System.out.println("Ingrese la palabra que desea");
    
        palabra = leer.nextLine();
        System.out.println("palabra del usuario = " + palabra);
        System.out.print("palabra del programa = ");
    
        p = palabra.length() - 1;
    
        do {
            System.out.print(palabra.charAt(p));
            p--;
        } while (p >= 0);
    }
}
    
