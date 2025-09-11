import java.rmi.server.UnicastRemoteObject;

public class Main {
    public static void main(String[] args) {



        // Ejercicio 1, Clase Empleado, con instancia y acceso a las propiedades.
    Empleado e1 = new Empleado("Geronimo",2000000);
        e1.mostrar();



        // Ejercicio 2, Clase CuentaBancaria con acceso denegado a numeroCuenta.

        CuentaBancaria geronimo = new CuentaBancaria();
        //geronimo.numeroCuenta(); --> // No puedo acceeder al atributo porque se encuentra de acceeso privado.


        // Ejercicio 3, Clase Utilidades con operaciones aritmeticas y funcional (verificado).


        Utilidades test = new Utilidades();
        test.suma(2,2.5);
        test.resta(2,2);
        test.multiplica(6.9,6.3);
        test.divide(2,0);

        




    }
}