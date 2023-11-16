package co.edu.uniquindio.poo;

public class BebidaAzucarada  extends Bebida {

    private double impuestoBase;
    private double contenidoAzucar;

    public BebidaAzucarada(String nombre, float valor, double contenidoAzucar){
        super(nombre, valor);
        this.impuestoBase = 0.05;
        this.contenidoAzucar = contenidoAzucar;
        assert contenidoAzucar >= 0;

    }

    public double calcularPrecio(){
        double precioFinal = 0;

        if(contenidoAzucar>35){
            precioFinal = getValor()+(getValor()*(impuestoBase+0.20));
        }
        else{
            precioFinal = getValor()+(getValor()*(impuestoBase));
        }
        return precioFinal;
    }


    
}
