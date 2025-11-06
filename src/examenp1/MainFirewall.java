package examenp1;

import java.util.Scanner;

public class MainFirewall {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String regla;
        int puerto;
        System.out.print("Ingrese la regla: ");
        regla = sc.nextLine();
        System.out.println("Ingrese el puerto");
        puerto = sc.nextInt();

        Firewall f1 = new Firewall(regla,puerto);
        Firewall f2= new Firewall("Entrada red",80);
        f2.activar();
        f2.bloquearIntento(80);
        f2.bloquearIntento(2080);
        System.out.println("Firewall 1");
        f1.mostrarEstado();
        f1.bloquearIntento(2080);
        System.out.println("Firewall 2");
        f2.mostrarEstado();

    }
}
