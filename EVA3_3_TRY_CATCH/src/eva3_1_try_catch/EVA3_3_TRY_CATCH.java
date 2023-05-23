package eva3_3_try_catch;

/**
 * @author Victorgrc
 */
public class EVA3_3_TRY_CATCH {

    public static void main(String[] args) {
        
        int x = 5, y = 0;
        try{
            /*
            Seccion de codigo que potencialmente puede generar
            una excepcion.
            */
            int resu = x / y;
            System.out.println("Resultado: " + resu);  
            
        }catch(ArithmeticException e){
            //Se genera un objeto exception llamado "e"
            //De tipo ArithmericExeption
            System.out.println(
                    "Se produjo un error: " + e.getMessage());
        }
        System.out.println("PROGRAMA TERMINADO");
    }
    
}
