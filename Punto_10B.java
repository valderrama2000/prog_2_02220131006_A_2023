import java.util.Scanner;

public class Punto_10B {

    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        int x = 0;
        int esp=0;
        int v=0;
        int fila=0;
        int s=0;
        
        System.out.print("Digite el valor del triangulo de Pascal-->");
        x=z.nextInt();
        System.out.println("  ");
        
        for(fila=0; fila<=x; fila++){
            esp=x-fila;
                
                for(v=0; v<=esp; v++){
                    System.out.print(" ");
                }
                for(s=1; s<fila; s++){
                    System.out.print(s);
                }
                for(int q=fila; q>=1; q--){
                    System.out.print(q);
                }
                System.out.println(" ");
        }
    }
}