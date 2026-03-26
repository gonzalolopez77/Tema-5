package ej03;

public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // getters y setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    // Metodo calcular base
    public double calcular(int cantidad) {
        return precio * cantidad;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Precio: " + precio;
    }
}