package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.Collection;
public class Factura {

    private Cliente cliente;
    private Collection<Producto> productos;
    public Factura(Cliente cliente, Collection<Producto> productos) {
        this.cliente = cliente;
        this.productos = new ArrayList<Producto>();
        
    }
    public Cliente getCliente() {
        return cliente;
    }
    public Collection<Producto> getProductos() {
        return productos;
    }

    public void agregarProductos(Producto producto){
        assert producto != null;
        productos.add(producto);
    }

    public double calcularValorTotal(){
        double valorTotal = productos.stream().mapToDouble(e->e.calcularPrecio()).sum();
        if(getCliente() instanceof Estudiante){ 
            Estudiante estudiante = (Estudiante)getCliente();
            valorTotal = valorTotal-(valorTotal*(0.012*estudiante.getSemestreActual()));
        }
        else if(getCliente() instanceof Profesor){
            Profesor profesor = (Profesor)getCliente();
            CategoriaProfesor categoria = profesor.getCategoriaProfesor();
            if(categoria == CategoriaProfesor.AUXILIAR){
                valorTotal = valorTotal-(valorTotal*(0.03));
            }
            else if (categoria == CategoriaProfesor.ASISTENTE){
                valorTotal = valorTotal-(valorTotal*(0.05));
            }
            else if(categoria == CategoriaProfesor.ASOCIADO){
                valorTotal = valorTotal-(valorTotal*(0.1));
            }
            else{
                valorTotal = valorTotal-(valorTotal*(0.16));
            }

        }
        return valorTotal;
    }


    

    
    
}
