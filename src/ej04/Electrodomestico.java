package ej04;

public class Electrodomestico {
	//atributos
	protected double precioBase;
	protected String color;
	protected char consumo;
	protected double peso;
	
	//por defecto
	protected final static String COLORDEF = "blanco";
    protected final static char CONSUMODEF = 'F';
    protected final static double PRECIOBASEDEF = 100;
    protected final static double PESODEF = 5;
	
	//get y set
	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumo() {
		return consumo;
	}

	public double getPeso() {
		return peso;
	}
	
	public Electrodomestico(double precioBase, double peso) {
		super();
		this.precioBase = precioBase;
		this.peso = peso;
		this.color = COLORDEF;
		this.consumo = CONSUMODEF;
	}
	
	public Electrodomestico(double precioBase, String color, char consumo, double peso) {
		super();
		this.precioBase = precioBase;
		this.color = color;
		this.consumo = consumo;
		this.peso = peso;
	}

	public void comprobarConsumoEnergetico(char letra) {
		if(letra <= 'A' && letra >= 'F') {
			this.consumo = letra;
		} else {
			this.consumo = CONSUMODEF;
		}
	}
	
	public void comprobarColor(String color) {
		String[] colores = {"blanco", "negro", "rojo", "azul", "gris"};
		for(int i = 0; i < colores.length; i++){
			if(colores[i].equalsIgnoreCase(color)) {
				this.color = color;
			}else {
				this.color = COLORDEF;
			}
		}
	}
	
	public double precioFinal() {
        double aumento = 0;
        
        switch (consumo) {
            case 'A': aumento += 100; break;
            case 'B': aumento += 80; break;
            case 'C': aumento += 60; break;
            case 'D': aumento += 50; break;
            case 'E': aumento += 30; break;
            case 'F': aumento += 10; break;
        }

        if (peso >= 0 && peso <= 19) {
            aumento += 10;
        } else if (peso >= 20 && peso <= 49) {
            aumento += 50;
        } else if (peso >= 50 && peso <= 79) {
            aumento += 80;
        } else if (peso >= 80) {
            aumento += 100;
        }

        return precioBase + aumento;
    }
	
}
