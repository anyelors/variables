public class Cadenas {
    public static void main(String[] args) {
        System.out.println("*** Manejo de Cadenas en Java ***");
        var cadena1 = "Hola";
        System.out.println("cadena1 = " + cadena1);
        var cadena2 = new String("Mundo");
        System.out.println("cadena2 = " + cadena2);
        var cadena3 = cadena1 + " " + cadena2;
        System.out.println("cadena3 = " + cadena3);
        //Text block
        var cadena4 = """
                Este es un texto
                multiliena
                mas
                lineas
                """;
        System.out.println("cadena4 = " + cadena4);

        System.out.println();

        //Comparacion de cadenas
        var cadena11 = "Java";
        var cadena22 = "Java";
        var cadena33 = new String("Java"); //Nuevo objeto nueva referencia
        System.out.println("(==) compara la refencia que guarda la variable");
        System.out.println(cadena11 == cadena22);
        System.out.println(cadena11 == cadena33);
        System.out.println("(equals()) compara el valor que apunta la variable");
        System.out.println(cadena11.equals(cadena33));
    }
}
