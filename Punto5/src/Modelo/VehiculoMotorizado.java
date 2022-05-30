package Modelo;

import java.util.Scanner;

public class VehiculoMotorizado {

    private String Fabricante;
    private String Modelo;
    private int añoFabrica;
    private int Kilometraje;
    private String TipoVehiculo;

    Scanner leer = new Scanner(System.in);

    public VehiculoMotorizado() {
    }

    public VehiculoMotorizado(String Fabricante, String Modelo, int añoFabrica, int Kilometraje, String TipoVehiculo) {
        this.Fabricante = Fabricante;
        this.Modelo = Modelo;
        this.añoFabrica = añoFabrica;
        this.Kilometraje = Kilometraje;
        this.TipoVehiculo = TipoVehiculo;
    }

    public String getFabricante() {
        return Fabricante;
    }

    public void setFabricante(String Fabricante) {
        this.Fabricante = Fabricante;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public int getAñoFabrica() {
        return añoFabrica;
    }

    public void setAñoFabrica(int añoFabrica) {
        this.añoFabrica = añoFabrica;
    }

    public int getKilometraje() {
        return Kilometraje;
    }

    public void setKilometraje(int Kilometraje) {
        this.Kilometraje = Kilometraje;
    }

    public String getTipoVehiculo() {
        return TipoVehiculo;
    }

    public void setTipoVehiculo(String TipoVehiculo) {
        this.TipoVehiculo = TipoVehiculo;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public void obtenerDatos() {
        System.out.println("Ingrese los datos del vehiculo");
        System.out.println("Ingrese que tipo de vehiculo es: ");
        String tipo = leer.nextLine();
        setTipoVehiculo(tipo);
        System.out.println("Ingrese el fabricante del vehiculo: ");
        String fabri = leer.nextLine();
        setFabricante(fabri);
        System.out.println("Ingrese el modelo del vehiculo: ");
        String Model = leer.nextLine();
        setModelo(Model);
        System.out.println("Ingrese el año de fabrica del vehiculo: ");
        int Año = leer.nextInt();
        setAñoFabrica(Año);
        System.out.println("Ingrese el kilometraje del vehiculo: ");
        int Kilovehiculo = leer.nextInt();
        setKilometraje(Kilovehiculo);
    }

    public void verDatos() {
        System.out.println("-------------------------------------------------------------------");
        System.out.println("El vehiculo es un " + getTipoVehiculo() + "\n"
                + "El vehiculo fue fabricado por: " + getFabricante() + "\n"
                + "Su modelo es: " + getModelo() + "\n"
                + "Su año de fabricacion es: " + getAñoFabrica() + "\n"
                + "Su Kilometraje es: " + getKilometraje() + "\n");
        System.out.println("-------------------------------------------------------------------");

    }

}
