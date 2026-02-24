import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException {
        int id = 0;
        String nombre = "";
        String email = "";
        // Usuario u1 = new Usuario(1,"Daniel","djromer@gmail.com");

        // System.out.println(u1);
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            mostrarMenu();
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1: 
                System.out.print("ID: ");
                id = sc.nextInt();
                sc.nextLine();
                System.out.print("Nombre: ");
                nombre = sc.nextLine();
                System.out.print("Email: ");
                email = sc.nextLine();
                CRUDArchivo.crearUsuario(new Usuario(id, nombre, email));
                    break;
                case 2: 
                System.out.println(CRUDArchivo.leerUsuarios());
                    break;
                case 3:
                System.out.print("ID: ");
                id = sc.nextInt();
                sc.nextLine();
                System.out.print("Nombre: ");
                nombre = sc.nextLine();
                System.out.print("Email: ");
                email = sc.nextLine();
                CRUDArchivo.actualizarUsuario(id, nombre, email);
                    break;
                case 4:
                System.out.print("ID: ");
                id = sc.nextInt();
                sc.nextLine();
                CRUDArchivo.eliminarUsuario(id);
                    break;
                case 5:
                    System.out.println("Saliendo del programa");
                    break;
                default: 
                    System.out.println("Opción inválida.");
            }
            System.out.println();
        } while (opcion != 5);

        sc.close();
    }

    static void mostrarMenu() {
        System.out.println("1. Crear archivo");
        System.out.println("2. Leer archivo");
        System.out.println("3. Actualizar archivo");
        System.out.println("4. Eliminar en el archivo");
        System.out.println("5. Salir");
    }

}
