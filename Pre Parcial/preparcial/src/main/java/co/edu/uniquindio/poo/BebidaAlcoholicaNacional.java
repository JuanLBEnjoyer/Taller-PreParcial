package co.edu.uniquindio.poo;

public class BebidaAlcoholicaNacional extends BebidaAlcoholica {
 

    public BebidaAlcoholicaNacional(String nombre, float valor, double gradoAlcohol) {
        super(nombre, valor, gradoAlcohol);
    
    }

    public double calcularPrecio(){
        double precioFinal = 0;

        if(getGradoAlcohol()<25){
            precioFinal = (getValor()*(0.02*getGradoAlcohol()))+getValor();
        }
        else{
            precioFinal = (getValor()*0.5)+getValor();
        }


        return precioFinal;
    }

    
    
}
