package casop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Casop {
  
    public static void main(String[] args) throws IOException {
        BufferedReader teclado;
        teclado = new BufferedReader(new InputStreamReader(System.in));
        
        List <String> personas= new ArrayList<>(5);
        
        int x=5;
        
        for (int i = 0;i<x; i++){
            System.out.println("El nombre de las persona a entrar.");
            String nom = teclado.readLine();
            personas.add(nom); 
            if(personas.size()==x){
            System.out.println("Ya hay 5 personas adentro");
            }
        }
             
         System.out.println("Persona a consultar");
         String pe = teclado.readLine();
         if(personas.contains(pe)){
             System.out.println("Si esta persona,quieres eliminarlo?[Pon '1' para si y un '0' para no]");
             String con = teclado.readLine();
             int si = Integer.parseInt(con);
             if(si==1)
             personas.remove(pe); 
         }else{
             while(!personas.contains(pe)){  
             System.out.println("No esta esta persona,por favor vuelva ingresar otro nombre");
             pe = teclado.readLine(); 
         }
             System.out.println("Si esta persona,quieres eliminarlo?[Pon '1' para si y un '0' para no]");
             String con = teclado.readLine();
             int si = Integer.parseInt(con);
             if(si==1)
             personas.remove(pe);    
         }
         
         for (int i = 0; i <= personas.size() - 1; i++) {
         System.out.println(personas.get(i));
        }
         
    }
     
}