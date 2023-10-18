public class EmpleadoRecoleccion extends Empleado{
    private int numeroKilos, valorKilo;

    public int getNumeroKilos() {
        return numeroKilos;
    }

    public int getValorKilo() {
        return valorKilo;
    }
    public EmpleadoRecoleccion(int numeroKilos, int valorKilo, String nombre, String cargo){
        super(nombre,cargo);
        this.numeroKilos = numeroKilos;
        this.valorKilo = valorKilo;

    }
    @Override
    public int calcularSalario() {
        return getNumeroKilos() * getNumeroKilos();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
