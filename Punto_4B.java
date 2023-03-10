import java.util.Scanner;

public class Punto_4B {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número--> ");
        int num1 = sc.nextInt();
        System.out.print("Ingrese el segundo número--> ");
        int num2 = sc.nextInt();
        
        for (int i = num1; i <= num2; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
    
}
