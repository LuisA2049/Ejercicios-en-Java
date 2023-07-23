/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

import java.util.Scanner;

/**
 *
 * @author Jose M
 */
public class Factorial {

    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        
        Factorial x= new Factorial();
        
        System.out.println(  x.factorial(obj.nextInt()));
    }
    
    public int factorial (int numero) {
  if (numero==0)
    return 1;
  else
    return numero * factorial(numero-1);
          
        
}
    
    public int factorial3 (int numero) {
  if (numero==0)
    return 1;
  else
    return numero * factorial(numero-1);
          
        
}
}
