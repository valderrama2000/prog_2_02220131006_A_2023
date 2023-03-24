package co.edu.udes.correccion_1;
import  java.util.Scanner;
public class Correccion_2 {

    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el día: ");
        int dia = sc.nextInt();

        System.out.print("Introduce el mes: ");
        int mes = sc.nextInt();

        System.out.print("Introduce el año: ");
        int anio = sc.nextInt();

        int diasTranscurridos = 0;
        boolean fechaValida = true;

        switch (mes) {
            case 1: // Enero
            case 3: // Marzo
            case 5: // Mayo
            case 7: // Julio
            case 8: // Agosto
            case 10: // Octubre
            case 12: // Diciembre
                if (dia < 1 || dia > 31) {
                    fechaValida = false;
                } else {
                    diasTranscurridos += dia;
                }
                break;
            case 4: // Abril
            case 6: // Junio
            case 9: // Septiembre
            case 11: // Noviembre
                if (dia < 1 || dia > 30) {
                    fechaValida = false;
                } else {
                    diasTranscurridos += dia + 31 * (mes - 1) / 2 - (mes > 2 ? 1 : 0);
                }
                break;
            case 2: // Febrero
                if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0) { // Bisiesto
                    if (dia < 1 || dia > 29) {
                        fechaValida = false;
                    } else {
                        diasTranscurridos += dia + 31 * (mes - 1) / 2 - 1;
                    }
                } else { // No bisiesto
                    if (dia < 1 || dia > 28) {
                        fechaValida = false;
                    } else {
                        diasTranscurridos += dia + 31 * (mes - 1) / 2 - 1;
                    }
                }
                break;
            default:
                fechaValida = false;
                break;
        }

        if (fechaValida) {
            System.out.println("La fecha es válida.");
            System.out.println("Han transcurrido " + diasTranscurridos + " días del año.");
        } else {
            System.out.println("La fecha no es válida.");
        }
        
    }
    
}
