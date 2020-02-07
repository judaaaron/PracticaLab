
package practicalab3;


public class Defensas {
    
    private int nivel;
    private double altura;
    private double peso;
    private double velocidad;

    public Defensas() {
    }

    public Defensas(int nivel, double altura, double peso, double velocidad) {
        this.nivel = nivel;
        this.altura = altura;
        this.peso = peso;
        this.velocidad = velocidad;
    }

    public int getNivel() {
        return nivel;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Defensas{" + "nivel=" + nivel + ", altura=" + altura + ", peso=" + peso + ", velocidad=" + velocidad + '}';
    }
    
    
    
}
