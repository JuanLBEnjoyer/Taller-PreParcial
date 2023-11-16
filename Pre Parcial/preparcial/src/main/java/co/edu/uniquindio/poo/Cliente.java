package co.edu.uniquindio.poo;

public abstract class Cliente {

    private String cedula;
    private String nombre;
    private String apellido;
    private String correo;

    public Cliente(String cedula, String nombre, String apellido, String correo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;

        assert cedula != null && !cedula.isBlank();
        assert nombre != null && !nombre.isBlank();
        assert apellido != null && !apellido.isBlank();
        assert correo != null && !correo.isBlank();
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCorreo() {
        return correo;
    }

    

    


    
}
