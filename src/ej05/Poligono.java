package ej05;

public abstract class Poligono {
	//atributos
    protected int numeroLados;

  //get
    public int getNumeroLados() { 
        return numeroLados;
    }
    
    //constructor
    public Poligono(int numeroLados) { 
        this.numeroLados = numeroLados;
    }

    //toString
    @Override
    public String toString() { 
        return "Numero de lados: " + numeroLados;
    }

    // Metodo area() 
    public abstract double area(); 
}