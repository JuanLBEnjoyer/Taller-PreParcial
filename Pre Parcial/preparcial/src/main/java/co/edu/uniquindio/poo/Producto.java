package co.edu.uniquindio.poo;

public abstract class Producto implements Impuesto {

    private String nombre;
    private float valor;

    public Producto(String nombre, float valor) {
        this.nombre = nombre;
        this.valor = valor;
        assert nombre != null && !nombre.isBlank(): "Debe ingresar el nombre del producto";
        assert valor > 0:"El valor del producto no puede ser negativo";
    }

    public String getNombre() {
        return nombre;
    }

    public float getValor() {
        return valor;
    }

    public void setNombre(String nombre) {
        assert nombre != null && !nombre.isBlank();
        this.nombre = nombre;
    }

    public void setValor(float valor) {
        assert valor > 0;
        this.valor = valor;
    }
    
    
}
