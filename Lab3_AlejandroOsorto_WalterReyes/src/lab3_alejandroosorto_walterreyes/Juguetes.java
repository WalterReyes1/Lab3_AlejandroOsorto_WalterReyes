package lab3_alejandroosorto_walterreyes;

public class Juguetes extends Productos
{

    protected String descripcionJuguete;
    
    public Juguetes()
    {
    }

    public Juguetes(String descripcionJuguete, String descripcion, String nombre, double precio)
    {
        super(descripcion, nombre, precio);
        this.descripcionJuguete = descripcionJuguete;
    }

    public String getDescripcionJuguete()
    {
        return descripcionJuguete;
    }

    public void setDescripcionJuguete(String descripcionJuguete)
    {
        this.descripcionJuguete = descripcionJuguete;
    }

    @Override
    public String toString()
    {
        return super.toString()+"Juguetes{" + "descripcionJuguete=" + descripcionJuguete + '}';
    }

    
    
    
    
    
}
