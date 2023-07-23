
package lista;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Lista {

   
    public static void main(String[] args) throws IOException {
     BufferedReader teclado;
     teclado = new BufferedReader(new InputStreamReader(System.in));
     
     List <String> Bancoc= new ArrayList<>();
     
     System.out.println("Cuantas personas van a entrar?");  
     String num1 = teclado.readLine();
     int num2 = Integer.parseInt(num1);  
     for (int i = 0; i <=num2; i++) {
         String nom = teclado.readLine();
         System.out.println("El nombre de las personas a entrar.");
         Bancoc.add(nom);   
        }
     for (int i = 0; i <= Bancoc.size() - 1; i++) {
         System.out.println(Bancoc.get(i));
        }
    }
}
