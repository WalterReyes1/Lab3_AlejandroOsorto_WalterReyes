package lab3_alejandroosorto_walterreyes;
import java.util.ArrayList;

public class Clientes extends Personas
{
    protected double cantDinero;
    protected ArrayList carrito;

    public Clientes()
    {
        super();
    }

    public Clientes(double cantDinero, ArrayList carrito, String contraseña, String Correo, String nombre)
    {
        super(contraseña, Correo, nombre);
        this.cantDinero = cantDinero;
        this.carrito = carrito;
    }
    

    public double getCantDinero()
    {
        return cantDinero;
    }

    public void setCantDinero(double cantDinero)
    {
        this.cantDinero = cantDinero;
    }

    public ArrayList getCarrito()
    {
        return carrito;
    }

    public void setCarrito(ArrayList carrito)
    {
        this.carrito = carrito;
    }

    @Override
    public String toString()
    {
        return super.toString()+"Clientes{" + "cantDinero=" + cantDinero + ", carrito=" + carrito + '}';
    }

    
    
    
}
