package eva3_4_multiples_excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Victorgrc
 */
public class EVA3_4_MULTIPLES_EXCEPCIONES {

    public static void main(String[] args) {
        int x, y;
        do{
            try {
                Scanner scan = new Scanner(System.in);
                System.out.print(
                        "Ingresa un entero: ");
                x = scan.nextInt();
                System.out.print(
                        "Ingresa otro entero: ");
                y = scan.nextInt();
                int resu = x / y;
                System.out.println(
                        "El resultado de la division de los enteros es: " + resu);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Captura incorrecta, no puede convertirse a numero.");
            } catch (ArithmeticException e) {
                System.out.println("No se puede dividir entre cero.");
            }
        }while(true);
        
        System.out.println("\nPROGRAMA TERMINADO");
    }
    
}
