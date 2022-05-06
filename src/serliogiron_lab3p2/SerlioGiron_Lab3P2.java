/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serliogiron_lab3p2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class SerlioGiron_Lab3P2 {
static Scanner lea = new Scanner(System.in);
static ArrayList <Residencial> residenciales = new ArrayList();
static ArrayList <Cliente> clientes = new ArrayList();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion = 100;
        
        while (opcion != 0) 
        {
            System.out.println("");
            System.out.println("0) Salir");
            System.out.println("1) Crear Residencial");
            System.out.println("2) Crear Cliente");
            System.out.println("3) Eliminar Cliente");
            System.out.println("4) Listar Clientes");
            System.out.println("5) Crompar Bien");
            System.out.println("6) Crear Casa");
            System.out.println("7) Crear Edificio");
            System.out.println("8) Crear Apartamento");
            System.out.println("9) Listar Casas en residencial");
            System.out.println("10) Listar Edificios en residencial");
            System.out.println("11) Listar Apartamentos en residencial");
            System.out.println("12) Listar residenciales");
            System.out.println("13) Eliminar residenciales");
            System.out.println("");
            System.out.print("Ingrese una opcion: ");
            opcion = lea.nextInt();
            
            switch(opcion)
            {
                case 1:
                {
                    System.out.println("");
                    lea.nextLine();
                    System.out.print("Ingrese el nombre de la residencial: ");
                    String nombre = lea.nextLine();
                    
                    Residencial R = new Residencial(nombre);
                    residenciales.add(R);
                    break;
                }
                
                case 2:
                {
//                    String nombre;
//                    int edad;
//                    String id;
//                    String usario;
//                    String contra;
//                    ArrayList <BienesInmuebles> bienes = new ArrayList();
                    
                    lea.nextLine();
                    System.out.print("Nombre del cliente: ");
                    String nombre = lea.nextLine();
                    System.out.println("nombre: " + nombre);
                    
                    System.out.print("Edad: ");
                    int edad = lea.nextInt();
                    System.out.println("edad: " + edad);
                    
                    System.out.print("ID: ");
                    String id = lea.next();
                    System.out.println("id: " + id);
                    
                    System.out.print("usuario: ");
                    String usuario = lea.next();
                    System.out.println("ususario: " + usuario);
                    
                    //lea.nextLine();
                    System.out.print("Contraseña: ");
                    String contra = lea.next();
                    System.out.println("contra: " + contra);
                    
                    Cliente temporal = new Cliente(nombre, edad, id, usuario, contra);
                    clientes.add(temporal);
                    break;
                }
                
                case 3:
                {
                    if (clientes.isEmpty()) 
                    {
                        System.out.println("no hay clientes");
                    }
                    else
                    {
                        System.out.println("--- CLIENTES ---");
                        for (int i = 0; i < clientes.size(); i++) 
                        {
                            System.out.println(i + ") " + clientes.get(i));
                        }
                        System.out.print("Ingrese la posicion del cliente que quiere eliminar: ");
                        int posicioneliminar = lea.nextInt();

                        if (posicioneliminar > clientes.size()) {
                            System.out.println("ese cliente no existe");
                        }else{
                            clientes.remove(posicioneliminar);
                        }
                    }
                    break;
                }
                
                case 4:
                {
                    if (clientes.isEmpty()) {
                        System.out.println("no hay clientes");
                    }else{
                        System.out.println("--- CLIENTES ---");
                        for (int i = 0; i < clientes.size(); i++) {
                            System.out.println(i + ") " + clientes.get(i));
                        }
                    }
                    break;
                }
                
                case 5:
                {
                    if (clientes.isEmpty()) 
                    {
                        System.out.println("no hay clientes");
                    }
                    else
                    {
                        System.out.println("--- CLIENTES ---");
                        for (int i = 0; i < clientes.size(); i++) 
                        {
                            System.out.println(i + ") " + clientes.get(i));
                        }
                        
                        System.out.print("Que cliente es usted?: ");
                        int posicioncliente = lea.nextInt();


                        System.out.print("usuario: ");
                        String usuario = lea.next();
                        System.out.println("ususario: " + usuario);

                        System.out.print("Contraseña: ");
                        String contra = lea.next();
                        System.out.println("contra: " + contra);

                        if (clientes.get(posicioncliente).getUsario().equals(usuario) && clientes.get(posicioncliente).getContra().equals(contra)) 
                        {
                            System.out.println("--- RESIDENCIALES ---");
                            if (residenciales.isEmpty()) 
                            {
                                System.out.println("No hay residenciales");
                            }
                            else
                            {
                                for (int i = 0; i < residenciales.size(); i++) 
                                {
                                    System.out.println(i + ") " + residenciales.get(i));
                                }
                                
                                System.out.print("Ingrese en que residencial desea comparar la casa o el apartamento: ");
                                int posicionresidencial = lea.nextInt();

                                int op = 100;
                                while (op!=0) 
                                {                            
                                    System.out.println("0) Salir");
                                    System.out.println("1) Casa");
                                    System.out.println("2) Edificio");
                                    System.out.println("3) Apartamento");
                                    System.out.print("Ingrese una opcion: ");
                                    op = lea.nextInt();
                                    
                                    switch(op)
                                    {
                                        case 1:
                                        {
                                            System.out.println("--- CASAS en " + residenciales.get(posicionresidencial).getNombre() +" ---");

                                            if (residenciales.get(posicionresidencial).getCasas().isEmpty()) 
                                            {
                                                System.out.println("No hay casas");
                                            }
                                            else
                                            {
                                                for (int i = 0; i < residenciales.get(posicionresidencial).getCasas().size(); i++) 
                                                {
                                                    System.out.println(i + ") " + residenciales.get(posicionresidencial).getCasas().get(i));
                                                }
                                            }

                                            System.out.print("Ingrese la casa que desea comprar: ");
                                            int compra = lea.nextInt();

                                            Casa buying = new Casa();

                                            buying = residenciales.get(posicionresidencial).getCasas().get(compra);
                                            residenciales.get(posicionresidencial).getCasas().remove(compra);

                                            clientes.get(posicioncliente).getBienes().add(buying);
                                            break;
                                        }
                                        case 2:
                                        {
                                            System.out.println("--- EDIFICIOS en "+ residenciales.get(posicionresidencial).getNombre() +"---");

                                            if (residenciales.get(posicionresidencial).getEdificios().isEmpty()) 
                                            {
                                                System.out.println("En esta residencial no hay edificios");
                                            }
                                            else
                                            {
                                                for (int i = 0; i < residenciales.get(posicionresidencial).getEdificios().size(); i++) 
                                                {
                                                    System.out.println(i + ") " + residenciales.get(posicionresidencial).getEdificios().get(i));
                                                }

                                                System.out.print("que edificio desea comprar?: ");
                                                int indice = lea.nextInt();

                                                Edificio buying = new Edificio();

                                                buying = residenciales.get(posicionresidencial).getEdificios().get(indice);
                                                residenciales.get(posicionresidencial).getEdificios().remove(indice);

                                                clientes.get(posicioncliente).getBienes().add(buying);
                                            }
                                            break;
                                        }
                                        case 3:
                                        {
                                            System.out.println("--- EDIFICIOS en "+ residenciales.get(posicionresidencial).getNombre() +"---");

                                            if (residenciales.get(posicionresidencial).getEdificios().isEmpty()) 
                                            {
                                                System.out.println("En esta residencial no hay edificios");
                                            }
                                            else
                                            {
                                                for (int i = 0; i < residenciales.get(posicionresidencial).getEdificios().size(); i++) 
                                                {
                                                    System.out.println(i + ") " + residenciales.get(posicionresidencial).getEdificios().get(i));
                                                }

                                                System.out.print("en que edificio esta el apartamento que desea comprar?: ");
                                                int indice = lea.nextInt();

                                                System.out.println("--- Apartamentos en " + residenciales.get(posicionresidencial).getEdificios().get(indice).getNombre());

                                                for (int i = 0; i < residenciales.get(posicionresidencial).getEdificios().get(indice).getApartamentos().size(); i++) 
                                                {
                                                    System.out.println(i + ")" + residenciales.get(indice).getEdificios().get(indice).getApartamentos().get(i));
                                                }

                                                System.out.print("En que posicion esta el apartamento que desea comprar?: ");
                                                int posicionapartamento = lea.nextInt();

                                                Apartamento temporal = new Apartamento();
                                                temporal = residenciales.get(posicionresidencial).getEdificios().get(indice).getApartamentos().get(posicionapartamento);
                                                residenciales.get(posicionresidencial).getEdificios().get(indice).getApartamentos().remove(posicionapartamento);
                                                clientes.get(posicioncliente).getBienes().add(temporal);

                                            }
                                            break;
                                        }//fin case 3
                                    }//fin del switch
                                }
                            }
                        }
                        else
                        {
                            System.out.println("contraseña o usuario incorrecto, vuelva a intentarlo");
                        }
                    }
                    
                }
                
                case 6:
                {
                    //CREAR CASA
                    //crear casa
                    
                    System.out.println("--- RESIDENCIALES ---");
                    if (residenciales.isEmpty()) 
                    {
                        System.out.println("No hay residenciales");
                    }
                    else
                    {
                        for (int i = 0; i < residenciales.size(); i++) 
                        {
                            System.out.println(i + ") " + residenciales.get(i));
                        }
                        
                        System.out.print("Ingrese en que residencial desea agregar la casa: ");
                        int posicionresidencial = lea.nextInt();

                        System.out.println("");
                        lea.nextLine();
                        System.out.print("Ingrese la direccion: ");
                        String direccion = lea.nextLine();
                        System.out.println("direccion: " + direccion);

                        System.out.print("Ingrese las dimensiones del terreno: ");
                        String dimension = lea.next();
                        System.out.println("dimension: " + dimension);

                        System.out.print("ID del bien: ");
                        String id = lea.next();
                        System.out.println("ID: " + id);

                        System.out.print("Ingrese el numero de Casa: ");
                        int numero = lea.nextInt();
                        System.out.println("numero de casa: " + numero);

                        Casa temporal = new Casa(numero, direccion, dimension, id, residenciales.get(posicionresidencial));
                        System.out.println("Casa: " + temporal);
                        residenciales.get(posicionresidencial).getCasas().add(temporal);
                    }
                    break;
                }//fin case 6
                case 7:
                {
                    System.out.println("--- RESIDENCIALES ---");
                    if (residenciales.isEmpty()) 
                    {
                        System.out.println("No hay residenciales");
                    }
                    else
                    {
                        for (int i = 0; i < residenciales.size(); i++) 
                        {
                            System.out.println(i + ") " + residenciales.get(i));
                        }
                        
                        
                        System.out.print("Ingrese en que residencial desea agregar el edificio: ");
                        int posicionresidencial = lea.nextInt();

                        lea.nextLine();
                        System.out.print("Ingrese la direccion: ");
                        String direccion = lea.nextLine();
                        System.out.println("direccion: " + direccion);

                        System.out.print("Ingrese las dimensiones del terreno: ");
                        String dimension = lea.next();
                        System.out.println("dimension: " + dimension);

                        System.out.print("ID del bien: ");
                        String id = lea.next();
                        System.out.println("ID: " + id);

                        System.out.print("Ingrese la cantidad de locales en el edificio: ");
                        int cantidad = lea.nextInt();
                        System.out.println("cantidad de locales: " + cantidad);

                        lea.nextLine();
                        System.out.print("Ingrese el nombre del edificio: ");
                        String edificio = lea.nextLine();
                        System.out.println("nombre del edificio: " + edificio);

                        //int cantidad_locales, String nombre, String direccion, String dimension_terreno, String id, Residencial residencial
                        Edificio temporal = new Edificio(cantidad, edificio, direccion, dimension, id, residenciales.get(posicionresidencial));
                        residenciales.get(posicionresidencial).getEdificios().add(temporal);
                    }
                    break;
                }// fin case 7
                case 8:
                {
                    System.out.println("");
                    lea.nextLine();
                    System.out.print("Ingrese la direccion: ");
                    String direccion = lea.nextLine();
                    System.out.println("direccion: " + direccion);

                    System.out.print("Ingrese las dimensiones del terreno: ");
                    String dimension = lea.next();
                    System.out.println("dimension: " + dimension);

                    System.out.print("ID del bien: ");
                    String id = lea.next();
                    System.out.println("ID: " + id);

                    System.out.print("Numero del local: ");
                    int numerolocal = lea.nextInt();
                    
                    System.out.println("");
                    System.out.println("--- RESIDENCIALES ---");
                    if (residenciales.isEmpty()) 
                    {
                        System.out.println("No hay residenciales");
                    }
                    else
                    {
                        for (int i = 0; i < residenciales.size(); i++) 
                        {
                            System.out.println(i + ") " + residenciales.get(i));
                        }
                        
                        System.out.print("Ingrese en que residencial desea agregar el edificio: ");
                        int posicionresidencial = lea.nextInt();

                        System.out.println("--- EDIFICIOS en "+ residenciales.get(posicionresidencial).getNombre() +"---");

                        if (residenciales.get(posicionresidencial).getEdificios().isEmpty()) 
                        {
                            System.out.println("En esta residencial no hay edificios");
                        }
                        else
                        {
                            for (int i = 0; i < residenciales.get(posicionresidencial).getEdificios().size(); i++) 
                            {
                                System.out.println(i + ") " + residenciales.get(posicionresidencial).getEdificios().get(i));
                            }

                            System.out.print("A que edificio desea agregar este apartamento?: ");
                            int indice = lea.nextInt();

                            if (indice > residenciales.get(posicionresidencial).getEdificios().size()) 
                            {
                                System.out.println("No hay edificios en esa posicion");
                            }
                            else
                            {
                                //int numero_local, Edificio edificio, String direccion, String dimension_terreno, String id, Residencial residencial
                                Apartamento temporal = new Apartamento(numerolocal, residenciales.get(posicionresidencial).getEdificios().get(indice), direccion, dimension, id, residenciales.get(posicionresidencial));
                                residenciales.get(posicionresidencial).getEdificios().get(indice).getApartamentos().add(temporal);
                                System.out.println("Apartamento: " + temporal);

                                System.out.println("--- Apartamentos en Edificio " + residenciales.get(posicionresidencial).getEdificios().get(indice).getNombre());
                                for (int i = 0; i < residenciales.get(posicionresidencial).getEdificios().get(indice).getApartamentos().size(); i++) 
                                {
                                    System.out.println(i + ") " + residenciales.get(posicionresidencial).getEdificios().get(indice).getApartamentos().get(i));
                                }
                            }
                        }
                    }
                    break;
                }// fin case 8
                
                case 9:
                {
                    System.out.println("");
                    System.out.println("--- RESIDENCIALES ---");
                    if (residenciales.isEmpty()) 
                    {
                        System.out.println("No hay residenciales");
                    }
                    else
                    {
                        for (int i = 0; i < residenciales.size(); i++) 
                        {
                            System.out.println(i + ") " + residenciales.get(i));
                        }
                        
                        System.out.print("Ingrese en que residencial estan las casas que quiere ver: ");
                        int posicionresidencial = lea.nextInt();

                        System.out.println("--- CASAS en " + residenciales.get(posicionresidencial).getNombre() +" ---");

                        if (residenciales.get(posicionresidencial).getCasas().isEmpty()) 
                        {
                            System.out.println("No hay casas");
                        }
                        else
                        {
                            for (int i = 0; i < residenciales.get(posicionresidencial).getCasas().size(); i++) 
                            {
                                System.out.println(i + ") " + residenciales.get(posicionresidencial).getCasas().get(i));
                            }
                        }
                    }
                    break;
                }//fin case 9
                case 10:
                {
                    System.out.println("");
                    System.out.println("--- RESIDENCIALES ---");
                    if (residenciales.isEmpty()) 
                    {
                        System.out.println("No hay residenciales");
                    }
                    else
                    {
                        for (int i = 0; i < residenciales.size(); i++) 
                        {
                            System.out.println(i + ") " + residenciales.get(i));
                        }
                        
                        System.out.print("Ingrese en que residencial estan los edificios que quiere ver: ");
                        int posicionresidencial = lea.nextInt();

                        //listar edificios
                        System.out.println("--- EDIFICIOS en " + residenciales.get(posicionresidencial).getNombre() +" ---");

                        if (residenciales.get(posicionresidencial).getEdificios().isEmpty()) 
                        {
                            System.out.println("No hay edificios");
                        }
                        else
                        {
                            for (int i = 0; i < residenciales.get(posicionresidencial).getEdificios().size(); i++) 
                            {
                                System.out.println(i + ") " + residenciales.get(posicionresidencial).getEdificios().get(i));
                            }
                        }
                    }//fin else case 10
                    break;
                }//fin case 10
                case 11:
                {
                    System.out.println("");
                    System.out.println("--- RESIDENCIALES ---");
                    if (residenciales.isEmpty()) 
                    {
                        System.out.println("No hay residenciales");
                    }
                    else
                    {
                        for (int i = 0; i < residenciales.size(); i++) 
                        {
                            System.out.println(i + ") " + residenciales.get(i));
                        }
                        
                        System.out.print("Ingrese en que residencial estan los apartamentos que quiere ver: ");
                        int posicionresidencial = lea.nextInt();

                        System.out.println("--- APARTAMNTOS en " + residenciales.get(posicionresidencial).getNombre() + " ---");
                        for (int i = 0; i < residenciales.get(posicionresidencial).getEdificios().size(); i++) 
                        {
                            System.out.println("");
                            System.out.println("Edificio #" + (i+1));

                            if (residenciales.get(posicionresidencial).getEdificios().get(i).getApartamentos().isEmpty()) 
                            {
                                System.out.println("Este edificio no tiene apartamentos");
                            }
                            else
                            {
                                for (int j = 0; j < residenciales.get(posicionresidencial).getEdificios().get(i).getApartamentos().size(); j++) 
                                {
                                    System.out.println(i + ") " + residenciales.get(posicionresidencial).getEdificios().get(i).getApartamentos().get(j));
                                }
                            }
                        }
                    }
                    break;
                }// fin case 11
                case 12:
                {
                    if (residenciales.isEmpty()) {
                        System.out.println("no hay residenciales");
                    }else{
                        System.out.println("--- RESIDENCIALES ---");
                        
                        for (int i = 0; i < residenciales.size(); i++) {
                            System.out.println(i + ") " + residenciales.get(i));
                        }
                    }
                    break;
                }//fin case 12 listar residenciales
                
                case 13:
                {
                    if (residenciales.isEmpty()) {
                        System.out.println("no hay residenciales");
                    }else{
                        System.out.println("--- RESIDENCIALES ---");
                        
                        for (int i = 0; i < residenciales.size(); i++) {
                            System.out.println(i + ") " + residenciales.get(i));
                        }
                        
                        System.out.print("Ingrese el numero de la residencial que desea eliminar: ");
                        int borrar = lea.nextInt();
                        residenciales.remove(borrar);
                    }
                    break;
                }
            }
        }//fin while grande
    }
    
}
