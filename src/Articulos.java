public class Articulos {
    private int id;
    private String nombre;
    private String codigoDeBarras;
    private double precio;
    private int existencia;

    // Constructor
    public Articulos(int id, String nombre, String codigoDeBarras, double precio, int existencia) {
        this.id = id;
        this.nombre = nombre;
        this.codigoDeBarras = codigoDeBarras;
        this.precio = precio;
        this.existencia = existencia;
    }

    // Getters y Setters
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

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(String codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    @Override
    public String toString() {
        return "Articulos{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", codigoDeBarras='" + codigoDeBarras + '\'' +
                ", precio=" + precio +
                ", existencia=" + existencia +
                '}';
    }
}
