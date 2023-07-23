
package palidrindromo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palidrindromo {

    public static void main(String[] args) throws IOException, CloneNotSupportedException {

        BufferedReader teclado;
        teclado = new BufferedReader(new InputStreamReader(System.in));
     
        System.out.print("Introdusca su palabra.");
        
        String pal = teclado.readLine();
        String result= ""; 
        
        for(int i=pal.length(); i>0; i--){
        result+= pal.charAt(i-1);
        }  
        
        if(!pal.equals(result)){
            System.out.println("La palabra no es palindromo");
        }else{
            System.out.println("La palabra es palindromo");
        }
    }
}
