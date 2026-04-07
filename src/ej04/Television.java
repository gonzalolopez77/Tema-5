package ej04;

public class Television extends Electrodomestico {
	//atributos
    private double resolucion;
    private boolean sintonizador;
    
  //get y set
    public double getResolucion() {
    	return resolucion; 
    	}
    
    public void setResolucion(double resolucion) {
    	this.resolucion = resolucion; 
    	}
    
    public boolean isSintonizadorTDT() {
    	return sintonizador; 
    	}
    
    public void setSintonizadorTDT(boolean sintonizadorTDT) {
    	this.sintonizador = sintonizadorTDT; 
    	}
    
    private final static double RESOLUCIONDEF = 20;
    private final static boolean SINTONIZADORDEF = false;
    
    //constructor
    public Television(double precioBase, double peso) {
        super(precioBase, peso);
        this.resolucion = RESOLUCIONDEF;
        this.sintonizador = SINTONIZADORDEF;
    }
    
    //constructor
    public Television(double precioBase, String color, char consumo, double peso, double resolucion, boolean sintonizadorTDT) {
        super(precioBase, color, consumo, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizadorTDT;
    }

    @Override
    public double precioFinal() {
        double plus = super.precioFinal();
        
        if (resolucion > 40) {
            plus += (plus * 0.30);
        }
        if (sintonizador) {
            plus += 50;
        }
        
        return plus;
    }
}
