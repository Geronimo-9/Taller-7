public class Empleado {
    public String nombre;
    public double salario;

    public Empleado(String nombre, double salario){
        this.nombre = nombre;
        setSalario(salario);
    }



    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {

        if(salario >= 0){
            this.salario = salario;
        }
    }


    public void mostrar(){
        System.out.println(" Nombre: "+nombre+" Salario: "+salario+" ");
    }



}
