import java.util.Scanner;

public class Punto_5 {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        
         double res=0;
        System.out.print("Ingrese el numero vase-->");
        int v= l.nextInt();
        System.out.print("Ingrese el numero que se usara como potenci -->");
        float p=l.nextFloat();
        
        if(p>=1){
            res = Math.pow(v,p);
            System.out.println(res);
        }else if(p==0){
            res=1;
            System.out.println(res);
        }else{
            res =1/Math.pow(v,-p);
            System.out.println(res);
        }
    }
    
}
