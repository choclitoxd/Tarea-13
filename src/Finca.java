public class Finca {
    public static String nombre="";
    public Empleado empleado;
    public void adicionarEmpleado(Empleado empleado){
        if(!nombre.equals(empleado.nombre)){
            nombre = empleado.nombre;
            this.empleado = empleado;
        }else{
            System.out.println("El nombre ya existe");
        }
    }
    public void eliminarEmpleado(Empleado empleado){
        if (empleado != null){
            empleado = null;
            System.out.println("Eliminado");
        }else
            System.out.println("Ya se elimino");
    }
    public void detallesEmpleado(){
        System.out.println(empleado.toString());
    }

}
