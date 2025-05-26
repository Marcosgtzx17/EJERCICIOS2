package Parte3;



interface Profesion {
   
    double calcularSueldo();
}


class Doctor implements Profesion {
    private double sueldoBase;
    private int horasExtra;

    
    public Doctor(double sueldoBase, int horasExtra) {
        this.sueldoBase = sueldoBase;
        this.horasExtra = horasExtra;
    }

    
    @Override
    public double calcularSueldo() {
        return sueldoBase + (horasExtra * 25); 
    }
}


class Ingeniero implements Profesion {
    private double sueldoFijo;

    public Ingeniero(double sueldoFijo) {
        this.sueldoFijo = sueldoFijo;
    }

   
    @Override
    public double calcularSueldo() {
        return sueldoFijo; 
    }
}


    // Clase principal para probar el programa
public class EjercicioInterface {
    public static void main(String[] args) {

        Doctor doctor = new Doctor(1200.0, 5);  // 5 horas extra
        Ingeniero ingeniero = new Ingeniero(1500.0);

       
        System.out.println("Sueldo del doctor: $" + doctor.calcularSueldo());
        System.out.println("Sueldo del ingeniero: $" + ingeniero.calcularSueldo());
    }
}
