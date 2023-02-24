
import java.util.Scanner;


public class T2_Punto_2_2 {


    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);
        String[] palabra = new String[5];
        boolean cruce;
        int i, j, k, h, p, q, s, v;
        
        System.out.println("Ingrese 5 palabras para cruzar: ");
        p = 0;
        while(p < 5) {
            System.out.print((p+1) + ":");
            palabra[p] = entrada.next();
            p++;
        }
        
        q = 0;
        while(q < 5) {
            int[] validador = new int[palabra[q].length()];
            h = 0;
            while(h < palabra[q].length()) {
                validador[h] = 0;
                h++;
            }
            System.out.println("Palabra Raiz: " + palabra[q]);
            
            i = 0;
            while(i < 5) {
                if(q == i) {
                    i++;
                }
                if(i == 5) {
                    break;
                }
                j = 0;
                while(j < palabra[q].length()) {
                    cruce = false;
                    k = 0;
                    while(k < palabra[i].length()) {
                        if(palabra[i].charAt(k) == palabra[q].charAt(j) && validador[j] != 1) {
                            System.out.println("Match: " + palabra[i].charAt(k) + " y " + palabra[q].charAt(j) + " de las palabras " + palabra[q].toUpperCase() + " y " + palabra[i].toUpperCase());
                            cruce = true;
                            break;
                        }
                        k++;
                    }
                    if(cruce) {
                        validador[j] = 1;
                        break;
                    }
                    j++;
                }
                i++;
            }
            q++;
        }
    }
}
    

