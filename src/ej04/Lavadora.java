package ej04;

public class Lavadora extends Electrodomestico{
	protected double carga;
	protected final double CARGADEF = 5;
	
	public double getCarga() {
		return carga;
	}

	public void setCarga(double carga) {
		this.carga = carga;
	}
	
	public Lavadora(double precioBase, double peso) {
		super(precioBase, peso);
		this.carga = CARGADEF;
		this.color = COLORDEF;
		this.consumo = CONSUMODEF;
	}
	
	public Lavadora(double precioBase, String color, char consumo, double peso) {
		super(precioBase, color, consumo, peso);
		this.carga = carga;
	}

	
	
	
	
}
