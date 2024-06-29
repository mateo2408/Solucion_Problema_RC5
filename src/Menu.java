import java.util.List;

public class Menu extends Plato{

    public Menu(){
        super("",0,0);
    }


    public Menu(String nombre, double precio, int platoID) {
        super(nombre, precio, platoID);
    }

    List<Plato> platos;

    public void agregarPlato(Plato plato) {
        platos.add(plato);
    }

    public void eliminarPlato(int plato) {
        platos.remove(plato);
    }

    public void modificarPrecioPlato(int platoID, double precio) {
        for (Plato plato : platos){
            if(plato.getPlatoID() == platoID){
                plato.actualizarPrecio(precio);
                break;
            }
        }
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
