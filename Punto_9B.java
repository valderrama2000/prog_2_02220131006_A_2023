import java.util.Scanner;

public class Punto_9B {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Ingrese la cantidad de números primos que quiere mostrar--> ");
        n = sc.nextInt();
        sc.close();
        
        int count = 0;
        int num = 2;
        
        System.out.println("Los " + n + " primeros números primos son--> ");
        
        while (count < n) {
            boolean esPrimo = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }
    
}
