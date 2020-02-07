package practicalab3;

import java.util.ArrayList;
import java.util.Scanner;

public class PracticaLab3 {

    static ArrayList<Jugadores> jugadores = new ArrayList();
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        char resp = 's';
        while (resp == 's' || resp == 'S') {
            System.out.println(" 1. Jugadores");
            System.out.println(" 2. Equipos");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println(" 1. Crear jugador");
                    System.out.println(" 2. Modificar jugador");
                    System.out.println(" 3. Eliminar jugador");
                    int jugas = leer.nextInt();
                    switch (jugas) {
                        case 1:
                            String estado = "",
                             prefer = "";

                            System.out.print(" Ingrese nombre: ");
                            String nombre = leer.next();
                            System.out.print(" Ingrese apellido: ");
                            String apellido = leer.next();
                            System.out.print(" Ingrese edad: ");
                            int edad = leer.nextInt();
                            System.out.println(" Ingrese estado: ");
                            System.out.println(" 1. Libre");
                            System.out.println(" 2 comprado");
                            int status = leer.nextInt();
                            switch (status) {
                                case 1:
                                    estado = "Libre";
                                    break;
                                case 2:
                                    estado = "Comprado";
                                    break;
                                default:
                                    System.out.println(" Opcion incorrecta");
                                    System.out.println();
                            }
                            System.out.print(" Ingrese pais de nacimiento: ");
                            String pais = leer.next();
                            System.out.println(" Seleccione pie preferido");
                            System.out.println(" 1. Derecho");
                            System.out.println(" 2. Izquierdo");
                            int pies = leer.nextInt();
                            switch (pies) {
                                case 1:
                                    prefer = "Derecho";
                                    break;

                                case 2:

                                    prefer = "Izquierdo";
                                    break;
                                default:
                                    throw new AssertionError();
                            }
                            System.out.print(" Ingrese numero: ");
                            int numero = leer.nextInt();
                            System.out.print(" Ingrese precio: ");
                            double precio = leer.nextDouble();
                            // jugadores.add(new Jugadores(nombre, apellido, edad, estado, pais, prefer, numero, precio));

                            System.out.println(" Jugador ingresado con exito");
                            System.out.println("");

                            System.out.println(" Ingrese posicion del jugador");
                            System.out.println(" 1. Portero");
                            System.out.println(" 2. Defensa");
                            System.out.println(" 3  Medios");
                            System.out.println(" 4. Delanteros");
                            int pos = leer.nextInt();
                            switch (pos) {
                                case 1:

                                    break;

                                case 2:

                                    break;

                                case 3:

                                    break;

                                case 4:
                                    System.out.print(" Ingrese Nivel de definicion ");
                                    double deficinicion = leer.nextDouble();
                                    System.out.print(" Ingrese altura: ");
                                    double altura = leer.nextDouble();
                                    System.out.print(" Ingrese velocidad: ");
                                    double velocidad = leer.nextDouble();
                                    System.out.print(" Ingrese promedio de goles: ");
                                    double prom = leer.nextDouble();
                                    jugadores.add(new Delanteros(deficinicion, altura, velocidad, precio, nombre, apellido, edad, estado, pais, pais, numero, precio));
                                    
                                    System.out.println(" Delantero Creado con exito");
                                    System.out.println();
                                    

                                    String salidas = "";
                                    for (Object o : jugadores) {
                                        if (o instanceof Jugadores) {
                                            salidas += " [" + jugadores.indexOf(o) + "] " + o + "\n";

                                        }

                                    }
                                    System.out.println(salidas);

                                    break;
                                default:
                                    throw new AssertionError();
                            }
                            break;
                        default:
                            throw new AssertionError();

                        case 2:
                            if (jugadores.isEmpty()) {
                                System.out.println(" No hay jugadores resgistrados hasta el momento");
                                System.out.println();
                                break;
                            }
                            System.out.println(" Selecciona lo que desee modificar del jugador");
                            System.out.println(" 1. Nombre ");
                            System.out.println(" 2. Apellido");
                            System.out.println(" 3. edad");
                            System.out.println(" 4. estado");
                            System.out.println(" 5 pais");
                            System.out.println(" 6 pie");
                            System.out.println(" 7 numero");
                            System.out.println(" 8 precio");
                            int option = leer.nextInt();
                            switch (option) {
                                case 1:

                                    boolean name = false;
                                    System.out.println(" Opcion modificar: NOMBRE");
                                    System.out.println();
                                    for (int i = 0; i < jugadores.size(); i++) {

                                        System.out.println(jugadores.get(i));

                                    }

                                    System.out.println();
                                    System.out.print(" Ingrese numero de lista del jugador: ");
                                    int numLista = leer.nextInt();
                                    for (int i = 0; i < jugadores.size(); i++) {
                                        if (numLista != i) {
                                            name = true;
                                        } else {
                                            name = false;
                                        }

                                    }
                                    if (name == false) {
                                        System.out.println(" Ingrese nuevo nombre del jugador");
                                        String newNombre = leer.next();
                                        jugadores.get(numLista).setNombre(newNombre);
                                        System.out.println(" Nombre del jugador modificado con exito");

                                        for (int i = 0; i < jugadores.size(); i++) {
                                            if (jugadores.get(i) instanceof Jugadores) {
                                                System.out.println(jugadores.get(i));
                                            }

                                        }
                                    } else {
                                        System.out.println(" Error, numero de lista no exite");
                                        System.out.println();
                                    }

                                    break;
                                default:
                                    throw new AssertionError();
                            }

                            break;

                    }
                    break;
                default:
                    throw new AssertionError();
            }
        }

    }

}
