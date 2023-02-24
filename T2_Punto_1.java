
import java.util.Scanner;

public class T2_Punto_1 {

    
    public static void main(String[] args) {
        String palabra=" ";
        int p;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la palabra que dese");
        
        palabra = leer.nextLine();
        System.out.println("palabra del usuario = "+ palabra );
        System.out.print("palabra del programa = ");
        
        for(p= palabra.length()-1;p>= 0;p--){
            System.out.print(palabra.charAt(p));
        }
        System.out.println(" ");
    }
    
}
