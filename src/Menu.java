import java.util.List;

public class Menu extends Plato{


    public Menu(String nombre, double precio, int platoID) {
        super(nombre, precio, platoID);
    }

    List<Plato> platos;

    public void agregarPlato(Plato plato) {
        platos.add(plato);
    }

    public void eliminarPlato(Plato plato) {
        platos.remove(plato);
    }

    public void modificarPrecioPlato(Plato plato, double precio) {
        plato.actualizarPrecio(precio);
    }

    public void mostrarMenu() {
        for (Plato plato : platos) {
            plato.mostrarPlato();
        }
    }

    public void mostrarPrecioTotal() {
        double precioTotal = 0;
        for (Plato plato : platos) {
            precioTotal += plato.getPrecio();
        }
        System.out.println("Precio total: " + precioTotal);
    }
}
