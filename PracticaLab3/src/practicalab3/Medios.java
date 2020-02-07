
package practicalab3;

public class Medios {
    
    private int nivel;
    private int dominio;
    private double promedio;

    public Medios() {
    }

    public Medios(int nivel, int dominio, double promedio) {
        this.nivel = nivel;
        this.dominio = dominio;
        this.promedio = promedio;
    }

    public int getNivel() {
        return nivel;
    }

    public int getDominio() {
        return dominio;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setDominio(int dominio) {
        this.dominio = dominio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Medios{" + "nivel=" + nivel + ", dominio=" + dominio + ", promedio=" + promedio + '}';
    }
    
    
    
}
