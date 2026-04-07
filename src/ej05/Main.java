package ej05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    
    static List<Poligono> poligonos = new ArrayList<>(); 

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("-__MENU PRINCIPAL__-");
            System.out.println("1. Introducir triangulo.");
            System.out.println("2. Introducir rectangulo.");
            System.out.println("3. Mostrar poligonos.");
            opcion = scanner.nextInt();

            //switch
            switch (opcion) {
                case 1:
                    introducirTriangulo(); 
                    break;
                case 2:
                    introducirRectangulo(); 
                    break;
                case 3:
                    mostrarPoligonos(); 
                    break;
                default:
                    System.out.println("No valido");
            }
        } while (opcion != 3);
    }

    // funcion triangulo
    static void introducirTriangulo() { 
        System.out.print("Introduzca lado 1: ");
        double l1 = scanner.nextDouble();
        System.out.print("Introduzca lado 2: ");
        double l2 = scanner.nextDouble();
        System.out.print("Introduzca lado 3: ");
        double l3 = scanner.nextDouble();
        
        poligonos.add(new Triangulo(l1, l2, l3));
        System.out.println("Añadido");
    }

    // funcion rectangulo
    static void introducirRectangulo() { 
        System.out.print("Introduzca lado 1: ");
        double l1 = scanner.nextDouble();
        System.out.print("Introduzca lado 2: ");
        double l2 = scanner.nextDouble();
        
        poligonos.add(new Rectangulo(l1, l2));
        System.out.println("Añadido");
    }

    // funcion para ver el arraylist
    static void mostrarPoligonos() { 
        if (poligonos.isEmpty()) {
            System.out.println("Esta vacia");
            return;
        }
        
        System.out.println("Poligonos:");
        for (Poligono p : poligonos) {
            System.out.println(p.toString() + " Área: " + p.area());
        }
    }
}
