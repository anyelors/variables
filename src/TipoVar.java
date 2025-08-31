public class TipoVar {
    public static void main(String[] args) {
        System.out.println("*** Uso de Var en Java ***");
        
        String nombre1 = "Pepa";
        System.out.println("nombre1 = " + nombre1);
        
        var nombre2 = "Lupe";
        System.out.println("nombre2 = " + nombre2);
        var edad = 9; //Se infiere tipo int
        System.out.println("edad = " + edad);
        var sueldo = 5000.50F; //Se infiere tipo float
        System.out.println("sueldo = " + sueldo);
        
                
    }
}
