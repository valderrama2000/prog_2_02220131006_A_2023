import java.util.Scanner;

public class Punto_3 {

    public static void main(String[] args) {
        
        Scanner t = new Scanner(System.in);
        
        float total=0;
        System.out.print("ingrese el primer numero -->");
        int num1=t.nextInt();
        System.out.print("Ingrese el segundo numero -->");
        int num2 =t.nextInt();
        
        if(num2==0){
            System.out.println("ERROR");
        }else{
            total=num1/num2;
            System.out.println("la operacion es "+num1+"/"+num2+" = "+total);
        }
    }
    
    
}
