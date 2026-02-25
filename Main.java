import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException {
        try (Scanner sc = new Scanner(System.in)) {
            int opcion;
            do {
                mostrarMenu();
                System.out.print("Seleccione una opcion: ");
                opcion = sc.nextInt();
                sc.nextLine();
                switch (opcion) {
                    case 1: {
                        System.out.print("ID: ");
                        int id_cliente = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Nombre: ");
                        String nombre = sc.nextLine();
                        System.out.print("Apellido: ");
                        String apellido = sc.nextLine();
                        System.out.print("Telefono: ");
                        int telefono = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Estado (true/false): ");
                        boolean estado = sc.nextBoolean();
                        CRUDArchivo.RegistrarCliente(new Cliente(id_cliente, nombre, apellido, telefono, estado));
                        break;
                    }
                    case 2: {
                        var clientes = CRUDArchivo.ListarClientes(null);
                        for (Cliente c : clientes) {
                            System.out.println(c);
                        }
                        break;
                    }
                    case 3: {
                        System.out.print("ID: ");
                        int id_cliente = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Nombre: ");
                        String nombre = sc.nextLine();
                        System.out.print("Apellido: ");
                        String apellido = sc.nextLine();
                        System.out.print("Telefono: ");
                        int telefono = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Estado (true/false): ");
                        boolean estado = sc.nextBoolean();
                        CRUDArchivo.actualizarCliente(id_cliente, nombre, apellido, telefono, estado);
                        break;
                    }
                    case 4: {
                        System.out.print("ID: ");
                        int id_cliente = sc.nextInt();
                        sc.nextLine();
                        CRUDArchivo.eliminarCliente(id_cliente);
                        break;
                    }
                    case 5:
                        System.out.println("Saliendo del programa");
                        break;
                    default: 
                        System.out.println("Opción inválida.");
                }
                System.out.println();
            } while (opcion != 5);
        }
    }

    static void mostrarMenu() {
        System.out.println("1. Crear archivo");
        System.out.println("2. Leer archivo");
        System.out.println("3. Actualizar archivo");
        System.out.println("4. Eliminar en el archivo");
        System.out.println("5. Salir");
    }

}
