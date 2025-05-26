package Parte3;
public class EjercicioPersonal {
    public static void main(String[] args) {
        
        Empleado emp = new Empleado("Juan Perez", 1000.0, 10);

        
        emp.registrar();

        
        double sueldo = emp.calcularSueldo();
        System.out.println("Sueldo total: " + sueldo);
    }
}


abstract class Personal {
    
    public abstract void registrar();

   
    public abstract double calcularSueldo();
}


class Empleado extends Personal {
    private String nombre;
    private double sueldoBase;
    private int horasExtra;

    public Empleado(String nombre, double sueldoBase, int horasExtra) {
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
        this.horasExtra = horasExtra;
    }

    
    @Override
    public void registrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Sueldo base: " + sueldoBase);
        System.out.println("Horas extra: " + horasExtra);
    }

   
    @Override
    public double calcularSueldo() {
        return sueldoBase + (horasExtra * 15);
    }
}