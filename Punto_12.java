import java.util.Scanner;

public class Punto_12 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la duración de la llamada en minutos: ");
        int duracion = sc.nextInt();

        System.out.println("Ingrese el día de la llamada (1: Domingo, 2-6: Lunes a Viernes, 7: Sábado): ");
        int dia = sc.nextInt();

        System.out.println("Ingrese el turno de la llamada (1: Mañana, 2: Tarde): ");
        int turno = sc.nextInt();

        double costoTotal = 0;

        if (duracion <= 5) {
            costoTotal = 1;
        } else if (duracion <= 8) {
            costoTotal = 1 + (duracion - 5) * 0.8;
        } else if (duracion <= 10) {
            costoTotal = 1 + 3 * 0.8 + (duracion - 8) * 0.7;
        } else {
            costoTotal = 1 + 3 * 0.8 + 2 * 0.7 + (duracion - 10) * 0.5;
        }

        if (dia == 1) {
            costoTotal *= 1.03;
        } else if (turno == 1) {
            costoTotal *= 1.15;
        } else {
            costoTotal *= 1.1;
        }

        System.out.println("El costo total de la llamada es de " + costoTotal + " euros.");
        
    }
    
}
