import java.util.ArrayList;

public class Bodega<T extends Articulos> {
    private ArrayList<T> inventario;

    public Bodega() {
        inventario = new ArrayList<>();
    }

    public void agregarArticulo(T articulo) {
        inventario.add(articulo);
        System.out.println("Artículo agregado correctamente.");
    }

    public void editarArticulo(int id, String nombre, String codigoDeBarras, double precio, int existencia) {
        for (T articulo : inventario) {
            if (articulo.getId() == id) {
                articulo.setNombre(nombre);
                articulo.setCodigoDeBarras(codigoDeBarras);
                articulo.setPrecio(precio);
                articulo.setExistencia(existencia);
                System.out.println("Artículo actualizado correctamente.");
                return;
            }
        }
        System.out.println("Artículo no encontrado.");
    }

    public T buscarArticuloPorCodigo(String codigoDeBarras) {
        for (T articulo : inventario) {
            if (articulo.getCodigoDeBarras().equals(codigoDeBarras)) {
                return articulo;
            }
        }
        return null;
    }

    public boolean eliminarArticulo(String codigoDeBarras) {
        for (T articulo : inventario) {
            if (articulo.getCodigoDeBarras().equals(codigoDeBarras)) {
                inventario.remove(articulo);
                return true;
            }
        }
        return false;
    }

    public T buscarArticuloPorNombre(String nombreArticulo) {
        for (T articulo : inventario) {
            if (articulo.getNombre().equals(nombreArticulo)) {
                return articulo;
            }
        }
        return null;
    }

    public ArrayList<T> mostrarInventario() {
        return inventario;
    }

    public T buscarArticuloPorId(int id) {
        for (T articulo : inventario) {
            if (articulo.getId() == id) {
                return articulo;
            }
        }
        return null;
    }
}
