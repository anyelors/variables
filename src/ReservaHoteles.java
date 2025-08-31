import java.util.Scanner;

public class ReservaHoteles {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Reserva de Hoteles ***");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nombre de Cliente: ");
        var nombreCliente = scanner.next();
        System.out.println("Apellido de Cliente: ");
        var apellidoCliente = scanner.next();
        System.out.println("Dias de Estancia: ");
        var estancia = scanner.nextInt();
        System.out.println("Tarifa Diaria: ");
        var tarifaDiaria = scanner.nextDouble();
        System.out.println("Vista al Mar: ");
        var vistaMar = scanner.next();

        System.out.println("Reserva a nombre: " + nombreCliente + " " + apellidoCliente);
        System.out.println("Estancia de: " + estancia + " días");
        System.out.println("Tarifa por día: " + tarifaDiaria);
        System.out.println("Con vista al mar: " + vistaMar);

        scanner.close();
        System.out.println("\n");

        nombreCliente = "Pepa";
        apellidoCliente = "Pig";
        estancia = 8;
        tarifaDiaria = 100.20;
        vistaMar = "No";

        System.out.println("Reserva a nombre: " + nombreCliente + " " + apellidoCliente);
        System.out.println("Estancia de: " + estancia + " días");
        System.out.println("Tarifa por día: " + tarifaDiaria);
        System.out.println("Con vista al mar: " + vistaMar);


    }
}
