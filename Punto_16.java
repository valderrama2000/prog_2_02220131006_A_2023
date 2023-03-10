import java.util.Scanner;

public class Punto_16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Pedir peso del paquete
        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = sc.nextDouble();
        
        if (peso > 5) {
            // Peso superior a 5kg, rechazar entrega
            System.out.println("El paquete no puede ser transportado por exceder el peso máximo permitido.");
        } else {
            // Pedir zona de destino
            System.out.println("Zonas disponibles:");
            System.out.println("1. América del Norte");
            System.out.println("2. América Central");
            System.out.println("3. América del Sur");
            System.out.println("4. Europa");
            System.out.println("5. Asia");
            System.out.print("Ingrese el número correspondiente a la zona de destino: ");
            int zona = sc.nextInt();
            
            // Calcular costo total
            double costoPorKg;
            switch (zona) {
                case 1:
                    costoPorKg = 24.00;
                    break;
                case 2:
                    costoPorKg = 20.00;
                    break;
                case 3:
                    costoPorKg = 21.00;
                    break;
                case 4:
                    costoPorKg = 10.00;
                    break;
                case 5:
                    costoPorKg = 18.00;
                    break;
                default:
                    System.out.println("El número de zona ingresado es inválido.");
                    return;
            }
            
            double costoTotal = peso * costoPorKg;
            System.out.printf("El costo total de la entrega es: %.2f euros\n", costoTotal);
        }
    }    
}
