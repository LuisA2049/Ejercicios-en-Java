
package practicas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practica2 {

    public static void main(String[] args) throws IOException {
      BufferedReader teclado;
        teclado = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Introdusca su Altura.");
        String altura = teclado.readLine();
        float al = Float.parseFloat(altura);
        System.out.print("Introdusca su peso.");
        String peso = teclado.readLine();
        float pes = Float.parseFloat(peso);
        
        float imc = pes/(al*al);
        System.out.print("Su masa corporal es: ");
        System.out.print(imc);

    }
}
