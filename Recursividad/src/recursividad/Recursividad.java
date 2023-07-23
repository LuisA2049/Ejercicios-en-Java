package recursividad;

import java.io.IOException;


public class Recursividad {

  int factorial(int fact) {
        if (fact>0) {               //Si es mayor a cero.
            int valor=fact * factorial(fact-1); // valor es igual a fact por la funcion.
            return valor;
        } else
            return 1;
    }
 
    public static void main(String[] args) throws IOException {
        Recursividad re=new Recursividad(); 
        int f=re.factorial(4);
        System.out.println("El factorial de 4 es "+f);
    }
}
  