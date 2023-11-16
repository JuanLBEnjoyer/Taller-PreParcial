package co.edu.uniquindio.poo;

public class ProductoPanaderia extends Producto{

    private Conservante conservante;

    public ProductoPanaderia(String nombre, float valor, Conservante conservante) {
        super(nombre, valor);
        this.conservante = conservante;
        assert conservante != null;
    }

    public Conservante getConservante() {
        return conservante;
    }

    public double calcularPrecio(){
        double precioFinal = 0;
        if(getConservante() == Conservante.SI){
            precioFinal = (getValor()*0.18)+getValor();
        }
        else{
            precioFinal = getValor();
        }

        return precioFinal;
    }

    

    
    
}
