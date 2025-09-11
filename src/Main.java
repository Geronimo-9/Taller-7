public class Main {
    public static void main(String[] args) {


        System.out.println("Listo para empezar");


        // Ejercicio 1, Clase Empleado, con instancia y acceso a las propiedades.
    Empleado e1 = new Empleado("Geronimo",2000000);
        e1.mostrar();



        // Ejercicio 2, Clase CuentaBancaria con acceso denegado a numeroCuenta.

        CuentaBancaria geronimo = new CuentaBancaria();
        //geronimo.numeroCuenta(); --> // No puedo acceeder al atributo porque se encuentra de acceeso privado.

        





    }
}