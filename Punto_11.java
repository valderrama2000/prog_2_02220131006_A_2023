import java.util.Scanner;

public class Punto_11 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el número de alumnos: ");
        int numAlumnos = sc.nextInt();

        double costoA;
        double costoT;

        if (numAlumnos >= 100) {
            costoA = 65;
            costoT = numAlumnos * costoA;
        } else if (numAlumnos >= 50 && numAlumnos <= 99) {
            costoA = 70;
            costoT = numAlumnos * costoA;
        } else if (numAlumnos >= 30 && numAlumnos <= 49) {
            costoA = 95;
            costoT = numAlumnos * costoA;
        } else {
            costoA = 4000.0 / numAlumnos;
            costoT = 4000;
        }

        System.out.println("El costo por alumno es de " + costoA + " euros.");
        System.out.println("El costo total del viaje es de " + costoT + " euros.");
    }
    
}
