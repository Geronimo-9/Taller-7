public class Utilidades {
    private double valor1;
    private double valor2;

public Utilidades(){
    this.valor1 = valor1;
    this.valor2 = valor2;

}

    public double getValor1() {
        return valor1;
    }

    public double getValor2() {
        return valor2;
    }


    public void suma(double valor1, double valor2){
        System.out.println(valor1 + valor2);
    }

    public void resta(double valor1, double valor2){
        System.out.println(valor1 - valor2);
    }

    public void multiplica(double valor1, double valor2){
        System.out.println(valor1 * valor2);
    }

    public void divide(double valor1, double valor2){
        try {
            if(valor2 == 0){
                throw new ArithmeticException("Error");
            }

        } catch (ArithmeticException x){
            System.out.println("¡¡ERROR 301, DIVISION POR CERO NO EXISTE!!");

        } finally {
            System.out.println(valor1/valor2);
        }

    }

}












