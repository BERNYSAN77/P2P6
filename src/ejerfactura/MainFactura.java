package ejerfactura;


public class MainFactura {
    public static void main(String[] args) {
        System.out.println("Existen "+Factura.getFacturas()+" facturas generadas");
        Factura f1 = new Factura();
        System.out.println("\n\nExisten "+Factura.getFacturas()+" facturas generadas");
        Factura f2 = new Factura("peras",5,0.12);
        System.out.println("\n\nExisten "+Factura.getFacturas()+" facturas generadas");
        System.out.println("\nLa factura del objeto f2 es: "+f2.getNumFactura());

    }
}
