package ejerfactura;

public class Factura {
    private int numFactura;
    private String producto;
    private int cantidad;
    private double precio;
    //atributo de clase
    private static int facturas;

    //contructores
    public Factura(){
        facturas++;
        numFactura = facturas;
    }

    public Factura(String producto, int cantidad, double precio) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;

        numFactura = ++facturas;

    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNumFactura() {
        return numFactura;
    }

    public String getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public static int getFacturas() {
        return facturas;
    }

    public double montoFactura(){
          return cantidad * precio;
    }

    @Override
    public String toString(){
        return "\nFactura Nº "+numFactura+"\nProducto: "+producto+"\nCantidad: "+cantidad+
                "\nPrecio: "+precio;
    }
}
