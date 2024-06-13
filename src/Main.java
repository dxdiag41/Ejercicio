import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Bodega<Articulos> bodega = new Bodega<>();

    public static void main(String[] args) {
        mostrarMenu();
    }

    private static void mostrarMenu() {
        boolean salir = false;
        while (!salir) {
            System.out.println("\nMenu:");
            System.out.println("1. Agregar nuevo artículo");
            System.out.println("2. Editar datos de artículo");
            System.out.println("3. Buscar un artículo por código de barras");
            System.out.println("4. Eliminar artículo");
            System.out.println("5. Buscar artículos por nombre");
            System.out.println("6. Mostrar lista de artículos disponibles");
            System.out.println("7. Buscar por ID");
            System.out.println("8. Salir");
            System.out.print("Elija una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir el salto de línea
            switch (opcion) {
                case 1:
                    agregarArticuloSolicitado();
                    break;
                case 2:
                    editarArticuloSolicitado();
                    break;
                case 3:
                    buscarArticuloPorCodigoSolicitado();
                    break;
                case 4:
                    eliminarArticuloSolicitado();
                    break;
                case 5:
                    buscarArticuloPorNombreSolicitado();
                    break;
                case 6:
                    mostrarInventario();
                    break;
                case 7:
                    buscarArticuloPorIdSolicitado();
                    break;
                case 8:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción del 1 al 8.");
            }
        }
    }

    private static void agregarArticuloSolicitado() {
        System.out.print("Ingrese ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consumir el salto de línea
        System.out.print("Ingrese nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese código de barras: ");
        String codigoDeBarras = scanner.nextLine();
        System.out.print("Ingrese precio: ");
        double precio = scanner.nextDouble();
        System.out.print("Ingrese existencia: ");
        int existencia = scanner.nextInt();
        scanner.nextLine();  // Consumir el salto de línea

        Articulos articulo = new Articulos(id, nombre, codigoDeBarras, precio, existencia);
        bodega.agregarArticulo(articulo);
    }

    private static void editarArticuloSolicitado() {
        System.out.print("Ingrese ID del artículo a editar: ");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consumir el salto de línea
        System.out.print("Ingrese nuevo nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese nuevo código de barras: ");
        String codigoDeBarras = scanner.nextLine();
        System.out.print("Ingrese nuevo precio: ");
        double precio = scanner.nextDouble();
        System.out.print("Ingrese nueva existencia: ");
        int existencia = scanner.nextInt();
        scanner.nextLine();  // Consumir el salto de línea

        bodega.editarArticulo(id, nombre, codigoDeBarras, precio, existencia);
    }

    private static void buscarArticuloPorCodigoSolicitado() {
        System.out.print("Ingrese código de barras: ");
        String codigoDeBarras = scanner.nextLine();
        Articulos articulo = bodega.buscarArticuloPorCodigo(codigoDeBarras);
        if (articulo != null) {
            System.out.println(articulo);
        } else {
            System.out.println("Artículo no encontrado.");
        }
    }

    private static void eliminarArticuloSolicitado() {
        System.out.print("Ingrese código de barras del artículo a eliminar: ");
        String codigoDeBarras = scanner.nextLine();
        boolean eliminado = bodega.eliminarArticulo(codigoDeBarras);
        if (eliminado) {
            System.out.println("Artículo eliminado correctamente.");
        } else {
            System.out.println("Artículo no encontrado.");
        }
    }

    private static void buscarArticuloPorNombreSolicitado() {
        System.out.print("Ingrese nombre del artículo: ");
        String nombreArticulo = scanner.nextLine();
        Articulos articulo = bodega.buscarArticuloPorNombre(nombreArticulo);
        if (articulo != null) {
            System.out.println(articulo);
        } else {
            System.out.println("Artículo no encontrado.");
        }
    }

    private static void mostrarInventario() {
        System.out.println("\nInventario:");
        for (Articulos articulo : bodega.mostrarInventario()) {
            if(articulo.getExistencia()>0)
                System.out.println(articulo);
        }
    }

    private static void buscarArticuloPorIdSolicitado() {
        System.out.print("Ingrese ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consumir el salto de línea
        Articulos articulo = bodega.buscarArticuloPorId(id);
        if (articulo != null) {
            System.out.println(articulo);
        } else {
            System.out.println("Artículo no encontrado.");
        }
    }
}
