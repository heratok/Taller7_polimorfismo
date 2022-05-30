package Vista;

import Modelo.*;
public class Prueba {

    public static void main(String[] args) {
        VehiculoMotorizado vehiculo = new Motocicleta();
        vehiculo.obtenerDatos();
        vehiculo.verDatos();
        CapacidadLimite limit1 = new CapacidadLimite();
        limit1.obtenerPasajeros();
        VehiculoMotorizado vehiculo2 = new Automovil();
        vehiculo2.obtenerDatos();
        vehiculo2.verDatos();
        CapacidadLimite limit2 = new CapacidadLimite();
        limit2.obtenerPasajeros();
        
    
        
    }

}
