
package lab3_alejandroosorto_walterreyes;

public class Empleados extends Personas {
   protected String horario;
   protected int vendido;

    public Empleados() {
    super();
    }

    public Empleados(String horario, int vendido, String contraseña, String Correo, String nombre) {
        super(contraseña, Correo, nombre);
        this.horario = horario;
        this.vendido = vendido;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getVendido() {
        return vendido;
    }

    public void setVendido(int vendido) {
        this.vendido = vendido;
    }

    @Override
    public String toString() {
        return super.toString()+"Empleados{" + "horario=" + horario + ", vendido=" + vendido + '}';
    }
    
    
    
   
    
}
