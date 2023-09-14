/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva9_polimorfismo;

/**
 *
 * @author invitado
 */
public class EVA9_POLIMORFISMO {

    /**
     * @param args the command line arguments
     */
    
    static Persona perso1;
    static Persona perso2;
    public static void main(String[] args) {
      perso1 = new Persona();
      perso2 = new Persona("Felix", "Finiz", 25);         
      
    System.out.println(perso1);
    System.out.println(perso2);
    
    mensaje(perso1);
    mensaje(perso2);
    }
    
    public static void mensaje(Object obj){
    System.out.println("hola mundo");
    System.out.println(obj);
    if(obj == perso1)
    System.out.println("persona 1");
    else
       System.out.println("persona 2");
    Persona perso = (Persona)obj;
    System.out.println(perso.getNombre());
    System.out.println(perso.getApellido());
    System.out.println(perso.getEdad());
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
        

