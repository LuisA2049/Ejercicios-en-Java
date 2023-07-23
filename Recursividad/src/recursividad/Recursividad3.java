package recursividad;

import java.io.IOException;


public class Recursividad3 {
    
    int suma (int num) {
        if (num>0) {               
            int valor=num + suma(num-1); 
            return valor;
        } else
            return 0;
    }
    
     public static void main(String[] args) throws IOException {
        Recursividad3 re=new Recursividad3(); 
        int f=re.suma(4);
        System.out.println("El resultado es "+f);
    }
}

