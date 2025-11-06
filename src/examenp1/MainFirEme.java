package examenp1;

import javax.swing.*;

public class MainFirEme {
    public static void main(String[] args) {
        String regla;
        int puerto;
        Firewall f1 = null;

        regla = JOptionPane.showInputDialog("Ingrese la regla: ");
        puerto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el puerto"));
        f1 = new Firewall(regla,puerto);
        JOptionPane.showMessageDialog(null,"Regla: "+f1.getRegla()+"\nPuerto: "+f1.getPuerto()+"Estado "+
                (f1.isEstado()?"Activo":"Desactivo")+"\nBloqueos: "+f1.getIntentosBloqueados());

    }
}
