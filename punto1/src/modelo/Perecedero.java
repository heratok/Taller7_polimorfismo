package modelo;

public class Perecedero extends Producto {

    private int caducar;

    double precioFinal;

    public double getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }

    public Perecedero() {
    }

    public int getCaducar() {
        return caducar;
    }

    public void setCaducar(int caducar) {
        this.caducar = caducar;
    }

    public double getCalcular(double canProductos) {

        double valor = canProductos * getPrecio();
        if (getCaducar() == 1) {
            precioFinal = (valor / 4);
        } else {
            if (caducar == 2) {
                precioFinal = (valor / 3);
            } else {
                precioFinal = (valor / 2);
            }

        }
        return precioFinal;
    }

    public Perecedero(int caducar, String nombre, double precio) {
        super(nombre, precio);
        this.caducar = caducar;
    }

    @Override
    public String toString() {
        System.out.println("PERECEDERO ");

        return "nombre del producto: " + getNombre() + "\ndias para caducar: " + getCaducar() + "\nprecio del producto: " + getPrecio() + "\nprecio final : " + getCalcular(50);
    }

}
