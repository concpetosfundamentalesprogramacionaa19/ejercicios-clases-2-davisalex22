package ejemploclase2;

import java.util.Scanner;

public class Ejemploclase22 {

    public static void main(String[] args) {
// Inicio
        String nombre;
        String apellido;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese sus nombres: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su apellidos: ");
        apellido = entrada.nextLine();
        System.out.println("Su nombre es: " + nombre + "\n\n\t" + "Su apellido es: "
                + apellido);
// Fin    
    }
}
