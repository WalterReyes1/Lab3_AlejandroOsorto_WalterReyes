/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_alejandroosorto_walterreyes;
import java.util.ArrayList;
/**
 *
 * @author Alejandro
 */
public class Clientes extends Personas
{
    private double cantDinero;
    private ArrayList carrito;

    public Clientes()
    {
        super();
    }

    public Clientes(double cantDinero, ArrayList carrito)
    {
        
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
        return "Clientes{" + "cantDinero=" + cantDinero + ", carrito=" + carrito + '}';
    }
    
    
}
