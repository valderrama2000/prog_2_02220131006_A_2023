import java.util.Scanner;

public class Punto_4 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

    System.out.print("Introduce una letra: ");
    String input = scanner.nextLine();

    if (input.length() == 1 && Character.isUpperCase(input.charAt(0))) {
      System.out.println("La letra introducida es mayuscula.");
    } else {
      System.out.println("La letra introducida no es mayuscula.");
    }
    }
    
}
