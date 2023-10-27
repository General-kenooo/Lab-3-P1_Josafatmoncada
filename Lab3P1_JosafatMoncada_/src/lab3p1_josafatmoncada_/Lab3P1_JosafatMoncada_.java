
package lab3p1_josafatmoncada_;

import java.util.Scanner;
        
public class Lab3P1_JosafatMoncada_ {

    
    public static void main(String[] args) {
         Scanner entrada=new Scanner (System.in);
        char res= 's';
        while (res=='s'||res=='s'){
            int opcion;
            System.out.println("Ejercicio numero 1");
            System.out.println("Ejercicio nuemero 2");
            System.out.println("Ejercicio numero 3");
            opcion= entrada.nextInt();
            switch(opcion){
                case 1:
                    int Inicial;
                    int Diferencia;
                    int Cantidad;
                    int Sucesion;
                    System.out.println("Ingrese el nuemero inicial");
                    Inicial = entrada.nextInt();
                    System.out.println("Ingrese la diferencia");
                    Diferencia = entrada.nextInt();
                    System.out.println("Ingrese la cantidad");
                    Cantidad = entrada.nextInt();
                    
                    int Actual = Inicial;
                    
                    for ( int i = 0; i < Cantidad; i++){
                        System.out.print(Actual +"");
                        if(i<Cantidad-1){
                            System.out.print(",");
                        }
                        Actual += Diferencia;
                        
                    } System.out.println("");
                    System.out.println("Desea ver otro numero");
                    Sucesion = entrada.nextInt();
                    break;

                    
                    
                case 2: 
                    break;
                    
                    
                case 3:
                Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del cuadrado: ");
        int size = scanner.nextInt();
        if (size <= 0) {
            System.out.println("No se aceptan negativos favor poner los numeros positivos.");
        } else {
            
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                   
                    if (i == size / 2 || j == size / 2) {
                        System.out.print("| ");
                    } else if (i < size / 2 && j < size / 2) {
                        System.out.print("* ");
                    } else if (i < size / 2 && j > size / 2) {
                        System.out.print("* ");
                    } else if (i > size / 2 && j < size / 2) {
                        System.out.print("* ");
                    } else {
                        System.out.print("* ");
                    }
                }
               
                System.out.println();
            }
        }
    }
}
                
                     
             
                        
           
                
            }

    }
    



