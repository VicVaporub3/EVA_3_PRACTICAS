package eva3_5_capturar_datos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Victorgrc
 */
public class EVA3_5_CAPTURAR_DATOS {

    public static void main(String[] args) {
        int valor;
        
        do{
            try{
                Scanner scan = new Scanner(System.in);
                System.out.print("Ingresa un entero: ");
                valor = scan.nextInt();
                break;
            }catch(InputMismatchException e){
                System.out.println(
                        "Se ingreso un dato incorrecto, no puede convertirse a un numero.");
            }
        }while(true);
                
        System.out.println("El valor ingresado es: " + valor);    
            
    }
    
}
