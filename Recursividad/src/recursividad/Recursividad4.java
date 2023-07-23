
package recursividad;

import java.io.IOException;


public class Recursividad4 {
   int fibo(int n){
    if (n>1){
       return fibo(n-1) + fibo(n-2);  //función recursiva
    }
        return 1;
}
      
    
    public static void main(String[] args) throws IOException {
        Recursividad4 re=new Recursividad4(); 
        int f =re.fibo(10);
       System.out.println("El resultado es "+f);
    }
}
