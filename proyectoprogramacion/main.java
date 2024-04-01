import java.util.Scanner;

class Nodo {
    int dato;
    Nodo siguiente;

    // Constructor
    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}

class ListaEnlazada {
    Nodo cabeza;

    // Constructor
    public ListaEnlazada() {
        this.cabeza = null;
    }

    // Método para insertar un nuevo nodo al inicio de la lista
    public void insertarAlInicio(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        nuevoNodo.siguiente = cabeza;
        cabeza = nuevoNodo;
    }

    // Método para insertar un nuevo nodo al final de la lista
    public void insertarAlFinal(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo temp = cabeza;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevoNodo;
        }
    }

    // Método para insertar un nuevo nodo en una posición específica
    public void insertarEnPosicion(int dato, int posicion) {
        if (posicion < 0) {
            System.out.println("Posición inválida");
            return;
        }
        if (posicion == 0) {
            insertarAlInicio(dato);
            return;
        }
        Nodo nuevoNodo = new Nodo(dato);
        Nodo temp = cabeza;
        for (int i = 0; temp != null && i < posicion - 1; i++) {
            temp = temp.siguiente;
        }
        if (temp == null) {
            System.out.println("Posición fuera de rango");
            return;
        }
        nuevoNodo.siguiente = temp.siguiente;
        temp.siguiente = nuevoNodo;
    }

    // Método para imprimir la lista
    public void imprimirLista() {
        Nodo temp = cabeza;
        while (temp != null) {
            System.out.print(temp.dato + " ");
            temp = temp.siguiente;
        }
        System.out.println();
    }
}

public class main  {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("Menú:");
            System.out.println("1. Insertar al inicio");
            System.out.println("2. Insertar al final");
            System.out.println("3. Insertar en posición");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el dato a insertar al inicio: ");
                    int datoInicio = scanner.nextInt();
                    lista.insertarAlInicio(datoInicio);
                    break;
                case 2:
                    System.out.print("Ingrese el dato a insertar al final: ");
                    int datoFinal = scanner.nextInt();
                    lista.insertarAlFinal(datoFinal);
                    break;
                case 3:
                    System.out.print("Ingrese el dato a insertar: ");
                    int datoPosicion = scanner.nextInt();
                    System.out.print("Ingrese la posición: ");
                    int posicion = scanner.nextInt();
                    lista.insertarEnPosicion(datoPosicion, posicion);
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
            
            System.out.println("Lista actual:");
            lista.imprimirLista();
            System.out.println();
        } while (opcion != 4);
        
        scanner.close();
    }
}