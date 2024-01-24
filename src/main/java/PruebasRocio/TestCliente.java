package PruebasRocio;

import java.util.Scanner;

public class TestCliente {
    private static Scanner teclado = new Scanner(System.in);
    private static Cliente[] clientesEmpresa = new Cliente[10];

    public static void main(String[] args) {

        int opc = 0;
        do {
            System.out.println("\n\t\tMENU OPCIONES");
            System.out.println("[1] -- Nuevo Cliente");
            System.out.println("[9] -- SALIR");
            System.out.print("Elija opcion: ");
            opc = Integer.parseInt(teclado.nextLine());

            switch(opc) {
                case 1:
                    nuevoCliente();
                    break;
                case 9:
                    System.out.println("\nFIN DE PROGRAMA");
                    break;
                default:
                    System.out.println("\nOpción inválida.");
            }

        }while(opc != 9);

    }

    private static void nuevoCliente() {
        //Pedimos datos para crear un CLiente
        System.out.print("\nDNI: ");
        String dni = teclado.nextLine();
        System.out.print("Nombre: ");
        String nombre = teclado.nextLine();
        System.out.print("Especialidad: ");
        String especi = teclado.nextLine();
        //Creamos Cliente
        Cliente nuevoCliente = new Cliente(dni, nombre, especi);
        //Buscamos posicion libre en el array
        int huecoLibre = -1;
        for (int i = 0; i < clientesEmpresa.length && huecoLibre == -1; i++) {
            if (clientesEmpresa[i] == null) //Hemos encontrado hueco libre
                huecoLibre = i; //Guardamos posicion libre, esto ademas pone fin al bucle
        }
        //Comprobamos si hemos encontrado hueco libre
        if (huecoLibre == -1)
            System.out.println("No hay espacio disponible para guardar el nuevo Cliente.");
        else {
            clientesEmpresa[huecoLibre] = nuevoCliente;
            System.out.println("Nuevo Cliente se ha guardado en la posición: " + huecoLibre);
        }
    }

}
