import java.util.Scanner;
        
public class Punto_1 {

    public static void main(String[] args) {
        Scanner V = new Scanner(System.in);
        
        System.out.print("Ongrese el primer numero -->");
        int Num1 = V.nextInt();
        
        System.out.print("Ingrese el segundo numero -->");
        int Num2 = V.nextInt();
        
        if(Num1== Num2){
            System.out.println("los dos numeros son iguales :p");
        }else{
            if(Num1 > Num2){
                System.out.println("El numero mallor es -->" +Num1);
            }else{
                 System.out.println("el numro mallor es -->" +Num2);
            }   
        }
    }
}
