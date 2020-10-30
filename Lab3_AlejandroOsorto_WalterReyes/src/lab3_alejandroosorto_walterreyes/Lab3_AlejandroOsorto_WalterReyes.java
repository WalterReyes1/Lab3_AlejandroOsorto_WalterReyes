
package lab3_alejandroosorto_walterreyes;
import java.util.ArrayList;
import java.util.Scanner;


public class Lab3_AlejandroOsorto_WalterReyes {
  static Scanner lectura = new Scanner(System.in);
  static ArrayList gente = new ArrayList();
  static ArrayList usuarios = new ArrayList();
  static ArrayList contraseñas = new ArrayList();
  
    public static void main(String[] args) {
      int opcion = 0 ;
      while(opcion!= 4){
          System.out.println("1-Sign in clientes");   
          System.out.println("2-Log-In clientes");
          System.out.println("3-Log-In SUDO");
          System.out.print("Ingrese una opción: ");
          opcion =lectura.nextInt();
          
          switch(opcion){
              case 1: {
                  System.out.print("Ingrese un nombre de usuario: ");
                  String usuario = lectura.next();
                  System.out.print("Ingrese id: ");
                  int id = lectura.nextInt();
                  System.out.print("Ingrese contraseña: ");
                  String contraseña = lectura.next();
                  System.out.print("Ingrese correo: ");
                  String correo = lectura.next();
                  System.out.print("Ingrese nombre completo: ");
                  lectura.nextLine();
                  String nombre = lectura.nextLine();
                  Personas p = new Personas(id,usuario,contraseña,correo,nombre);
                  gente.add(p);
                  
                  
                  break;
              }  
              
              case 2: {
                  String usuario;
                  String contraseña;
                 
                  System.out.print("Ingrese nombre de usuario: ");
                   usuario = lectura.next();
                  System.out.print("Ingrese contraseña");
                  contraseña = lectura.next();
                      
                  
                  
                  break;
              }
              
          }// fin switch
          
          
      }// fin while
    }
    
}
