import java.util.Scanner;

public class Punto_8 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la longitud del primer lado: ");
        double lado1 = sc.nextDouble();

        System.out.println("Ingrese la longitud del segundo lado: ");
        double lado2 = sc.nextDouble();

        System.out.println("Ingrese la longitud del tercer lado: ");
        double lado3 = sc.nextDouble();

        if (lado1 == lado2 && lado1 == lado3) {
            System.out.println("El triángulo es equilátero.");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("El triángulo es isósceles.");
        } else {
            System.out.println("El triángulo es escaleno.");
        }

        if (Math.pow(lado1, 2) + Math.pow(lado2, 2) == Math.pow(lado3, 2)
                || Math.pow(lado1, 2) + Math.pow(lado3, 2) == Math.pow(lado2, 2)
                || Math.pow(lado2, 2) + Math.pow(lado3, 2) == Math.pow(lado1, 2)) {
            System.out.println("El triángulo es rectángulo.");
        }
    }
    
}
