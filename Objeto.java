
public class Objeto {

    private int id;
    private String nombre;
    private String descripcion;
    private int cantidad;
    private String unidad;
    private double precio;

    public Objeto() {
        this.id = 0;
        this.nombre = "";
        this.descripcion = "";
        this.cantidad = 0;
        this.unidad = "";
        this.precio = 0;
    }

    public Objeto(String nombre, String descripcion, int cantidad, String unidad, double precio) {
        this.id = 0;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.unidad = unidad;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "[ " + id + " || " + nombre + " || " + descripcion + " || " + cantidad + " || " + unidad + " || " + precio +" ]";
    }
    
}