package lab3_alejandroosorto_walterreyes;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3_AlejandroOsorto_WalterReyes
{

    static Scanner lectura = new Scanner(System.in);
    static ArrayList gente = new ArrayList();
    static ArrayList usuarios = new ArrayList();
    static ArrayList contraseñas = new ArrayList();
    static ArrayList Locales = new ArrayList();

    public static void main(String[] args)
    {
        int opcion = 0;
        int valid = 0;
        while (opcion != 4)
        {
            System.out.println("1-Sign in clientes");
            System.out.println("2-Log-In clientes");
            System.out.println("3-Log-In SUDO");
            System.out.print("Ingrese una opción: ");
            opcion = lectura.nextInt();

            switch (opcion)
            {
                case 1:
                {
                    valid = 1;
                    String usuario;
                    System.out.print("Ingrese un nombre de usuario: ");
                    usuario = lectura.next();
                    if (usuarios.contains(usuario))
                    {
                        do
                        {
                            System.out.print("Ese usuario ya existe, ingrese otro: ");
                            usuario = lectura.next();

                        } while (usuarios.contains(usuario));
                    }
                    usuarios.add(usuario);

                    System.out.print("Ingrese id: ");
                    int id = lectura.nextInt();

                    System.out.print("Ingrese contraseña: ");
                    String contraseña = lectura.next();
                    contraseñas.add(contraseña);

                    System.out.print("Ingrese correo: ");
                    String correo = lectura.next();
                    System.out.print("Ingrese nombre completo: ");
                    lectura.nextLine();
                    String nombre = lectura.nextLine();
                    Personas p = new Personas(id, usuario, contraseña, correo, nombre);
                    gente.add(p);

                    break;
                }

                case 2:
                {
                    if (valid == 0)
                    {
                        System.out.println("Primero cree un usuario");
                    } else
                    {

                        String usuario;
                        String contraseña;

                        System.out.print("Ingrese nombre de usuario: ");
                        usuario = lectura.next();

                        System.out.print("Ingrese contraseña");
                        contraseña = lectura.next();

                        boolean check = false;

                        for (Object t : usuarios)
                        {
                            int num = usuarios.indexOf(t);

                            if (contraseñas.get(num).equals(contraseña))
                            {
                                check = true;
                            }
                        }
                        if (check == true)
                        {
                            System.out.println("Bienvenido " + usuario);
                            System.out.println("");
                            System.out.println("tiendas disponibles: ");
                            Locales l = new Locales();
                            System.out.println(l);

                        }

                        //---------------------------------------------------//
                        if (check == false)
                        {
                            System.out.println("Contraseña o username incorrecto");
                        }
                    }
                    break;
                }
                case 3:
                {
                    System.out.print("Ingrese el usuario del SUDO: ");
                    String usuarioSUDO = lectura.next();

                    //Aqui valido si el usuario existe
                    //--------------------------------
                    System.out.print("Ingrese la contraseña: ");
                    String contraseña = lectura.next();

                    //Aqui valido la contraseña
                    //-------------------------
                    int subOpcion = 1;

                    while (subOpcion != 4)
                    {
                        System.out.println("---MENU---");
                        System.out.println("1) Gestionar Locales");
                        System.out.println("2) Gestionar Personas");
                        System.out.println("3) Gestionar Productos");
                        System.out.println("4 Salir");
                        System.out.println("----------");
                        System.out.print("Ingrese la opcion que desee usar: ");
                        subOpcion = lectura.nextInt();

                        switch (subOpcion)
                        {
                            case 1:
                            {
                                System.out.println("---OTRO MENU---");
                                System.out.println("1) Añadir local");
                                System.out.println("2) Eliminar local");
                                System.out.println("3) Editar local");
                                System.out.println("---------------");
                                System.out.print("Ingrese una opcion: ");
                                int subSubOpcion = lectura.nextInt();

                                switch (subSubOpcion)
                                {
                                    case 1:
                                    {
                                        System.out.print("Ingrese el nombre del nuevo local: ");
                                        String nombre = lectura.next();
                                        System.out.println("");
                                    }
                                    break;
                                }
                            }
                            break;
                        }
                    }
                }
                break;
            }// fin switch
        }// fin while        
    }
}
