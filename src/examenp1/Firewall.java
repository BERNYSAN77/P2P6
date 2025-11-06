package examenp1;

public class Firewall {
    private String regla;
    private int puerto;
    private boolean estado;
    private int intentosBloqueados;

    public Firewall(String regla, int puerto) {
        this.regla = regla;
       setPuerto(puerto);
        this.estado = false;
        this.intentosBloqueados = 0;
    }

    public void setRegla(String regla) {
        this.regla = regla;
    }

    public void setPuerto(int puerto) {
        if(puerto >= 1 && puerto <= 65535)
            this.puerto = puerto;
    }

    public String getRegla() {
        return regla;
    }

    public int getPuerto() {
        return puerto;
    }

    public boolean isEstado() {
        return estado;
    }

    public int getIntentosBloqueados() {
        return intentosBloqueados;
    }
    public void activar(){
        if(estado == false)
        estado = true;
        else
            System.out.println("La regla ya está activada");
    }

    public void desactivar(){
        if(estado){
            estado = false;
            intentosBloqueados = 0;
        }

        else
            System.out.println("La regla ya está desactivada");

    }

    public void bloquearIntento(int puertoIntento){
        if(estado && puerto == puertoIntento)
            intentosBloqueados++;
        else
            System.out.println("no està activa o el puerto no coince");
    }
    public void mostrarEstado(){
        String mensaje = estado?"Activa":"Desactiva";
        System.out.println("Regla: "+regla);
        System.out.println("Estado : "+mensaje+" con "+intentosBloqueados+" intentos bloqueados");
    }
}
