public class IndicesCadena {
    public static void main(String[] args) {
        // Manejo de indices en una cadena
        var cadena1 = "Hola Mundo";
        System.out.println("cadena1 = " + cadena1);
        var primerCaracter = cadena1.charAt(0);
        System.out.println("primerCaracter = " + primerCaracter);
        var ultimoCaracter = cadena1.charAt(cadena1.length()-1);
        System.out.println("ultimoCaracter = " + ultimoCaracter);

        System.out.println();

        //Inmutabilidad de Cadenas
        var cadena = "Hola";
        System.out.println("cadena = " + cadena);
        cadena = "Adios";
        System.out.println("cadena = " + cadena);
    }
}
