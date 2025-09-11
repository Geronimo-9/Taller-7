public class CuentaBancaria {
    private int numeroCuenta;
    private double saldo;
    public String tipoCuenta;

 public CuentaBancaria(){
     this.numeroCuenta = numeroCuenta;
     this.tipoCuenta = tipoCuenta;
     setSaldo(saldo);

 }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0){
            this.saldo = saldo;
        }
    }

    public void mostrarDetalles(){
        System.out.println("Num. Cuenta: "+numeroCuenta+" Saldo:" +saldo+" Tipo Cuenta: "+tipoCuenta+" ");

    }




}
