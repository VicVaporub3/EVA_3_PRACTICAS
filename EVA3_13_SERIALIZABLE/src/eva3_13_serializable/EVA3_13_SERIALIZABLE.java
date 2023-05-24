/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_13_serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author invitado
 */
public class EVA3_13_SERIALIZABLE {
    private static Persona perso;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
    
    }
       {
           // TODO code application logic here
        String ruta = "C:\\Users\\invitado\\Documents.per";
        Persona perso = new Persona("Kanye", "west", 38);
        try {
            guardarObj(perso, ruta);
        } catch (IOException ex) {
            Logger.getLogger(EVA3_13_SERIALIZABLE.class.getName()).log(Level.SEVERE, null, ex);
        }
        Persona resu = null;
        try {
            resu = leerObj(ruta);
        } catch (IOException ex) {
            Logger.getLogger(EVA3_13_SERIALIZABLE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EVA3_13_SERIALIZABLE.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Nombre: " + resu.getNombre());
        System.out.println("Apellido: " + resu.getApellido());
        System.out.println("Edad: " + resu.getEdad());
}  
    
       
    public static void guardarObj(Persona perso, String ruta) throws IOException{
        FileOutputStream foStream = new FileOutputStream(ruta);
        ObjectOutputStream ooStream = new ObjectOutputStream(foStream);
        ooStream.writeObject(perso);
        ooStream.close();
    }
    public static Persona leerObj(String ruta) throws IOException, ClassNotFoundException{
        FileInputStream fiStream = new FileInputStream(ruta);
        ObjectInputStream oiStream = new ObjectInputStream(fiStream);
       perso = (Persona)oiStream.readObject();
       return perso;
    }
    class Persona implements Serializable{ 
        private String nombre;
        private String apellido;
        private int edad;

        public Persona(String nombre, String apellido, int edad) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.edad = edad;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }
    }
    
}
