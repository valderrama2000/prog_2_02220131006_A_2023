import java.util.Scanner;

public class Punto_7B {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el precio del producto: ");
        double precio = sc.nextDouble();
        
        int meses = 20;
        double pagoMensual = precio / (Math.pow(2, meses) - 1);
        double totalPagado = 0;
        
        for (int i = 1; i <= meses; i++) {
            double pagoMensualActual = pagoMensual * Math.pow(2, i - 1);
            totalPagado += pagoMensualActual;
            System.out.println("Pago del mes " + i + ": " + pagoMensualActual);
        }
        
        System.out.println("Total pagado: " + totalPagado);
    }
    
}
