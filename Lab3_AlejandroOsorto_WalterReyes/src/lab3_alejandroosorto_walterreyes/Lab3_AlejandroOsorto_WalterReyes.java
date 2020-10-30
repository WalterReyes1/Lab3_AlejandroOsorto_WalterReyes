package lab3_alejandroosorto_walterreyes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;

public class Lab3_AlejandroOsorto_WalterReyes
{

    static Scanner lectura = new Scanner(System.in);
    static ArrayList gente = new ArrayList();
    static ArrayList usuarios = new ArrayList();
    static ArrayList contraseñas = new ArrayList();
    static ArrayList Locales = new ArrayList();
    static ArrayList empleados = new ArrayList();
    static ArrayList producto = new ArrayList();
    
    public static void main(String[] args) throws ParseException
    {
        int opcion = 0;
        int valid = 0;
        while (opcion != 4)
        {
            System.out.println("1-Sign in clientes");
            System.out.println("2-Log-In clientes");
            System.out.println("3-Log-In SUDO");
            System.out.println("4-Salir");
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
                        System.out.println("4) Salir");
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
                                System.out.println("4) Visualizar locales");
                                System.out.println("---------------");
                                System.out.print("Ingrese una opcion: ");
                                int subSubOpcion = lectura.nextInt();

                                switch (subSubOpcion)
                                {
                                    case 1:
                                    {
                                        System.out.print("Ingrese el nombre del nuevo local: ");
                                        String nombre = lectura.next();
                                        
                                        System.out.print("Ingrese el nombre del gerente: ");
                                        String nombreG = lectura.next();
                                        
                                        boolean fin = false;
                                        
                                        while (fin == false)
                                        {
                                            System.out.print("Ingrese un empleado: ");
                                            String nombreEmpleado = lectura.next();
                                            System.out.print("Ingrese su ");
                                            
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
                                            String contraseñaEmpleado = lectura.next();
                                            contraseñas.add(contraseña);

                                            System.out.print("Ingrese correo: ");
                                            String correo = lectura.next();
                                            System.out.print("Ingrese nombre completo: ");
                                            lectura.nextLine();
                                            //String nombreEmpleado = lectura.nextLine();
                                            Personas p = new Personas(id, usuario, contraseña, correo, nombre);
                                            gente.add(p);
                                        }
                                    } break;
                                }
                            } break; //Fin de gestion de locales
                            case 2:
                            {
                                
                            } break; //Fin de gestion de personas
                            case 3:
                            {
                                System.out.println("---OTRO MENU---");
                                System.out.println("1) Añadir producto");
                                System.out.println("2) Eliminar producto");
                                System.out.println("3) Editar producto");
                                System.out.println("4) Visualizar producto");
                                System.out.println("---------------");
                                System.out.print("Ingrese una opcion: ");
                                int subSubOpcion = lectura.nextInt();
                                
                                switch (subSubOpcion)
                                {
                                    case 1:
                                    {
                                        System.out.print("Ingrese la descripcion del producto: ");
                                        lectura.nextLine();
                                        String desc = lectura.nextLine();
                                        System.out.print("Ingrese el nombre del producto: ");
                                        String nombre = lectura.next();
                                        System.out.print("Ingrese el precio: ");
                                        double precio = lectura.nextDouble();
                                        System.out.println("Ingrese el tipo de producto(1 = ropa, 2= juguete, 3= comida): ");
                                        int tipo = lectura.nextInt();
                                        if (tipo == 1) //Ropa
                                        {
                                            System.out.print("Ingrese el sexo de la ropa(M/F): ");
                                            char sexo = lectura.next().charAt(0);
                                            System.out.print("Ingrese la talla de la prenda(S,M,L): ");
                                            char talla = lectura.next().charAt(0);
                                            
                                            producto.add(new Ropa(sexo, talla, desc, nombre, precio));
                                        }
                                        else if (tipo == 2) //Juguete
                                        {
                                            System.out.print("Ingrese la descripcion del juguete: ");
                                            lectura.nextLine();
                                            String descJug = lectura.nextLine();
                                            producto.add(new Juguetes(descJug, desc, nombre, precio));
                                        }
                                        else if (tipo == 3) //Comida
                                        {
                                            System.out.print("Ingrese el tipo de comida(1 = Comida, 2 = Bebida): ");
                                            int tipoComida = lectura.nextInt();
                                            System.out.print("Ingrese la fecha de caducidad(dd/MM/yyyy): ");
                                            String fechaS = lectura.next();
                                            SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy");
                                            Date fecha = df.parse(fechaS);
                                            
                                            producto.add(new Comida(tipoComida, fecha, desc, nombre, precio));
                                        }
                                        
                                    } break;
                                    case 2:
                                    {
                                        System.out.print("Ingrese la posicion en la lista donde esté el producto que quiera eliminar: ");
                                        int pos = lectura.nextInt();
                                        
                                        if (pos >= 0 && pos < producto.size())
                                        {
                                            producto.remove(pos);
                                        }
                                        else
                                        {
                                            System.out.println("Posicion ingresada fuera de rango");
                                        }
                                    } break;
                                    case 3:
                                    {
                                        System.out.print("Ingrese la posicion en la lista donde esté el producto que quiera modificar: ");
                                        int pos = lectura.nextInt();
                                        
                                        if (pos >= 0 && pos < producto.size())
                                        {
                                            System.out.println("Que desea modificar?");
                                            System.out.println("1) Descripcion");
                                            System.out.println("2) Nombre");
                                            System.out.println("3) Precio");
                                            System.out.println("4) Tipo");
                                            System.out.print("Ingrese la opcion: ");
                                            int opcionModificar = lectura.nextInt();
                                            
                                            switch (opcionModificar)
                                            {
                                                case 1:
                                                {
                                                    System.out.print("Ingrese la nueva descripcion: ");
                                                    lectura.nextLine();
                                                    String desc = lectura.nextLine();
                                                    
                                                    ((Productos)producto.get(pos)).setDescripcion(desc);
                                                } break;
                                                case 2:
                                                {
                                                    System.out.print("Ingrese el nuevo nombre: ");
                                                    String nombre = lectura.next();
                                                    
                                                    ((Productos)producto.get(pos)).setNombre(nombre);
                                                } break;
                                                case 3:
                                                {
                                                    System.out.print("Ingrese el nuevo precio: ");
                                                    double precio = lectura.nextDouble();
                                                    
                                                    ((Productos)producto.get(pos)).setPrecio(precio);
                                                } break;
                                                case 4:
                                                {
                                                    System.out.print("A que tipo desea cambiar?(1= Ropa, 2= Juguetes, 3= Comida): ");
                                                    int tipo = lectura.nextInt();
                                                    
                                                    switch (tipo)
                                                    {
                                                        case 1:
                                                        {
                                                            System.out.println("Que desea cambiar?");
                                                            System.out.println("1) Sexo");
                                                            System.out.println("2) Talla");
                                                            System.out.print("Ingrese la opcion: ");
                                                            int opcionRopa = lectura.nextInt();
                                                            
                                                            switch (opcionRopa)
                                                            {
                                                                case 1:
                                                                {
                                                                    System.out.print("Ingrese el nuevo sexo(M/F): ");
                                                                    char sexo = lectura.next().charAt(0);
                                                                    
                                                                    ((Ropa)producto.get(pos)).setTipoSexo(sexo);
                                                                } break;
                                                                case 2:
                                                                {
                                                                    System.out.print("Ingrese la nueva talla(S,M,L): ");
                                                                    char talla = lectura.next().charAt(0);
                                                                    
                                                                    ((Ropa)producto.get(pos)).setTalla(talla);
                                                                } break;
                                                            }
                                                        } break;
                                                        case 2:
                                                        {
                                                            System.out.println("Ingrese la nueva descripcion del juguete: ");
                                                            lectura.nextLine();
                                                            String desc = lectura.nextLine();
                                                            
                                                            ((Juguetes)producto.get(pos)).setDescripcionJuguete(desc);
                                                        } break;
                                                        case 3:
                                                        {
                                                            System.out.println("Que desea cambiar?");
                                                            System.out.println("1) Tipo de comida");
                                                            System.out.println("2) Fecha de caducidad");
                                                            System.out.print("Ingrese la opcion: ");
                                                            int opcionComida = lectura.nextInt();
                                                            
                                                            switch (opcionComida)
                                                            {
                                                                case 1:
                                                                {
                                                                    System.out.print("Ingrese el nuevo tipo de comida(1= Comida, 2= bebida): ");
                                                                    int tipoComida = lectura.nextInt();
                                                                    
                                                                    ((Comida)producto.get(pos)).setTipoComida(tipoComida);
                                                                } break;
                                                                case 2:
                                                                {
                                                                    System.out.print("Ingrese la nueva fecha de caducidad(dd/mm/yyyy): ");
                                                                    String fechaS = lectura.next();
                                                                    
                                                                    SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy");
                                                                    Date fecha = df.parse(fechaS);
                                                                    
                                                                    ((Comida)producto.get(pos)).setFechaCaducidad(fecha);
                                                                } break;
                                                            } //Fin de switch
                                                        } break;
                                                    } //Fin de switch
                                                } break;
                                            } //Fin de switch
                                        }
                                        else
                                        {
                                            System.out.println("Posicion ingresada fuera de rango");
                                        }
                                        
                                    } break;
                                    case 4:
                                    {
                                        String salida = "";
                    
                                        for (Object t : producto)
                                        {
                                            salida += producto.indexOf(t)+": "+t+"\n";
                                        }

                                        System.out.println(salida);
                                    } break;
                                } //Fin de switch
                            } break; //Fin de gestion de productos
                        } //Fin de switch
                    } //Fin de while
                } break;
            }// fin switch
        }// fin while        
    } // de metodo main
} // Fin de clase
