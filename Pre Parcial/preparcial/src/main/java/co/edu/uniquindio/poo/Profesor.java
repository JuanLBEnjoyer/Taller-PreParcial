package co.edu.uniquindio.poo;

public class Profesor extends Cliente {

    private CategoriaProfesor categoriaProfesor;

    public Profesor(String cedula, String nombre, String apellido, String correo, CategoriaProfesor categoriaProfesor) {
        super(cedula, nombre, apellido, correo);
        this.categoriaProfesor = categoriaProfesor;
        assert categoriaProfesor != null;
    }

    public CategoriaProfesor getCategoriaProfesor() {
        return categoriaProfesor;
    }

    

    
    
}
