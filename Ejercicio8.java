public class Ejercicio8 {
    public static void main(String[] args) {
        
        Animal a1 = new Animal();

      
        a1.setNombre("Tigre");
        a1.setOrden("Carnívoro");
        a1.setExtremidades(4);

       
        System.out.println("Nombre del animal: " + a1.getNombre());
        System.out.println("Orden: " + a1.getOrden());
        System.out.println("Cantidad de extremidades: " + a1.getExtremidades());
    }
}



class Animal {
    private String nombre;
    private String orden;
    private int extremidades;

  
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }

    public void setExtremidades(int extremidades) {
        this.extremidades = extremidades;
    }

  
    public String getNombre() {
        return nombre;
    }

    public String getOrden() {
        return orden;
    }

    public int getExtremidades() {
        return extremidades;
    }

}