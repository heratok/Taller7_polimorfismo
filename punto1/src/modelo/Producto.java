package modelo;

public abstract class Producto {

    private String nombre;
    private double precio;
    private double valorF;


    public double getValorF() {
        return valorF;
    }

    public void setValorF(double valorF) {
        this.valorF = valorF;
    }

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Producto() {
    }

    public double calcular(double canProductos) {
        return getValorF();
    }
    
    @Override
    public String toString() {
        return "valor final: " + valorF;
    }

}
