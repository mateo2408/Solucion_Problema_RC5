import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Bienvenido a nuestro restaurante");
        System.out.println("Ingrese la opcion que desea realizar");
        Scanner sc = new Scanner(System.in);
        System.out.print("1. Informacion del Restaurante");
        System.out.println("2. Crear un plato");
        System.out.println("3. Ver Menu");
        System.out.println("4. Modificar Precio de un plato");
        System.out.println("5. Eliminar un plato");
        System.out.println("6. Salir");
        int opcion = sc.nextInt();
        Restaurante restaurante = null; // Initialize restaurante
        do {
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese el nombre del restaurante");
                    String nombreR = sc.next();
                    System.out.println("Ingrese la direccion del restaurante");
                    String direccion = sc.next();
                    System.out.println("Ingrese el telefono del restaurante");
                    String telefono = sc.next();
                    restaurante = new Restaurante(nombreR, direccion, telefono); // Assuming Restaurante constructor accepts three Strings
                    System.out.println("Nombre del restaurante: " + restaurante.getNombreR());
                    System.out.println("Direccion del restaurante: " + restaurante.getDireccion());
                    System.out.println("Telefono del restaurante: " + restaurante.getTelefono());
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del plato");
                    String nombre = sc.next();
                    System.out.println("Ingrese el precio del plato");
                    double precioPlato = sc.nextDouble(); // Rename variable
                    System.out.println("Ingrese el ID del plato");
                    int platoID1 = sc.nextInt(); // Rename variable
                    Plato plato = new Plato(nombre, precioPlato, platoID1);
                    break;
                case 3:
                    System.out.println("Menu del restaurante");
                    restaurante.getMenu().mostrarMenu();
                    break;
                case 4:
                    System.out.println("Ingrese el ID del plato que desea modificar");
                    int platoID2 = sc.nextInt(); // Rename variable
                    System.out.println("Ingrese el nuevo precio del plato");
                    double precioNuevo = sc.nextDouble(); // Rename variable
                    restaurante.getMenu().modificarPrecioPlato(platoID2, precioNuevo);
                    break;
                case 5:
                    System.out.println("Ingrese el ID del plato que desea eliminar");
                    int platoID3 = sc.nextInt(); // Rename variable
                    restaurante.getMenu().eliminarPlato(platoID3);
                    break;
                case 6:
                    System.out.println("Gracias por visitar nuestro restaurante");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }while (opcion != 6);
    }
}