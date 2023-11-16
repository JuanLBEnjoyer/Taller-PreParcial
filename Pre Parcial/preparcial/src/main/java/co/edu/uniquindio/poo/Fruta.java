package co.edu.uniquindio.poo;

public class Fruta extends Producto {

    private double pesoKilos;
    private double impuestoBase;


    public Fruta(String nombre, float valorLibra, double pesoKilos) {
        super(nombre, valorLibra);
        this.pesoKilos = pesoKilos;
        this.impuestoBase = 0.07;
        assert pesoKilos > 0;
        assert valorLibra > 0;
    }


    public double getPesoKilos() {
        return pesoKilos;
    }


    public double calcularPrecio(){
        double precioFinal = (pesoKilos*2)*getValor();
        if(pesoKilos>3){
             double nuevoImpuestoBase = impuestoBase-((pesoKilos-3)/100);
             if(nuevoImpuestoBase <= 0){
                precioFinal = precioFinal*(0)+precioFinal; 
             }
             else{
                precioFinal =precioFinal*(nuevoImpuestoBase)+precioFinal;
             }
        }
        else{
            precioFinal = (precioFinal*(impuestoBase))+precioFinal;
        }
        return precioFinal;
    }



    


    
}
