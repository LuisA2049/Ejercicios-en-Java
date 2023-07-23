
package practicas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Practica3 {
     public static void main(String[] args) throws IOException {
      BufferedReader teclado;
        teclado = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Introdusca su Numero.");
      String numero = teclado.readLine();
        int num = Integer.parseInt(numero);
        int res = num%2;
        if(res==0){
            System.out.print("Su numero es par.");
        }else{
       System.out.print("Su numero es inpar.");
     }
}
}