
package javaapplication11;
import java.util.Scanner;

public class JavaApplication11 {
  @SuppressWarnings("UnusedAssignment") 
  
    public static void main(String[] args) {
       Scanner sn = new Scanner(System.in);
      // Calculadora calculadoraEspecial = new Calculadora("JP");      
       //haciendo que el usuario ingrese sus datos para la calculadora apra que sean utilizados en la creacion de la calculadora especial
       CalculadoraEspecial calculadoraEspecial;
       System.out.println("\u001B[31mEscriba que Marca de  de Calculadora desea... \u001B[30m1.HP \u001B[31m2.CASIO \u001B[32m3.DELL \u001B[34m");
       String nombreCalculadora = sn.nextLine();
       System.out.println("\u001B[31mIngrese el color de la Calculadora:\u001B[34m ");
       String colCalculadora = sn.nextLine();
       System.out.println("\u001B[31mIngrese la dimension de la pantalla de la Calculadora:\u001B[34m(NUMEROS) \u001B[34m");
       int dimensionPantalla = sn.nextInt();
       sn.nextLine();
       System.out.println("\u001B[31mIngrese el numero de serie de Calculadora:\u001B[34m ");
       String numSerie = sn.nextLine();
       System.out.println("\u001B[31mIngrese su Nombre para facturar:\u001B[34m ");
       String nomUsuario = sn.nextLine();
       System.out.println("\u001B[31mGracias por su compra tome su Factura:\u001B[32m ");
       System.out.println("");
       System.out.println("ASESOR:\u001B[34mOSMAR\u001B[31m GUERRA:\u001B[34m ");
       System.out.println("\u001B[31mCARNET\u001B[34m 0909-22-20146:\u001B[31m ");
       System.out.println("=======================");
       calculadoraEspecial = new CalculadoraEspecial(nombreCalculadora, colCalculadora, dimensionPantalla, numSerie, nomUsuario);
       boolean salir = false;
       int opcion, opcioncalculadora, num1,  num2;      
       //mostrar los datos
       calculadoraEspecial.mostrarDatos();
       System.out.println("=======================");
       do{      
         
           System.out.println("=======================");
           System.out.println("1. Calculadora Simple");
           System.out.println("2. Calculadora Especial");
           System.out.println("3. Salir");
           System.out.println("=======================");          
           opcioncalculadora = sn.nextInt();          
           switch(opcioncalculadora){
               case 1:
                  System.out.println("ddknflkndlkafdlks");
                  System.out.println("=======================");
                  System.out.println("1. Sumar");
                  System.out.println("2. Restar");
                  System.out.println("3. Multiplicar");
                  System.out.println("4. Dividir");
                  System.out.println("5. Raiz Cuadrada");
                  System.out.println("6. Verificar numero Primo");
                  System.out.println("7. Salir");
                  System.out.println("Selecciona una opcion");
                  System.out.println("=======================");                  
                  opcion = sn.nextInt();                   
              switch(opcion){
                  case 1:  
                      System.out.println("Ingrese el primer numero: ");
                      num1 = sn.nextInt();
                      System.out.println("Ingrese el segundo numero: ");
                      num2 = sn.nextInt();                     
                      System.out.println("El resultado de la suma es = " + calculadoraEspecial.sumar(num1, num2));
                      break;
                  case 2:
                      System.out.println("Ingrese el primer numero: ");
                      num1 = sn.nextInt();
                      System.out.println("Ingrese el segundo numero: ");
                      num2 = sn.nextInt();
                      System.out.println("El resultado de la resta es = " + calculadoraEspecial.restar(num1, num2));
                      break;
                  case 3:
                      System.out.println("Ingrese el primer numero: ");
                      num1 = sn.nextInt();
                      System.out.println("Ingrese el segundo numero: ");
                      num2 = sn.nextInt();
                      System.out.println("El resultado de la multiplicacion es = " + calculadoraEspecial.multiplicar(num1, num2));
                      break;
                  case 4:
                      System.out.println("Ingrese el primer numero: ");
                      num1 = sn.nextInt();
                      System.out.println("Ingrese el segundo numero: ");
                      num2 = sn.nextInt();
                      System.out.println("El resultado de la división es = " + calculadoraEspecial.dividir(num1, num2));
                      break;
                  case 5:
                      System.out.println("Ingrese el numero: ");
                      num1 = sn.nextInt();
                      System.out.println("El resultado de la raíz cuadrada es = " + calculadoraEspecial.raizCuadrada(num1));
                      break;
                  case 6:
                      System.out.println("Ingrese el numero: ");
                      num1 = sn.nextInt();
                      System.out.println("Es primo? = " + calculadoraEspecial.esPrimo(num1));
                      break;
                  case 7:
                      salir=true;
                  default:
                      System.out.println("Solo números entre 1 y 7");     
                }
              break;          
              case 2:
                    System.out.println("");
                    System.out.println("=======================");
                    System.out.println("1. Generar numero aleatorio");
                    System.out.println("2. Calcular potencia");
                    System.out.println("3. Calcular logaritmo");
                    System.out.println("4. Calcular seno");
                    System.out.println("5. Calcular coseno");
                    System.out.println("6. Calcular tangente");
                    System.out.println("7. Calcular raiz cubica");
                    System.out.println("8. Salir");
                    System.out.println("Selecciona una opcion");
                    System.out.println("=======================");
                    opcion = sn.nextInt();
                    switch (opcion) {
                        case 1: {
                            System.out.println("Ingrese el limite superior: ");
                            num1 = sn.nextInt();
                            System.out.println("Numero aleatorio generado = " + calculadoraEspecial.generarNumeroAleatorio(num1));
                            break;
                        }
                        case 2:{
                            System.out.println("Ingrese la base: ");
                            num1 = sn.nextInt();
                            System.out.println("Ingrese el exponente: ");
                            num2 = sn.nextInt();
                            System.out.println("El resultado de la potencia es = " + calculadoraEspecial.calcularPotencia(num1, num2));
                            break;
                        }
                        case 3: {
                            System.out.println("Ingrese el numero: ");
                            num1 = sn.nextInt();
                            System.out.println("El resultado del logaritmo es = " + calculadoraEspecial.calcularLogaritmo(num1));
                            break;
                        }
                        case 4: {
                            System.out.println("Ingrese el angulo en radianes: ");
                            num1 = sn.nextInt();
                            System.out.println("El resultado del seno es = " + calculadoraEspecial.calcularSeno(num1));
                            break;
                        }
                        case 5: {
                            System.out.println("Ingrese el angulo en radianes: ");
                            num1 = sn.nextInt();
                            System.out.println("El resultado del coseno es = " + calculadoraEspecial.calcularCoseno(num1));
                            break;
                        }
                        case 6:{
                            System.out.println("Ingrese el angulo en radianes: ");
                            num1 = sn.nextInt();
                            System.out.println("El resultado de la tangente es = " + calculadoraEspecial.calcularTangente(num1));
                            break;
                        }
                        case 7: {
                            System.out.println("Ingrese el numero: ");
                            num1 = sn.nextInt();
                            System.out.println("El resultado de la raiz cubica es = " + calculadoraEspecial.calcularRaizCubica(num1));
                            break;
                        }
                         case 8: 
                            salir = true;
                         default:
                            System.out.println("Solo numeros entre 1 y 8");
                    }
                break;   
                case 3:
                    salir=true;
            }  
        }   
        while(!salir);
       System.out.println("Hasta luego!\u001B[34m HAY ME PONE LOS PUNTOS DE LA CAMINATA JAJAJA");        
    }
 
    
    
}
