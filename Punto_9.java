import java.util.Scanner;

public class Punto_9 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un año: ");
        int anio = sc.nextInt();

        boolean esB = false;

        if (anio % 4 == 0) {
            if (anio % 100 == 0) {
                if (anio % 400 == 0) {
                    esB = true;
                }
            } else {
                esB = true;
            }
        }

        if (esB) {
            System.out.println(anio + " es un año bisiesto.");
        } else {
            System.out.println(anio + " no es un año bisiesto.");
        }
    }
    
}
