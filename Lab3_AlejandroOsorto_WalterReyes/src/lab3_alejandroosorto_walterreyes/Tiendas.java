
package lab3_alejandroosorto_walterreyes;

import java.util.ArrayList;

public class Tiendas extends Locales{

    public Tiendas() {
        super();
    }

    public Tiendas(String nombre, ArrayList empleados, ArrayList productos, String gerente) {
        super(nombre, empleados, productos, gerente);
    
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public ArrayList getEmpleados() {
        return empleados;
    }

    @Override
    public void setEmpleados(ArrayList empleados) {
        this.empleados = empleados;
    }

    @Override
    public ArrayList getProductos() {
        return productos;
    }

    @Override
    public void setProductos(ArrayList productos) {
        this.productos = productos;
    }

    @Override
    public String getGerente() {
        return gerente;
    }

    @Override
    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    @Override
    public String toString() {
        return super.toString()+"El local es una: "+"Tienda";
    }
    
    
    
}
