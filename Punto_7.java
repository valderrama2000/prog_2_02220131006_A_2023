import java.util.Scanner;

public class Punto_7 {

    public static void main(String[] args) {
        Scanner E = new Scanner(System.in);
        
        System.out.print("Introdusca el centro del circulo (x1),(y1)-->");
        double x1 = E.nextDouble();
        double y1 = E.nextDouble();
        System.out.print("Ingrese el radio del primer circulo(r1)-->");
        double r1 = E.nextDouble();
        
        System.out.print("Introdusca el centro del circulo (x2),(y2)-->");
        double x2 = E.nextDouble();
        double y2 = E.nextDouble();
        System.out.print("Ingrese el radio del primer circulo(r2)-->");
        double r2 = E.nextDouble();
        
         double ds = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
         
         if(x1==x2 && y1==y2 && r1==r2){
             System.out.println("los sirculos son consentricas");
         }else if(ds == r1+r2){
             System.out.println("los sirculos son tangentes exteriores");
         }else if (ds < Math.abs(r1-r2)){
             System.out.println("las sircunferencias son interiores");
         }else if (ds>r1+r2){
             System.out.println("las sircunferencias son internas");
         }else if (ds == Math.abs(r1-r2)){
             System.out.println("las sircunferencias son tangentes interiores");
         }else{
             System.out.println("las sircunferencias son tangentes");
         }
    }
    
}
