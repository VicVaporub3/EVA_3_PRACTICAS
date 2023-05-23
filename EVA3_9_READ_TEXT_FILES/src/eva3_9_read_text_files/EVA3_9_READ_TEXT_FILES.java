package eva3_9_read_text_files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Victorgrc
 */
public class EVA3_9_READ_TEXT_FILES {

    public static void main(String[] args) {
        String ruta = "c:\\archivos\\Prueba.txt"; //Windows
        try {
            readUsingFiles(ruta);//LEE EL ARCHIVO COMPLETO, INEFICIENTE PARA ARCHIVOS GRANDES
            readingUsingBufferedReader(ruta);//OPCION PARA ARCHIVOS DE TEXTO
            readUsingFileReader(ruta);//COMBINACION DE ARCHIVOS Y BUFFERED (EL PEOR DE LOS TRES)
            readUsingScanner(ruta);//Scanner es una herramienta general para entradas.
        } catch (IOException ex) {
            ex.printStackTrace(); //Imprimir la excepcion.
        }
    }
    
    /*
        Files -->
    */
    public static void readUsingFiles(String ruta) throws IOException{
        Path path = Paths.get(ruta);  //recibimos la ruta en formato de texto,
        //La convertimos a formato Path.
        System.out.println("LECTURA DE ARCHIVOS USANDO FILES");
        //List<String> contenidoArch = Files.readAllLines(path);
        //System.out.println(contenidoArch.toString());
        //for (int i = 0; i < contenidoArch.size(); i++) {
        //    System.out.println(contenidoArch.get(i));
        //}
        
        byte[] arregloBytes = Files.readAllBytes(path);
        System.out.println(new String(arregloBytes));
    }
    
    public static void readingUsingBufferedReader(String ruta) throws IOException{
        System.out.println("\nLECTURA DE ARCHIVOS USANDO BUFFERED READER");
        File file = new File(ruta); //La ruta de nuestro archivo.
        FileInputStream fis = new FileInputStream(file);//Abre el archivo.
        InputStreamReader isReader = new InputStreamReader(fis); //Lee el archivo, como Bytes.
        BufferedReader breader = new BufferedReader(isReader); //Interpreta los Bytes como caracteres.
        String linea;
        while((linea = breader.readLine()) != null){//Lee el archivo mientras no lleguemos al final del archivo
            System.out.println(linea);
        }
        breader.close();
    }
    
    public static void readUsingFileReader(String ruta) throws IOException{
        System.out.println("\nLECTURA DE ARCHIVOS USANDO FILE READER");
        File file = new File(ruta);
        FileReader fileReader = new FileReader(file);
        BufferedReader breader = new BufferedReader(fileReader); //Interpreta los Bytes como caracteres.
        String linea;
        while((linea = breader.readLine()) != null){//Lee el archivo mientras no lleguemos al final del archivo
            System.out.println(linea);
        }
        breader.close();
    }
    
    public static void readUsingScanner(String ruta) throws IOException{
        System.out.println("\nLECTURA DE ARCHIVOS USANDO SCANNER");
        
        Path source = Paths.get(ruta);
        Scanner sc = new Scanner(source);
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
        sc.close();
    }
}
