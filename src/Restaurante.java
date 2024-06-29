public class Restaurante extends Menu{

    private String nombreR;
    private String direccion;
    private String telefono;
    private Menu menu;

    public Restaurante(String nombreR, String direccion, String telefono) {
        super();
        this.nombreR = nombreR;
        this.direccion = direccion;
        this.telefono = telefono;
    }


    public void setNombreR(String nombre) {
        this.nombreR = nombre;
    }

    public String getNombreR() {
        return nombreR;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public Menu getMenu() {
        return menu;
    }
}
