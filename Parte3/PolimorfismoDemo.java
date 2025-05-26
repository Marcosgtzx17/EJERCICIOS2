
package Parte3;
public class PolimorfismoDemo {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = {
            new Automovil(),
            new Barco(),
            new Avion()
        };

        for (Vehiculo v : vehiculos) {
            v.mover();
        }
    }
}


class Vehiculo {
    public void mover() {
        System.out.println("Vehículo moviéndose...");
    }
}

class Automovil extends Vehiculo {
    @Override
    public void mover() {
        System.out.println("Automóvil rodando en la carretera.");
    }
}

class Barco extends Vehiculo {
    @Override
    public void mover() {
        System.out.println("Barco navegando en el mar.");
    }
}

class Avion extends Vehiculo {
    @Override
    public void mover() {
        System.out.println("Avión volando por los cielos.");
    }
}
