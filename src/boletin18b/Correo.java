
package boletin18b;



public class Correo {


    private String contido;
    private boolean leido;

    public Correo(String contido) {
        this.contido = contido;
        this.leido = false;
    }

    public String getContido() {
        return contido;
    }

    public void setContido(String contido) {
        this.contido = contido;
    }

    public boolean isLeido() {
        return leido;
    }

    public void setLeido(boolean leido) {
        this.leido = leido;
    }

    @Override
    public String toString() {
        return "Correo{" + "contido=" + contido + ", leido=" + leido + '}';
    }


}
