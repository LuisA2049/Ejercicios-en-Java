package busquedasec;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BusquedaSec {

    public static void main(String[] args) throws IOException {
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        String[] nombres = new String[3];
        System.out.println("Introdusca los nombres");
        for(int x =0;x<nombres.length;x++){
            String in = teclado.readLine();
            nombres[x] = in;
        }
        System.out.println("Que nombre quieres buscar?");
        String buscar = teclado.readLine();
        for(int i=0;i<nombres.length;i++){
            if(nombres[i].equals(buscar)){
                System.out.println("Se a encontrado: "+buscar);
            }
            
        }
    }
    
}
