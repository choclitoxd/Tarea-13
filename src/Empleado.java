public abstract class Empleado {
    public String nombre;
    public String cargo;
    public abstract int calcularSalario();

    public Empleado(String nombre, String cargo){
        this.nombre = nombre;
        this.cargo = cargo;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
