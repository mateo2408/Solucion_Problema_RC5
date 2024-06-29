public class Plato {
    private String nombre;
    private double precio;
    private int platoID;

    public Plato(String nombre, double precio, int platoID) {
        this.nombre = nombre;
        this.precio = precio;
        this.platoID = platoID;
    }

    public void setPlatoID(int platoID) {
        this.platoID = platoID;
    }

    public int getPlatoID() {
        return platoID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void actualizarPrecio(double precio) {
        this.precio = precio;
    }

    public void mostrarPlato() {
        System.out.println("Plato: " + nombre + " Precio: " + precio);
    }
}
