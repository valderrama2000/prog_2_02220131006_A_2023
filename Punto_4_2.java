
package Punto_4;

import java.util.Scanner;


public class Punto_4_2 {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    
        String raiz=" ", T=" ";
        String[] V1 = new String[4];
        boolean valido=false;
        int R=0;
    do{  
    System.out.println("Ingresa la palabra raiz: "); 
        raiz=teclado.next();
     if(raiz.matches("[a-zA-Z]*")){
      valido=true;
    }else{
        System.out.println("Ingrese una palabra de manera correcta. \n");
    }
        
    }while(valido==false); 
    
    valido=false;
  
    System.out.println("Ingresa 4 palabras mas: ");
    int f=0 ;
    while(f<V1.length) {
        do{
            System.out.print("Ingrese palabra #"+(f+1)+": ");
                T=teclado.next();   
                    if(T.matches("[a-zA-Z]*")){
                       V1[R]=T;
                       valido=true;
                    }else{
                        System.out.println("\n Ingrese de manera correcta el nombre del producto \n");
                    }
               }while(valido==false);
        f++;
    }
        for (String l : V1) {
            for (int i = 0; i < l.length(); i++) {
                if (raiz.contains(String.valueOf(l.charAt(i)))) {
                    System.out.println("\n La palabra " + l + " encaja en la palabra base \n");
                    break;
                }
            }
        }      
}
    
}
