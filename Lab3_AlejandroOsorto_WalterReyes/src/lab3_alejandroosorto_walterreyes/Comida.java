package lab3_alejandroosorto_walterreyes;
import java.util.Date;

public class Comida extends Productos
{
    protected int tipoComida;
    protected String tipoComidaS;
    protected Date fechaCaducidad;

    public Comida()
    {
        super();
    }

    public Comida(int tipoComida, Date fechaCaducidad, String descripcion, String nombre, double precio)
    {
        super(descripcion, nombre, precio);
        this.tipoComida = tipoComida;
        this.fechaCaducidad = fechaCaducidad;
        
        if (tipoComida == 1)
        {
            tipoComidaS = "Comida";
        }
        else if (tipoComida == 2)
        {
            tipoComidaS = "Bebida";
        }
    }

    

    public int getTipoComida()
    {
        return tipoComida;
    }

    public void setTipoComida(int tipoComida)
    {
        this.tipoComida = tipoComida;
        if (tipoComida == 1)
        {
            tipoComidaS = "Comida";
        }
        else if (tipoComida == 2)
        {
            tipoComidaS = "Bebida";
        }
    }

    public Date getFechaCaducidad()
    {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(Date fechaCaducidad)
    {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getTipoComidaS()
    {
        return tipoComidaS;
    }

    @Override
    public String toString()
    {
        return super.toString()+"Comida{" + "tipoComidaS=" + tipoComidaS + ", fechaCaducidad=" + fechaCaducidad + '}';
    }
    
    
    
    
}
