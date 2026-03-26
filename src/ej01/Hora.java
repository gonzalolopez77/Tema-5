package ej01;

public class Hora {
    protected int hora;
    protected int minutos;

    // Constructor que comprueba valores correctos
    public Hora(int hora, int minutos) {
        if (!setHora(hora)) {
            this.hora = 0;
        }
        if (!setMinutos(minutos)) {
            this.minutos = 0;
        }
    }

    // Incrementa la hora en un minuto
    public void inc() {
        minutos++;
        if (minutos > 59) {
            minutos = 0;
            hora++;
            if (hora > 23) {
                hora = 0;
            }
        }
    }

    // Asigna minutos si el valor es válido
    public boolean setMinutos(int valor) {
        boolean esValido = false;
        if (valor >= 0 && valor <= 59) {
            this.minutos = valor;
            esValido = true;
        }
        return esValido;
    }

    // Asigna hora si el valor es válido
    public boolean setHora(int valor) {
        boolean esValido = false;
        if (valor >= 0 && valor <= 23) {
            this.hora = valor;
            esValido = true;
        }
        return esValido;
    }

    // Imprime la hora
    @Override
    public String toString() {
        // String.format ayuda a poner el cero a la izquierda si es necesario
        return hora + ":" + String.format("%02d", minutos);
    }
}
