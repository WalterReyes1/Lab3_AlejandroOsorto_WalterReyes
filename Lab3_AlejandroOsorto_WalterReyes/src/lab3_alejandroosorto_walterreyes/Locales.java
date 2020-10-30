
package lab3_alejandroosorto_walterreyes;

import java.util.ArrayList;


public class Locales {
 protected String nombre;
 protected ArrayList empleados;
 protected ArrayList productos;
 protected String gerente;

    public Locales() {
    }

    public Locales(String nombre, ArrayList empleados, ArrayList productos, String gerente) {
        this.nombre = nombre;
        this.empleados = empleados;
        this.productos = productos;
        this.gerente = gerente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList empleados) {
        this.empleados = empleados;
    }

    public ArrayList getProductos() {
        return productos;
    }

    public void setProductos(ArrayList productos) {
        this.productos = productos;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    @Override
    public String toString() {
        return "Locales{" + "nombre=" + nombre + ", empleados=" + empleados + ", productos=" + productos + ", gerente=" + gerente + '}';
    }
 
 
}
