package ej02;

public class Empleado {
    private String nombre;

    // Constructor 
    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    // getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Empleado " + nombre;
    }
}
