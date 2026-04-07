package ej05;

public class Triangulo extends Poligono{

	//atributos
		private double lado1;
		final private double LADODEF1 = 1;
		private double lado2;
		final private double LADODEF2 = 1;
		private double lado3;
		final private double LADODEF3 = 1;
		
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
		public double getLado3() {
			return lado3;
		}

		public void setLado3(double lado3) {
			this.lado3 = lado3;
		}
		
		//constructores
		public Triangulo() {
			super(3);
			this.lado1 = LADODEF1;
			this.lado2 = LADODEF2;
			this.lado2 = lado2;
			this.lado3 = lado3;
			this.lado3 = LADODEF3;
		}
		
		public Triangulo(double lado1, double lado2, double lado3) {
			super(3);
			this.lado1 = lado1;
			this.lado2 = lado2;
			this.lado3 = lado3;
		}

		//toString
	    @Override
	    public String toString() { 
	        return ("Triangulo-Lados: " + lado1 + " " + lado2 + " " + lado3);
	    }
		
	    @Override
	    public double area() {
	        double s = (lado1 + lado2 + lado3) / 2.0;
	        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
	    }	
}
