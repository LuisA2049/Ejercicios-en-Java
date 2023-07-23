/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodorecursivo;

import java.util.Scanner;

/**
 *
 * @author Jose M
 */
public class MetodoRecursivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tx= new Scanner(System.in);
       // int [] lista2= new int[8]; Definimos espacios por defecto
        int [] lista ;
        System.out.println("Ingrese la cantidad de espacios en memoria");
        lista= new int[tx.nextInt()]; //Estamos cargando los espacios por el usuario
         
        for (int i = 0; i < lista.length; i++) { //For para cargar datos al arreglo lista
            System.out.println("Ingrese un numero");
            lista[i]= tx.nextInt();
        }
        
      System.out.println("Los datos ingresados son:" );//For para imprimir datos del arreglo lista
      for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i]+" ");
            
        }
      
        burbuja(lista);
      
    }
    
    public static void burbuja(int[]matrix){
    int temp;
    for(int i=1;i < matrix.length;i++){
    for (int j=0 ; j < matrix.length- 1; j++){
    if (matrix[j] < matrix[j+1]){
    temp = matrix[j];
    matrix[j] = matrix[j+1];
    matrix[j+1] = temp;
        }
            }
        }
     System.out.println("Los datos acomodados son:" );//For para imprimir datos del arreglo lista
      for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i]+" ");
            
        }
    
    
        }
    
}
