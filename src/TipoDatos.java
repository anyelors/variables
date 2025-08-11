public class TipoDatos {
    public static void main(String[] args) {
        //Tipos de datos en java
        //Enteros valor por defecto (0)
        byte tipoByte = 127;
        System.out.println("Tipo byte: " + tipoByte);
        short tipoShort = 32000;
        System.out.println("Tipo short: " + tipoShort);
        //32 bits
        int tipoInt = 214748564;
        System.out.println("Tipo int: " + tipoInt);
        //64 bits
        long tipoLong = 2147485646767674789L;
        System.out.println("Tipo long: " + tipoLong);

        //Punto Flotante valor por defecto (0.0)
        //32 bits
        float tipoFloat = 3.14F;
        System.out.println("Tipo float: " + tipoFloat);
        //64 bits
        double tipoDouble = 3.1478564389067654323213435657787878D;
        System.out.println("Tipo double: " + tipoDouble);

        //Caracter valor por defecto ('\u0000')
        char tipoChar = 'A';
        System.out.println("Tipo char: " + tipoChar);
        tipoChar = 65;
        System.out.println("Tipo char: " + tipoChar);

        //Boleano Valor por defecto (false)
        boolean tipoBoolean = false;
        System.out.println("Tipo boolean: " + tipoBoolean);

        //Object o Tipo de referencia Valor por defecto (null)
        String nombre = null;
        System.out.println("Tipo String: " + nombre);
    }
}
