import java.util.Scanner;

public class Punto_5B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int limiteIn, limiteSu;

        // Pedir los límites del intervalo
        do {
            System.out.print("Introduce el límite inferior-->");
            limiteIn = sc.nextInt();
            System.out.print("Introduce el límite superior-->");
            limiteSu = sc.nextInt();

            if (limiteIn > limiteSu) {
                System.out.println("El límite inferior debe ser menor o igual que el límite superior. Inténtalo de nuevo.");
            }
        } while (limiteIn > limiteSu);

        // Pedir números hasta que se introduzca un 0
        int num, suma = 0, dentroIntervalo = 0, fueraIntervalo = 0;
        boolean limiteInferiorEncontrado = false, limiteSuperiorEncontrado = false;
        do {
            System.out.print("Introduce un número (0 para terminar): ");
            num = sc.nextInt();

            if (num > limiteIn && num < limiteSu) {
                suma += num;
                dentroIntervalo++;
            } else if (num != 0) {
                fueraIntervalo++;
            }

            if (num == limiteIn) {
                limiteInferiorEncontrado = true;
            } else if (num == limiteSu) {
                limiteSuperiorEncontrado = true;
            }

        } while (num != 0);

        // Mostrar resultados
        System.out.println("La suma de los números dentro del intervalo es: " + suma);
        System.out.println("Hay " + dentroIntervalo + " números dentro del intervalo.");
        System.out.println("Hay " + fueraIntervalo + " números fuera del intervalo.");

        if (limiteInferiorEncontrado) {
            System.out.println("Se ha introducido el límite inferior del intervalo.");
        }
        if (limiteSuperiorEncontrado) {
            System.out.println("Se ha introducido el límite superior del intervalo.");
        }
    }
    
}
