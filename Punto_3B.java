import java.util.Scanner;

public class Punto_3B {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        char c;
        
        do {
            System.out.print("Introduce un carácter (pulsa espacio para salir): ");
            c = sc.nextLine().charAt(0);
            
            if (c == ' ') {
                break;
            }
            
            if (esVocal(c)) {
                System.out.println("VOCAL");
            } else {
                System.out.println("NO VOCAL");
            }
        } while (true);
    }
    
    private static boolean esVocal(char c) {
        c = Character.toUpperCase(c);
        return c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
    
}
