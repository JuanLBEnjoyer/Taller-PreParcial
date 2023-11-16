package co.edu.uniquindio.poo;

public  abstract class BebidaAlcoholica extends Bebida{

    private double gradoAlcohol;

    public BebidaAlcoholica(String nombre, float valor, double gradoAlcohol) {
        super(nombre, valor);
        this.gradoAlcohol = gradoAlcohol;
        assert gradoAlcohol > 0;
    }

    public double getGradoAlcohol() {
        return gradoAlcohol;
    }
    
    
}
