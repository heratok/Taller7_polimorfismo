package modelo;

public class NoPerecedero extends Producto {

    private int iva;

    public NoPerecedero() {

    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public NoPerecedero(String nombre, double precio) {
        super(nombre, precio);
    }

    public double getCalcular(double canProductos) {
        double valorSin = getPrecio() * canProductos;
        double porIva = getIva() * valorSin / 100;
        double valorCon = valorSin + porIva;
        return valorCon;
    }

    @Override
    public String toString() {
        System.out.println("NO PERECEDEROS ");
        double canProductos = 0;
        return "nombre del producto: " + getNombre() + "\nprecio final con iva: " + calcular(canProductos) + "\niva: " + iva;
    }

}
