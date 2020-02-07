package practicalab3;

public class Delanteros extends Jugadores {

    private double definicion;
    private double altura;
    private double velocidad;
    private double promedio;

    public Delanteros() {
    }

    public Delanteros(double definicion, double altura, double velocidad, double promedio, String nombre, String apellido, int edad, String estado, String pais, String pie, int numero, double precio) {
        super(nombre, apellido, edad, estado, pais, pie, numero, precio);
        this.definicion = definicion;
        this.altura = altura;
        this.velocidad = velocidad;
        this.promedio = promedio;
    }

    public double getDefinicion() {
        return definicion;
    }

    public double getAltura() {
        return altura;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setDefinicion(double definicion) {
        this.definicion = definicion;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return super.toString() + "Posicion= "+ " Delantero -> " + " definicion= " + definicion + " altura= " + altura + " velocidad= " + velocidad + " promedio= " + promedio;
    }

}
