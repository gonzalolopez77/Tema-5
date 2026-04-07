package ej04;

public class Lavadora extends Electrodomestico {
	//atributos
    private double carga;
    private final static double CARGADEF = 5;
    
  //get y set
    public double getCarga() {
    	return carga; 
    	}
    
    public void setCarga(double carga) {
    	this.carga = carga; 
    	}
    
    //constructor
    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso);
        this.carga = CARGADEF;
    }
    
    //constructor
    public Lavadora(double precioBase, String color, char consumo, double peso, double carga) {
        super(precioBase, color, consumo, peso);
        this.carga = carga;
    }

    //
    @Override
    public double precioFinal() {
        double plus = super.precioFinal(); 
        
        if (carga > 30) {
            plus += 50;
        }
        
        return plus;
    }
}
