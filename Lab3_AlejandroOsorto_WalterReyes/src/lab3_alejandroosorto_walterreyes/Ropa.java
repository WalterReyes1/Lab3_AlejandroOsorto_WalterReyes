package lab3_alejandroosorto_walterreyes;

public class Ropa extends Productos
{
    protected char tipoSexo;
    protected char talla;

    public Ropa()
    {
        super();
    }

    public Ropa(char tipoSexo, char talla, String descripcion, String nombre, double precio)
    {
        super(descripcion, nombre, precio);
        this.tipoSexo = tipoSexo;
        this.talla = talla;
    }

    public char getTipoSexo()
    {
        return tipoSexo;
    }

    public void setTipoSexo(char tipoSexo)
    {
        this.tipoSexo = tipoSexo;
    }

    public char getTalla()
    {
        return talla;
    }

    public void setTalla(char talla)
    {
        this.talla = talla;
    }

    @Override
    public String toString()
    {
        return super.toString()+"Ropa{" + "tipoSexo=" + tipoSexo + ", talla=" + talla + '}';
    }
    
}
