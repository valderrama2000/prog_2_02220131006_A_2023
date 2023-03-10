import java.util.Scanner;

public class Punto_6B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la base-->");
        double base = sc.nextDouble();
        System.out.print("Introduce el exponente-->");
        int exponente = sc.nextInt();
        
        double resultado = 1; // Inicializamos resultado a 1
        for (int i = 0; i < exponente; i++) {
            resultado *= base; // Multiplicamos resultado por la base
        }
        
        System.out.println(base + " elevado a " + exponente + " es igual a " + resultado);
    }
    
}
