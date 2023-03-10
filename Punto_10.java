import java.util.Scanner;

public class Punto_10 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el tipo de uva (A o B): ");
        String tipoUva = sc.nextLine();

        System.out.println("Ingrese el tamaño de uva (1 o 2): ");
        int tamanoUva = sc.nextInt();

        System.out.println("Ingrese la cantidad de kilos de uva entregados: ");
        double kilosUva = sc.nextDouble();

        double precioInicial;

        if (tipoUva.equals("A")) {
            precioInicial = 0.8;
            if (tamanoUva == 1) {
                precioInicial += 0.2;
            } else if (tamanoUva == 2) {
                precioInicial += 0.3;
            }
        } else if (tipoUva.equals("B")) {
            precioInicial = 0.7;
            if (tamanoUva == 1) {
                precioInicial -= 0.3;
            } else if (tamanoUva == 2) {
                precioInicial -= 0.5;
            }
        } else {
            System.out.println("Tipo de uva inválido.");
            return;
        }

        double pago = precioInicial * kilosUva;
        System.out.println("El pago que recibirá el productor es de " + pago + " euros.");
    }
    
}
