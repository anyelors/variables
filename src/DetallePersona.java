public class DetallePersona {
    public static void main(String[] args) {
        String nombreCompleto = "Lupe Ramirez";
        int edad = 9;
        float altura = 1.35F;
        String paisOrigen = "Panamá";
        char estCivil = 'C';

        System.out.println("Nombre: " + nombreCompleto);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
        System.out.println("Pais de Origen: " + paisOrigen);
        System.out.println("Estado Civil: " + ((estCivil == 'C') ? "Casado" : "Soltero"));

    }
}
