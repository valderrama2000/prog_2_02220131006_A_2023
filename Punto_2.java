package taller_3;

import java.util.Scanner;

public class Punto_2 {

    
    public static void main(String[] args) {
        
        System.out.println("de cuanto es la base ");
        Scanner Base = new Scanner(System.in);
        int base = Base.nextInt();
        
        System.out.println("de cuanto es el alto ");
        Scanner Alto = new Scanner(System.in);
        int alto = Alto.nextInt();
        
        System.out.println("bien ya con los respectivos valores de Alto -->"+alto+" y con el de Base -->"+base+" podemos sacar el Perimetro");
        
        int total =alto+base;
        System.out.println("el Perimetro es -->"+total);
    }
    
    
}
