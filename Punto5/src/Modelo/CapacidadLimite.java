package Modelo;

import java.util.Scanner;

public class CapacidadLimite extends VehiculoMotorizado {

    private int numeroPasajeros;

    Scanner leer2 = new Scanner(System.in);

    public CapacidadLimite() {
    }

    public CapacidadLimite(int numeroPasajeros, String Fabricante, String Modelo, int añoFabrica, int Kilometraje, String TipoVehiculo) {
        super(Fabricante, Modelo, añoFabrica, Kilometraje, TipoVehiculo);
        this.numeroPasajeros = numeroPasajeros;
    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    public Scanner getLeer2() {
        return leer2;
    }

    public void setLeer2(Scanner leer2) {
        this.leer2 = leer2;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public void obtenerPasajeros() {
        System.out.println("Ingrese el numero de pasajeros: ");
        int NumPasajeros = leer.nextInt();
        setNumeroPasajeros(NumPasajeros);
        System.out.println("El numero de pasajeros del vehiculo: " + getNumeroPasajeros());
        if (getNumeroPasajeros() > 4) {
            System.out.println("No se cumple las medidas de seguridad exigidas");
        } else {
            System.out.println("cumple las medidas de seguridad exigidas");
        }

    }

}
