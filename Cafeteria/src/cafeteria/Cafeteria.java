package cafeteria;
//error de empates, puedo buscar una forma de desempatar, pero pues...
//Escribir la inicial de nombres en MAYUSCULAS sino da error.
//las demas palabras se deben escribir en minusculas total.
//Para entrar a los apartado usar los numeros indicados.
//Pude a ver puesto mas productos y mas nombres, pero pues...
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Cafeteria {
    
    private static BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in)); 
    private static List <String> prod = new ArrayList<>();//productos.
    //Contabilidad de los productos.
    private static List <String> cafe = new ArrayList<>();
    private static List <String> espresso = new ArrayList<>();
    private static List <String> cappuccino = new ArrayList<>();
    //turnos
    private static List <String> manana = new ArrayList<>();
    private static List <String> tarde = new ArrayList<>();
    private static List <String> noche = new ArrayList<>();
    private static String turno;
    //Empelado
    private static List <String> empleado = new ArrayList<>();
    private static String emp;
    private static List <Integer> j1 = new ArrayList<>();
    private static List <Integer> p1 = new ArrayList<>();
    private static List <Integer> ck1 = new ArrayList<>(); 
    private static int v1 = 0;
    private static int v2 = 0;
    private static int v3 = 0;
  
  public static void main(String[] args) throws IOException {
        prod.add("cafe");
        prod.add("espresso");
        prod.add("cappuccino");
        
        empleado.add("Juan");
        empleado.add("Pepe");
        empleado.add("Clark");
        
        int stop = 1;
        while(stop==1){
        System.out.println("A que apartado del menu quieres ingresar?");
        
        System.out.println("1: Productos\n"+"2: Ventas\n"+"3: Inventario");

        String num = teclado.readLine();
        
        int menu = Integer.parseInt(num);
        
        switch(menu){//Menu principal.
            case 1:
                System.out.println("------------------------------------------");
                System.out.println("Aqui puedes ver la lista de los productos que se venden.");
                bebidas();
                break;
            case 2:
                empleados();
              break;
            case 3:
                mas();
            break;    
                
            
         }
        }
    }

  public static void bebidas() throws IOException{
                            System.out.println("Productos:\n"
                                               +"Cafe = $20.\n"+"Espresso = $30.\n"+"Cappuccino = $50.");
                            System.out.println("------------------------------------------");
                                                      
    }
  
  public static void ventas() throws IOException{
     // para que que no se acumulen.
    List <String> cuenta = new ArrayList<>();
    List <String> cafetemp = new ArrayList<>();
    List <String> capputemp = new ArrayList<>();
    List <String> espresstemp = new ArrayList<>();
    int si = 0;
    int si2 = 1;
    int precio = 0;
    
    while(si==0){
        
        while(si2==1){
                    System.out.println("Que quieres comprar?");
   
                    bebidas();
                    String pro = teclado.readLine();
    
                    if(prod.contains(pro)){
                        cuenta.add(pro);
                        //precios.
                        String prc = (prod.contains("cafe") && "cafe".equals(pro))?"20":"20";
                        String prc1 = (prod.contains("cappuccino") && "capuccino".equals(pro))?"50":"50";
                        String prc2 = (prod.contains("espresso") && "espresso".equals(pro))?"30":"30";
                        //precios a entero.
                        int x = Integer.parseInt(prc);
                        int x1 = Integer.parseInt(prc1);
                        int x2 = Integer.parseInt(prc2);
                        //Agrega al inventario
                    if("cafe".equals(pro)){
                        cafe.add(pro);
                        cafetemp.add(pro);
                    }
                    if("cappuccino".equals(pro)){
                        cappuccino.add(pro);
                        capputemp.add(pro);
                    }
                    if("espresso".equals(pro)){
                        espresso.add(pro);
                        espresstemp.add(pro);
                    }
                    //cantidad por precio.
                    int c1 = cafetemp.size()*x;
                    int c2 = capputemp.size()*x1;
                    int c3 = espresstemp.size()*x2;

                    precio = c1+c2+c3;
                    
                    if( "Juan".equals(emp)){
                    j1.add(precio);
                    }
                    if( "Pepe".equals(emp)){
                    p1.add(precio);
                    }
                    if( "Clark".equals(emp)){
                    ck1.add(precio);
                    }
                    
                    System.out.print("Quieres agregar algo mas?\n"
                                        +"1:Si "+"0: No\n");
                    String agregar = teclado.readLine();
                    si2 = Integer.parseInt(agregar);  
            }
        }
        
            System.out.println("El total por un:"+cuenta+" es: $"+precio);
            si2=1;
            cuenta.clear();
            cafetemp.clear();
            capputemp.clear();
            espresstemp.clear();
        
            System.out.println("Quieres salir del programa de ventas?\n"
                                +"1:Si "+"0: No");
            String salir = teclado.readLine();
            si = Integer.parseInt(salir); 
   }
  }
           
  public static void turnos() throws IOException{
      System.out.println("De que turno eres?");
      System.out.println("-------------------");
      System.out.print("Matutino.\n"+"Tarde.\n"+"Noche.\n");
      System.out.println("-------------------");
      turno = teclado.readLine();
      switch(turno){
          case "matutino":
              ventas();
              manana.addAll(cafe);
              manana.addAll(espresso);
              manana.addAll(cappuccino);
              break;
          case "tarde":
              ventas();
              tarde.addAll(cafe);
              tarde.addAll(espresso);
              tarde.addAll(cappuccino);
              break;
          case "noche":
              ventas();
              noche.addAll(cafe);
              noche.addAll(espresso);
              noche.addAll(cappuccino);
              break;
      }
  }
 
  public static void empleados() throws IOException{
      System.out.println("Que empleado eres?\n"+empleado);
      emp = teclado.readLine();
      if(empleado.contains(emp))
          switch(emp){
              case "Juan":
                  turnos();
                  System.out.println("Finaliso el turno de Juan");
                  break;
              case "Pepe":
                  turnos();
                  System.out.println("Finaliso el turno de Pepe");
                  break;
              case "Clark":
                  turnos();
                  System.out.println("Finaliso el turno de Clark");
                  break;
          }
          }
  
  public static void mas() throws IOException{
      System.out.println("------------------------------------------");
      System.out.println("Este es el apartado de inventario.\n"
      +"1: Empleado que vende mas.\n"+"2: Producto que se vende menos.\n"
      +"3: Producto mas vendido.\n"+"4: Turno que vende mas.");
      System.out.println("------------------------------------------");
      String x = teclado.readLine();
      int x1 = Integer.parseInt(x);
      switch(x1){
          case 1:
              for(int i=0;i<j1.size();i++){
                  v1+=j1.get(i);
              }
              
              for(int i=0;i<p1.size();i++){
                  v2+=p1.get(i);
              }
              
               for(int i=0;i<ck1.size();i++){
                  v3+=ck1.get(i);
              }
             
              if(v1>v2){
                    System.out.println("Juan es el que vendio mas.");
                    }else if(v2>v1&&v2>v3){
                         System.out.println("Pepe es el que vendio mas.");
                    }else if(v3>v1&&v2<v3 ){
                         System.out.println("Clark es el que vendio mas.");
              }
              break;
          case 2:
              if(cafe.size()<espresso.size()){
                    System.out.println("El Cafe es el producto que menos se vende.");
                    }else if(espresso.size()<cafe.size()&&espresso.size()<cappuccino.size()){
                         System.out.println("El Espresso es el producto que menos se vende.");
                    }else if(cappuccino.size()<cafe.size()&&espresso.size()>cappuccino.size()){
                         System.out.println("El Cappuccino es el producto que menos se vende.");
                    }
              break;
          case 3:
              if(cafe.size()>espresso.size()){
                    System.out.println("El Cafe es el producto que mas se vende.");
                    }else if(espresso.size()>cafe.size()&&espresso.size()>cappuccino.size()){
                         System.out.println("El Espresso es el producto que mas se vende.");
                    }else if(cappuccino.size()>cafe.size()&&espresso.size()<cappuccino.size()){
                         System.out.println("El Cappuccino es el producto que mas se vende.");
                    }
              break;
          case 4:
              if(manana.size()>tarde.size()){
                    System.out.println("El turno matutino es el que vendio mas.");
                    }else if(tarde.size()>manana.size()&&tarde.size()>noche.size()){
                         System.out.println("El turno de la tarde es el que vendio mas.");
                    }else if(noche.size()>manana.size()&&tarde.size()<noche.size()){
                         System.out.println("El turno de la noche es el que vende mas.");
                    }
      }
      
  }
      }
  
  



