import java.util.Scanner;

public class Punto_6 {

    public static void main(String[] args) {
        Scanner T =new Scanner(System.in);
        
        System.out.print("Ingrese la nota-->");
        double nota=T.nextDouble();
        System.out.print("Ingrese la edad-->");
        int edad = T.nextInt();
        System.out.print("Ingrese el sexo-->");
        char sexo = T.next().charAt(0);
        
        if(nota>=5 && edad>=18){
            if(sexo == 'M'){
                System.out.println("La solisitud es Posible");
            }else if(sexo == 'F'){
                System.out.println("La solisitud es Aceptada");
            }else{
                System.out.println("La solisitud es Negada");
            }
        }else{
            System.out.println("La solisitud es Negada");
        }
    }
    
}
