import java.util.Scanner;

public class Punto_15 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número entero entre 1 y 12: ");
        int mes = sc.nextInt();

        int numDias = 0;

        switch (mes) {
            case 1: // Enero
            case 3: // Marzo
            case 5: // Mayo
            case 7: // Julio
            case 8: // Agosto
            case 10: // Octubre
            case 12: // Diciembre
                numDias = 31;
                break;
            case 4: // Abril
            case 6: // Junio
            case 9: // Septiembre
            case 11: // Noviembre
                numDias = 30;
                break;
            case 2: // Febrero
                System.out.print("¿El año es bisiesto? (true/false): ");
                boolean bisiesto = sc.nextBoolean();
                if (bisiesto) {
                    numDias = 29;
                } else {
                    numDias = 28;
                }
                break;
            default:
                System.out.println("Número inválido. Debe estar entre 1 y 12.");
                break;
        }

        if (numDias > 0) {
            System.out.println("El mes " + mes + " tiene " + numDias + " días.");
        }
    }
    
}
