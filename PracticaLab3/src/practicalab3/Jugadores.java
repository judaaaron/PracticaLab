package practicalab3;

import java.util.Scanner;

public class Jugadores {

    private String nombre;
    private String apellido;
    private int edad;
    private String estado;
    private String pais;
    private String pie;
    private int numero;
    private double precio;
    static Scanner leer = new Scanner(System.in);

    public Jugadores() {
    }

    public Jugadores(String nombre, String apellido, int edad, String estado, String pais, String pie, int numero, double precio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.estado = estado;
        this.pais = pais;
        this.pie = pie;
        setNumero(numero);
        this.precio = precio;
        System.out.println("te amo yuda <3");
        System.out.println("att. Josue");
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getEstado() {
        return estado;
    }

    public String getPais() {
        return pais;
    }

    public String getPie() {
        return pie;
    }

    public int getNumero() {
        return numero;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setPie(String pie) {
        this.pie = pie;
    }

    public void setNumero(int numero) {
        while (numero != 0) {
            System.out.println(" El numero no debe de ser difeente de 0");
            System.out.print(" Ingrese numero: ");
            numero=leer.nextInt();
            this.numero = numero;
        }
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Jugadores{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", estado=" + estado + ", pais=" + pais + ", pie=" + pie + ", numero=" + numero + ", precio=" + precio + '}';
    }

}
