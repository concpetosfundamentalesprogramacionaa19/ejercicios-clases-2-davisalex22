package ejemploclase2;
import java.util.Scanner;
public class Ejemploclase23 {
    public static void main(String[] args) {// Inicio
        String nombre;
        String apellido;
        int edad;
        String ciudad;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese sus nombres: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su apellidos: ");
        apellido = entrada.nextLine();
        System.out.println("Ingrese su edad: ");
        edad = entrada.nextInt();
        entrada.nextLine();// Limpieza de buffer de entrada de datos
        System.out.println("Ingrese su ciudad de nacimiento: ");
        ciudad = entrada.next();
        System.out.print("Su nombre es: "+ nombre +"\n\n\t"+ "Su apellido es: "
                + apellido);
        System.out.println(", edad: "+edad);

        System.out.println("Ciudad: "+ciudad);
// Fin  
    }
}
