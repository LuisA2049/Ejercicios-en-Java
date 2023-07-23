
package recursividad;

import java.io.IOException;


public class Recursividad2 {
    
    void impar(int x) throws InterruptedException{
         if(99>x){
            impar(x+2);
            System.out.println(x);
             }
    }
    
    public static void main(String[] args) throws IOException, InterruptedException {
        Recursividad2 re=new Recursividad2(); 
        re.impar(1);
    }
}