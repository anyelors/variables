public class DetalleProducto {
    public static void main(String[] args) {

        System.out.println("***  Tienda Online (Detalle Producto)  ***");

        String nombreProducto = "Manzana";
        double precioProducto = 2.50;
        int cantidadProducto = 25;
        boolean esDisponible = true;

        StringBuilder producto = new StringBuilder();
        producto.append("Producto: " + nombreProducto);
        producto.append(System.getProperty("line.separator"));
        producto.append("Precio: " + precioProducto);
        producto.append(System.getProperty("line.separator"));
        producto.append("Cantidad: " + cantidadProducto);
        producto.append(System.getProperty("line.separator"));
        producto.append("Disponible: " + (esDisponible ? "Disponible" : "No Disponible"));
        producto.append(System.getProperty("line.separator"));

        System.out.println(producto);

        //Limpiar variable
        producto.setLength(0);

        nombreProducto = "Limon";
        precioProducto = 3.20;
        cantidadProducto = 0;
        esDisponible = false;

        producto.append("Producto: " + nombreProducto);
        producto.append(System.getProperty("line.separator"));
        producto.append("Precio: " + precioProducto);
        producto.append(System.getProperty("line.separator"));
        producto.append("Cantidad: " + cantidadProducto);
        producto.append(System.getProperty("line.separator"));
        producto.append("Disponible: " + (esDisponible ? "Disponible" : "No Disponible"));

        System.out.println(producto);

    }
}
