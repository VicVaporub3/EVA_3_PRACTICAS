package eva3_1_unchecked_exceptions;

import java.util.Scanner;

/**
 *
 * @author Victorgrc
 */
public class EVA3_1_UNCHECKED_EXCEPTIONS {

    public static void main(String[] args) {
        //ARITHMETIC EXCEPTION: DIVISION BY ZERO.
        
        System.out.println("INICIANDO EL PROGRAMA");
        System.out.println("DECLARANDO VARIABLES");
        int x = 5, y = 0;
        System.out.println("INTENTAR LA DIVISION");
        int resu = x / y;
        System.out.println("RESUTADO: " + resu); //YA NO SE EJECUTA.
        
            
            //INPUTMISMATCH EXCEPTION
            Scanner scan = new Scanner(System.in);
            System.out.print("Ingresa un numero: ");
            int num = scan.nextInt(); 
            /*
            si el usuario introduce algo distino a un entero el programa
            se termina.
            */
            System.out.println("El numero es: " + num);

        //ARRAY_INDEX_OUT_OF_BOUNDS EXCEPTION
        
        int[] arreglo = new int[5];
        arreglo[0] = 2;
        arreglo[1] = 2;
        arreglo[2] = 2;
        arreglo[3] = 2;
        arreglo[4] = 2;
        arreglo[5] = 2;//<---? 5 no es una posicion valida del arreglo.
        

            //NULLPOINTER EXCEPTION
            Prueba objPrueba = null;
            System.out.println("Valor de x = " + objPrueba.x);
            //No puedo leer la , ya que no existe.
            
    }
    
}

class Prueba{
    int x = 1000;
}
