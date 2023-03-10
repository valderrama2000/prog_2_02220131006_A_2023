import java.util.Scanner;

public class Punto_2 {

    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        
        System.out.print("Ingrese un numero--->");
        int Num = z.nextInt();
        
        if(Num%2==0){
            System.out.println("El numero es Par");
        }else{
            System.out.println("El numero es Impar");
        }
    }  
}
