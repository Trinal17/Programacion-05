package es.daw.practicaguiadapoo.model;


public class Persona {
    
    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;
    private final String NIF; //una vez que tenga valor no pueda modificarse, sea constante

    private final static int MAYOR_EDAD= 18;

    private int contador; //pendiente!!! atributo compartido entre todos los objetos. Si 
                            // un objeto lo modificado, el resto de objetos se verán afectados...


                            /*/
    public Persona(String dni, String nombre, String apellidos, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }*/

    

    public Persona(String dni, String nombre, String apellidos, int edad, String NIF) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.NIF = NIF;
    }

    

    



    public String getNIF() {
        return NIF;
    }







    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }



    @Override
    public String toString() {
        return "dni = " + dni + ", nombre = " + nombre + ", apellidos = " + apellidos + ", edad = " + edad ;
    }
    
    public void imprime(){
        System.out.println(this.toString());
    }
    
    public boolean esMayorEdad(){
        if(edad >= 18)
            return true;
        else
            return false;
    }
    
    public boolean esJubilado(){
        if(this.edad >= 65)
            return true;
        else
            return false;
    }
    
    public int diferenciaEdad(Persona p1){
        int diferencia=0;
        diferencia = this.edad - p1.edad;
        return diferencia;
    }







    public void setContador(int contador) {
        this.contador = contador;
    }
    
            
}
