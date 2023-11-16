package co.edu.uniquindio.poo;

public class Dulce extends Producto{
    private double impuestoBase;
    private double contenidoAzucar;
    public Dulce(String nombre, float valor,double contenidoAzucar) {
        super(nombre, valor);
        this.impuestoBase = 0.1;
        this.contenidoAzucar = contenidoAzucar;
        assert contenidoAzucar >= 0;
    }

    public double getImpuestoBase() {
        return impuestoBase;
    }

    public double getContenidoAzucar() {
        return contenidoAzucar;
    }

    public double calcularPrecio(){
        double valorFinal = 0;
        if (contenidoAzucar > 50){
            valorFinal = getValor()+(getValor()*(impuestoBase+0.10));
        } 
        else{
            valorFinal = getValor()+(getValor()*(impuestoBase));
        }

        return valorFinal;

    }

    

    
    
}
