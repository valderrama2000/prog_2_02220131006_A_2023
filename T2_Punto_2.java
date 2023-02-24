import java.util.Scanner;

public class T2_Punto_2 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String [] palabra = new String [5];
        boolean cruce;
        
        System.out.println("Ingrese 5 palabras para cruzar: ");
        for(int p=0;p<5;p++){
            System.out.print((p+1)+":");
            palabra[p] = entrada.next();
        }
        
       
        for(int q=0;q<5;q++){
        
            
            int [] validador = new int [palabra[q].length()];
            
            for(int p=0;p<palabra[q].length();p++){
                validador[p]=0;
            }
            System.out.println("Palabra Raiz: "+palabra[q]);
            
            
            for(int p=0;p<5;p++){
                
                
                if(q==p){
                    p++;
                }
                
                if(p==5){
                    break;
                }
                
                for(int v=0;v<palabra[q].length();v++){

                    
                    cruce=false;

                    
                    for(int s=0;s<palabra[p].length();s++){

                        
                        if(palabra[p].charAt(s)==palabra[q].charAt(v)&&validador[v]!=1){

                            System.out.println("Match: "+palabra[p].charAt(s)+" y "+palabra[q].charAt(v)+" de las palabras "+ palabra[q].toUpperCase() +" y " + palabra[p].toUpperCase());
                            cruce=true;
                            break;
                        }
                    }
                    
                    if(cruce){
                        validador[v]=1;
                        break;
                    }
                }
            }
        }
    }
}
    
    

