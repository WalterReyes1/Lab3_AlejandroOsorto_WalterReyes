package lab3_alejandroosorto_walterreyes;
import java.util.ArrayList;

public class Restaurantes extends Locales
{
    protected ArrayList productosAlimentarios;
    protected ArrayList listaEmpleados;
    protected String platilloDelDia;

    public Restaurantes()
    {
        super();
    }

    public Restaurantes(ArrayList productosAlimentarios, ArrayList listaEmpleados, String platilloDelDia, String nombre, ArrayList empleados, ArrayList productos, String gerente)
    {
        super(nombre, empleados, productos, gerente);
        this.productosAlimentarios = productosAlimentarios;
        this.listaEmpleados = listaEmpleados;
        this.platilloDelDia = platilloDelDia;
    }
    

    public ArrayList getProductosAlimentarios()
    {
        return productosAlimentarios;
    }

    public void setProductosAlimentarios(ArrayList productosAlimentarios)
    {
        this.productosAlimentarios = productosAlimentarios;
    }

    public ArrayList getListaEmpleados()
    {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList listaEmpleados)
    {
        this.listaEmpleados = listaEmpleados;
    }

    public String getPlatilloDelDia()
    {
        return platilloDelDia;
    }

    public void setPlatilloDelDia(String platilloDelDia)
    {
        this.platilloDelDia = platilloDelDia;
    }

    @Override
    public String toString()
    {
        return super.toString()+"Restaurantes{" + "productosAlimentarios=" + productosAlimentarios + ", listaEmpleados=" + listaEmpleados + ", platilloDelDia=" + platilloDelDia + '}';
    }
    
    
    
    
}
