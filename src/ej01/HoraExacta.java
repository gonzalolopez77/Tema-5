package ej01;

public class HoraExacta extends Hora { 
    private int segundos;

    // Constructor para inicializar hora y minutos
    public HoraExacta(int hora, int minutos, int segundos) {
        super(hora, minutos); 
        if (!setSegundo(segundos)) {
            this.segundos = 0;
        }
    }

    // Asigna segundos si el valor es válido
    public boolean setSegundo(int valor) {
        boolean esValido = false;
        if (valor >= 0 && valor <= 59) {
            this.segundos = valor;
            esValido = true;
        }
        return esValido;
    }

    // Incrementar un segundo
    @Override
    public void inc() {
        segundos++;
        if (segundos > 59) {
            segundos = 0;
            super.inc();
        }
    }

    // Añade segundos al toString
    @Override
    public String toString() {
        return super.toString() + ":" + String.format("%02d", segundos);
    }
}