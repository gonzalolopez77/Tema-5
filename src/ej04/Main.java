package ej04;

public class Main {
    public static void main(String[] args) {
        
        Electrodomestico[] listaElectrodomesticos = new Electrodomestico[5];
        
        listaElectrodomesticos[0] = new Electrodomestico(200, "verde", 'C', 60);
        listaElectrodomesticos[1] = new Lavadora(150, 30);
        listaElectrodomesticos[2] = new Television(500, "negro", 'E', 80, 42, false);
        listaElectrodomesticos[3] = new Lavadora(300, "blanco", 'Z', 40, 40);
        listaElectrodomesticos[4] = new Television(250, 70);
        
        double sumaElectrodomesticos = 0;
        double sumaLavadoras = 0;
        double sumaTelevisiones = 0;
        
        for (int i = 0; i < listaElectrodomesticos.length; i++) {
            
            double precio = listaElectrodomesticos[i].precioFinal();
            System.out.println("El precio del aparato en la posición " + i + " es: " + precio + " €");
            
            sumaElectrodomesticos += precio;
            
            if (listaElectrodomesticos[i] instanceof Lavadora) {
                sumaLavadoras += precio;
            } else if (listaElectrodomesticos[i] instanceof Television) {
                sumaTelevisiones += precio;
            }
        }
        
        System.out.println("Suma total de Electrodomesticos: " + sumaElectrodomesticos + " €");
        System.out.println("Suma total de Lavadoras: " + sumaLavadoras + " €");
        System.out.println("Suma total de Televisiones: " + sumaTelevisiones + " €");
    }
}