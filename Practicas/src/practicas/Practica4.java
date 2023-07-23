
package practicas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Practica4 {
    public static void main(String[] args) throws IOException {
      BufferedReader teclado;
        teclado = new BufferedReader(new InputStreamReader(System.in));
        
      System.out.print("Introdusca la primera edad.");
      String persona1 = teclado.readLine();
      int num1 = Integer.parseInt(persona1);
      System.out.print("Introdusca la segunda edad.");
      String persona2 = teclado.readLine();
      int num2 = Integer.parseInt(persona2);
      System.out.print("Introdusca la tercera edad.");
      String persona3 = teclado.readLine();
      int num3 = Integer.parseInt(persona3);
      
      if(num1>num2){
          System.out.println("La persona mas grande es la PRIMERA");
       }else if(num2>num1&&num2>num3){
          System.out.println("La persona mas grande es la SEGUNDO");
          }else if(num3>num1&&num2<num3 ){
              System.out.println("La persona mas grande es la TERSERO");
              }
      }
    }

