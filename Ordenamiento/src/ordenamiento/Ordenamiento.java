package ordenamiento;

import java.util.Scanner;

public class Ordenamiento {

    public static void main(String[] args) {
        Scanner tx= new Scanner(System.in);
        int [] lista ;
        System.out.println("Ingrese la cantidad de espacios en memoria");
        lista= new int[tx.nextInt()];
        for (int i = 0; i < lista.length; i++) {
            System.out.println("Ingrese un numero");
            lista[i]= tx.nextInt();
        }
        
         shellSort(lista);
        System.out.println("Los datos ordenados son:" );
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]+" ");
        }
    }
    public static void shellSort(int[] matrix) {
        for ( int increment = matrix.length / 2;increment > 0;
            increment = (increment == 2 ? 1 : (int) Math.round(increment / 
            2.2))) {
                for (int i = increment; i < matrix.length; i++) {
                    for (int j = i; j >= increment && matrix[j - increment] > 
                matrix[j] ; j -= increment) {
                    int temp = matrix[j];
                    matrix[j] = matrix[j - increment];
                    matrix[j - increment] = temp;
                   }
                }
            }
        }
    
}
