package ejerfactura;

import java.util.*;


public class MainColeccion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String producto;
        int cantidad, opc;
        double precio;
        List<Factura> facturas = new ArrayList<Factura>();
        do{
            menu();
            opc = Integer.parseInt(sc.nextLine());
            switch (opc){
                case 1:{
                    System.out.print("Ingrese el producto: ");
                    producto = sc.nextLine();
                    System.out.print("Ingrese la cantidad: ");
                    cantidad = Integer.parseInt(sc.nextLine());
                    System.out.print("Ingrese el precio: ");
                    precio = Double.parseDouble(sc.nextLine());
                    facturas.add(new Factura(producto,cantidad,precio));
                }break;
                case 2:{
                    Iterator<Factura> it = facturas.iterator();
                    while(it.hasNext()){
                        Factura f = it.next();
                        System.out.println(f);
                        System.out.println("Monto a pagar: "+f.montoFactura());
                    }

                }break;
                default:
                    System.out.println("Opción no válida");

            }

        }while(opc != 5);
    }
    public static void menu(){
        System.out.println("**********Facturacion********");
        System.out.println("1. Ingresar Factura");
        System.out.println("2. Mostrar todas las Factura");
        System.out.println("3. Buscar factura");
        System.out.println("4. Factura con mayor valor");
        System.out.println("5. Salir ");
        System.out.print("Seleccione una opcion: ");
    }
}
