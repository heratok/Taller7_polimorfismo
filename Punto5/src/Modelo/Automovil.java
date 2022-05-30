
package Modelo;



public class Automovil extends VehiculoMotorizado{

    public Automovil() {
    }

    public Automovil(String Fabricante, String Modelo, int AñoFabrica, int Kilometraje, String Tipo_Vehiculo) {
        super(Fabricante, Modelo, AñoFabrica, Kilometraje, Tipo_Vehiculo);
    }

    public  void obtenerDatos() {
        System.out.println("-------------------------------------");
        System.out.println("Ingrese los datos del vehiculo");
        System.out.println("-------------------------------------");
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
        int Km = leer.nextInt();
        setKilometraje(Km);
    }

    public void verDatos() {
        System.out.println("-------------------------------------------------------------------");
        System.out.println("El vehiculo es un " + getTipoVehiculo()+ "\n"
                + "El vehiculo fue fabricado por: " + getFabricante() + "\n"
                + "Su modelo es: " + getModelo() + "\n"
                + "Su año de fabricacion es: " + getAñoFabrica() + "\n"
                + "Su Kilometraje es: " + getKilometraje() + "\n");
        System.out.println("-------------------------------------------------------------------");

    }

    


   
   

}
