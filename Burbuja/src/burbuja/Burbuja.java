package burbuja;

import java.util.Arrays;

public class Burbuja {

    public static void main(String[] args) {
     int[] x =  {8,3,9};
     
     burbuja(x);
     
     System.out.println(Arrays.toString(x));
     
    }
    public static void burbuja(int[]matrix){
        int temp;
        for(int i=1;i < matrix.length;i++){
            for (int j=0 ; j < matrix.length- 1; j++){
                if (matrix[j] > matrix[j+1]){
                temp = matrix[j];
                matrix[j] = matrix[j+1];
                matrix[j+1] = temp;
               }
            }
        }
    }
    

}
