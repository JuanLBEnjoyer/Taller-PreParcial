package co.edu.uniquindio.poo;

public class BebidaAlcoholicaImportada extends BebidaAlcoholica {

    public BebidaAlcoholicaImportada(String nombre, float valor, double gradoAlcohol) {
        super(nombre, valor, gradoAlcohol);

    
    }

    public double calcularPrecio(){
        double valorFinal = getValor()*1.3*(1+(0.3*getGradoAlcohol()));
        return valorFinal;
    }


    
    



    
}
