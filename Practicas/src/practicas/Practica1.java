
package practicas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Practica1 {

    public static void main(String[] args) throws IOException {
      BufferedReader teclado;
        teclado = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Introdusca su nombre(s).");
        String nombre = teclado.readLine();
        System.out.print("Introdusca su apellido(s).");
        String apellido = teclado.readLine();
        String espacio = (" ");
        System.out.println(nombre+espacio+apellido);
      
      
    }
}