/*
 */
package cifrado;

import java.util.Scanner;

public class Cifrado {
    static Scanner texto = new Scanner (System.in);

    public static void main(String[] args) {
        System.out.println("Ingrese una palabra");
        String p= texto.next();
        p= p.toLowerCase();
        int d;
        
        System.out.println("Ingrese la letra del cifrado (en minúscula)");
        char le= texto.next().charAt(0);
        char l;
        System.out.println("Palabra: "+p);
        System.out.println("Cifrado: ");
        int x=0;
        char c = p.charAt(0);
                
        d= (int) Math.sqrt(Math.pow((int)le-(int)c,2));

        System.out.println("d:"+d);
        for(int i=0; i<p.length(); i++){
            l = p.charAt(i);
            if(l>=97 && l<=(122-3)){
                x=(l+d);
            }
            else
            if(l>=(122-3) && l<=122)
            x= (l-(25-(d-1))); 
            System.out.println((char)(x));
        }
        
    }
    
}
