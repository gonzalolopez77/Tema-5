package ej05;

public class Rectangulo extends Poligono{

	//atributos
	private double lado1;
	final private double LADODEF1 = 1;
	private double lado2;
	final private double LADODEF2 = 1;
	
	//get y set
	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}
	
	//constructores
	public Rectangulo() {
		super(4);
		this.lado1 = LADODEF1;
		this.lado2 = LADODEF2;
	}
	
	public Rectangulo(double lado1, double lado2) {
		super(4);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	//toString
    @Override
    public String toString() { 
        return ("Rectantulo-Lados: " + lado1 + " " + lado2);
    }
	
	@Override
	public double area() {
		return lado1 * lado2;
	}	
}
