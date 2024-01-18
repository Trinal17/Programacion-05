package es.daw.practicaguiadapoo;

import java.util.Scanner;

import es.daw.practicaguiadapoo.model.Persona;
import es.daw.practicaguiadapoo.util.Utils;


public class PracticaGuiadaPOO {

    public static Scanner lectorCadena = new Scanner(System.in);
    public static Scanner lectorEnteros = new Scanner(System.in);
    

    public static void main(String[] args) {
        
        // Llamar a un método para cargar personas....
        /*Persona[] personas = Utils.cargarPersonas();

        for (Persona persona : personas) {
            System.out.println(persona.toString());
            
        }*/
        // ------------------------------

         Persona persona1 = new Persona("51519669Z", "Ivan", "Izquierdo Castillo", 18);
         Persona persona2 = new Persona("45542552Y", "Felix", "Izquierdo Castillo", 22);
         Persona persona3 = new Persona("63368998T", "Paula", "Castillo Rodrigo", 12);
         Persona persona4 = new Persona("78875115H", "Juan", "Castillo Vela", 79);
        
        persona1.imprime();
        persona2.imprime();
        
        if(persona1.esMayorEdad())
            System.out.println(persona1.getNombre()+" es mayor de edad");
        else
            System.out.println(persona1.getNombre()+" no es mayor de edad");
        
        if(persona3.esMayorEdad())
            System.out.println(persona3.getNombre()+" es mayor de edad");
        else
            System.out.println(persona3.getNombre()+" no es mayor de edad");
        
        if(persona4.esJubilado())
            System.out.println(persona4.getNombre()+" esta jubilado");
        else 
            System.out.println(persona4.getNombre()+" no esta jubilado");
            
        System.out.println("La diferencia de edad entre "+persona2.getNombre()+ " y "+persona4.getNombre()+" es "+persona4.diferenciaEdad(persona2));
        
        
    }
    
    
}
