
package lab3_alejandroosorto_walterreyes;

import java.util.ArrayList;


public class Quiosco extends Locales {
    protected double descuento = 0.50;

    public Quiosco() {
   super();
    }

    public Quiosco(String nombre, ArrayList empleados, ArrayList productos, String gerente) {
        super(nombre, empleados, productos, gerente);
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    
    
}
