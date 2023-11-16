package co.edu.uniquindio.poo;

public class Agua extends Bebida{

    public Agua(String nombre, float  valor){
        super(nombre, valor);
    }

    public double calcularPrecio(){
        return getValor();
    }


    
}
