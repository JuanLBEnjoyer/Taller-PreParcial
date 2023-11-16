package co.edu.uniquindio.poo;



import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;



public class FacturaTest {
    @Test
    public void testCalcularValorTotal() {

        Estudiante estudiante = new Estudiante("12345", "Carlitos", "Muñoz", "cmuñoz@gmail.com", (byte)5);
        
        

        Factura factura1 = new Factura(estudiante, new ArrayList<Producto>());

        Dulce dulce = new Dulce("bonbon", 500, 20);        
        BebidaAlcoholicaImportada bebidaAlcoholicaImportada = new BebidaAlcoholicaImportada("Aguardiente", 30000,20);
        ProductoPanaderia productoPanaderia = new ProductoPanaderia("Pandebono", 1200,Conservante.SI);
        BebidaAzucarada bebidaAzucarada = new BebidaAzucarada("Gaseosa", 1500, 15);
        Fruta fruta = new Fruta("Manzana", 2000, 5);

        factura1.agregarProductos(dulce);
        factura1.agregarProductos(bebidaAlcoholicaImportada);
        factura1.agregarProductos(productoPanaderia);
        factura1.agregarProductos(bebidaAzucarada);
        factura1.agregarProductos(fruta);
       

        assertEquals(279688.54, factura1.calcularValorTotal());

    }
}
