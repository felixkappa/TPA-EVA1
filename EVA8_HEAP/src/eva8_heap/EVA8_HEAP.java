/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva8_heap;

/**
 *
 * @author invitado
 */
public class EVA8_HEAP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona Perso = new Persona();    
        Persona Perso1 = new Persona("Juan", "Perez", 20);
              
        System.out.println(Perso1);
        
        Persona copia = Perso1;
        
        System.out.print(Perso1);
        System.out.println(copia);
        
        Perso = null;
        //Borra el objeto de la memoria la direccion del stack
        
        //esto no es una copia del objetos estaqmos copiando las direciones de memoria al mismoi objeto
        
        
        String jose = Perso1.getNombre();
        String herenadez = Perso1.getApellido();
        int veintecinco = Perso1.getEdad();
        
        
    }
    
}



class Persona{
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

    public Persona() {
    }

    
    
}
