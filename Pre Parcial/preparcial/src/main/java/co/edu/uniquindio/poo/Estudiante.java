package co.edu.uniquindio.poo;

public class Estudiante extends Cliente {

    private byte semestreActual;

    public Estudiante(String cedula, String nombre, String apellido, String correo, byte semestreActual) {
        super(cedula, nombre, apellido, correo);
        this.semestreActual = semestreActual;
    }

    public byte getSemestreActual() {
        return semestreActual;
    }

    

    
    
}
