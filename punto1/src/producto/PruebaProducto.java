package producto;

import java.util.ArrayList;
import modelo.*;

public class PruebaProducto {

    public static void main(String[] args) {
        ArrayList<Producto> listaProductos = new ArrayList();
        Producto perecedero = new Perecedero(2, "Gel", 15000);
        Producto perecedero2 = new Perecedero(3, "perfume", 18000);
        Producto p3 = new Perecedero(1, "jabon", 5000);
        Producto p4 = new Perecedero(1, "arroz", 1200);
        Producto p5 = new Perecedero(3, "papas", 3000);
        Producto No = new NoPerecedero("limones", 10000);
        Producto No1 = new NoPerecedero("aguacates", 4000);
        Producto No2 = new NoPerecedero("yuca", 15000);
        Producto N3 = new NoPerecedero("jugo", 7000);
        Producto No4 = new NoPerecedero("arepas", 8000);
        listaProductos.add(perecedero);
        listaProductos.add(perecedero2);
        listaProductos.add(p3);
        listaProductos.add(p4);
        listaProductos.add(p5);

        listaProductos.add(No);
        listaProductos.add(No1);
        listaProductos.add(No2);
        listaProductos.add(N3);
        listaProductos.add(No4);
        listaProductos.forEach(PruebaProducto::Mostrar);
    }

    public static void Mostrar(Producto producto) {
        System.out.println(producto.calcular(0));
        System.out.println("-----------------------------------------");
        System.out.println(producto.toString());

    }

}
