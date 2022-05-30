package vista;

import java.util.GregorianCalendar;
import java.util.Scanner;
import modelo.*;

public class PruebaVehiculos {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("");
        AutoBuses a1 = new AutoBuses();
        Tractores t1 = new Tractores();
        a1.setPrecioKm(15);
        t1.setPrecioDia(20);

        System.out.println("Ingresa una opcion del menú o presiona 0 para salir");
        System.out.println("1: Rentar un Autorbus");
        System.out.println("2: Rentar un Tractor");
        System.out.println("3: Devolver un Autobus");
        System.out.println("4: Devolver un Tractor");
        int opcion = leer.nextInt();
        while (opcion != 0) {
            switch (opcion) {
                case 1:
                    System.out.println("Ingresa el kilometraje inicial");
                    a1.setKmInicio(leer.nextInt());
                    System.out.println("Gracias, regresa pronto");
                    break;
                case 2:
                    System.out.println("Ingresa el dia de salida del Tractor");
                    int dia1 = leer.nextInt();
                    System.out.println("Ingresa el mes de salida del Tractor");
                    int mes1 = leer.nextInt();
                    System.out.println("Ingresa el año de salida del Tractor");
                    int anio1 = leer.nextInt();
                    t1.setfechaInicio(new GregorianCalendar(anio1, mes1, dia1));
                    System.out.println("Gracias, regresa pronto");
                    break;
                case 3:
                    System.out.println("Ingresa el kilometraje final");
                    a1.setKmFin(leer.nextInt());
                    System.out.println("La renta por el autobus es de: " + a1.CalculaRenta());
                    break;
                case 4:
                    System.out.println("Ingresa el dia de recepcion del Tractor");
                    int dia = leer.nextInt();
                    System.out.println("Ingresa el mes de recepcion del Tractor");
                    int mes = leer.nextInt();
                    System.out.println("Ingresa el año de recepcion del Tractor");
                    int anio = leer.nextInt();
                    t1.setFechaFin(new GregorianCalendar(anio, mes, dia));
                    System.out.println("La renta por el tractor es de: " + t1.CalculaRenta());
                    break;
            }
            System.out.println("\nIngresa una opcion del menú o presiona 0 para salir");
            System.out.println("1: Rentar un Autorbus");
            System.out.println("2: Rentar un Tractor");
            System.out.println("3: Devolver un Autobus");
            System.out.println("4: Devolver un Tractor");
            opcion = leer.nextInt();
        }
    }
}
