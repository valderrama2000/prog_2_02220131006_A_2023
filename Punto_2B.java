import java.util.Scanner;

public class Punto_2B {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la cantidad de números a introducir--> ");
        int cantidadNumeros = sc.nextInt();

        int mayQueCero = 0;
        int menQueCero = 0;
        int igualACero = 0;

        for (int i = 1; i <= cantidadNumeros; i++) {
            System.out.print("Introduce el número " + i + ": ");
            int numero = sc.nextInt();
            if (numero > 0) {
                mayQueCero++;
            } else if (numero < 0) {
                menQueCero++;
            } else {
                igualACero++;
            }
        }

        System.out.println("Cantidad de números mayores que 0: " + mayQueCero);
        System.out.println("Cantidad de números menores que 0: " + menQueCero);
        System.out.println("Cantidad de números iguales a 0: " + igualACero);
    }
    
}
