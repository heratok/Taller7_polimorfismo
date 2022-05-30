package modelo;

public class AutoBuses extends Vehiculos {
    private double precioKm;
    private int kmInicio;
    private int kmFin;

    public double getPrecioKm() {
        return precioKm;
    }


    public void setPrecioKm(double precioKm) {
        this.precioKm = precioKm;
    }

    public int getKmInicio() {
        return kmInicio;
    }

    public void setKmInicio(int kmInicio) {
        this.kmInicio = kmInicio;
    }

    public int getKmFin() {
        return kmFin;
    }

    public void setKmFin(int kmFin) {
        this.kmFin = kmFin;
    }
    
    @Override
    public double CalculaRenta() 
    {
        return (kmFin - kmInicio) * precioKm;
    }

}
