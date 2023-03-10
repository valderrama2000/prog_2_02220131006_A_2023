import java.util.Scanner;

public class Punto_13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el número obtenido al lanzar el dado: ");
        int num = sc.nextInt();
        
        String cara_opuesta;
        switch (num) {
            case 1:
                cara_opuesta = "6";
                break;
            case 2:
                cara_opuesta = "5";
                break;
            case 3:
                cara_opuesta = "4";
                break;
            case 4:
                cara_opuesta = "3";
                break;
            case 5:
                cara_opuesta = "2";
                break;
            case 6:
                cara_opuesta = "1";
                break;
            default:
                System.out.println("ERROR: número incorrecto");
                return; 
        }
        
        System.out.println("La cara opuesta al número " + num + " es " + cara_opuesta);
    }
    
}
