package es.daw.poo2.productosperecederos.model;

public abstract class Producto implements  Exportable2XML, Comparable<Producto>{
    // ATRIBUTOS
    private String nombre;
    private double precio;

    // ------------------
    // CONSTRUCTOR/ES
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Si el enunciado dice: se pueden dar de alta en el sistema
    // productos con solo el nombre
    public Producto(String nombre) {
        this.nombre = nombre;
    }
    // -------------------

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    // MÉTODOS DE COMPORTAMIENTO: funcionalidades
    public double calcular(int cantidad){
        return precio * cantidad;
    }

    // MÉTODOS ABSTRACTOS
    public abstract boolean permiteDevolucion();
    
    // Si el enunciado dice que el nombre del producto una vez
    // creado no se puede modificar....
    // SOLUCIÓN: No debería crear el setNombre (encapsulación)

    // MÉTODOS SOBREESCRITOS DE OBJECT..
    @Override
    public String toString() {
        return "Producto [nombre=" + nombre + ", precio=" + precio + "]";
    }

    @Override
    public int compareTo(Producto o) {
        return nombre.compareTo(o.nombre);
    }

}
