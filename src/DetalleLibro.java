public class DetalleLibro {
    public static void main(String[] args) {
        String tituloLibro = "El Señor de los Anillos";
        int anioPublicacion = 1954;
        boolean disponible = true;
        double precio = 500.50;

        StringBuilder libro = new StringBuilder();
        libro.append("Libro: " + tituloLibro);
        libro.append(System.getProperty("line.separator"));
        libro.append("Año: " + anioPublicacion);
        libro.append(System.getProperty("line.separator"));
        libro.append("Disponible: " + (disponible ? "Si" : "No"));
        libro.append(System.getProperty("line.separator"));
        libro.append("Precio: " + precio);

        System.out.println(libro);

    }
}
