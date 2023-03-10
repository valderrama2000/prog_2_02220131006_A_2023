import java.util.Scanner;

public class Punto_14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número del día de la semana (1-7): ");
        int num = sc.nextInt();
        
        String dia;
        switch (num) {
            case 1:
                dia = "lunes";
                break;
            case 2:
                dia = "martes";
                break;
            case 3:
                dia = "miércoles";
                break;
            case 4:
                dia = "jueves";
                break;
            case 5:
                dia = "viernes";
                break;
            case 6:
                dia = "sábado";
                break;
            case 7:
                dia = "domingo";
                break;
            default:
                System.out.println("ERROR: número incorrecto");
                return;
        }
        
        System.out.println("El día correspondiente al número " + num + " es " + dia);
    }
    
}
