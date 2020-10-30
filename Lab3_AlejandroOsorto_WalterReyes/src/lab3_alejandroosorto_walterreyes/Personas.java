
package lab3_alejandroosorto_walterreyes;
import java.util.Scanner;
import java.util.ArrayList;


public class Personas {
    static Scanner lectura= new Scanner(System.in);
protected ArrayList id = new ArrayList();
protected ArrayList Username = new ArrayList();
protected String contraseña;
protected String Correo;
protected String nombre; 

    public Personas() {
    }

    public Personas(String contraseña, String Correo, String nombre) {
        this.contraseña = contraseña;
        this.Correo = Correo;
        this.nombre = nombre;
    }

    public ArrayList getId() {
        return id;
    }

    public void setId(ArrayList id) {
        this.id = id;
    }

    public ArrayList getUsername() {
        return Username;
    }

    public void setUsername(ArrayList Username) {
        this.Username = Username;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Personas{" + "id=" + id + ", Username=" + Username + ", contrase\u00f1a=" + contraseña + ", Correo=" + Correo + ", nombre=" + nombre + '}';
    }



}
