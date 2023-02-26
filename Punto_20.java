package taller_3;
import java.util.Scanner;
public class Punto_20 {

    public static void main(String[] args) {
        Scanner V =new Scanner(System.in);
        
        System.out.print("Cuantas monedas de 1 $ Tiene -->");
        int uno = V.nextInt();
        System.out.print("Cuantas monedas de 2 $ Tiene -->");
        int dos = V.nextInt();
        System.out.print("Cuantas monedas de 10centimos $ Tiene -->");
        int dies = V.nextInt();
        System.out.print("Cuantas monedas de 20centimos $ Tiene -->");
        int veinte = V.nextInt();
        System.out.print("Cuantas monedas de 50centimos $ Tiene -->");
        int sincuenta = V.nextInt();
        
        double dineroTotal = (uno * 1) + (dos * 2) + (dies * 0.1) + (veinte * 0.2) + (sincuenta * 0.5);
        int euros = (int) dineroTotal;
        int centimos = (int) ((dineroTotal - euros) * 100);
        
        System.out.println("Tienes un total de $" + euros + " euros y " + centimos + " céntimos.");
    }
    
}
