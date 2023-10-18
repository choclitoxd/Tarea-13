public class EmpleadoTiempoParcial extends Empleado {
    private int numeroHoras, salarioHora;

    public EmpleadoTiempoParcial(String nombre, String cargo, int numeroHoras, int salarioHora) {
        super(nombre, cargo);
        this.numeroHoras = numeroHoras;
        this.salarioHora = salarioHora;
    }

    public int getNumeroHoras() {
        return numeroHoras;
    }

    public int getSalarioHora() {
        return salarioHora;
    }

    @Override
    public int calcularSalario() {
        return getNumeroHoras() * getSalarioHora();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
