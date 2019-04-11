package ejercicioclase;
import java.util.Scanner;
public class MiEjercicio {
public static void main(String[] args) {
    
String nombre;
String apellido;
int edad;
int nota1;
int nota2;
String ciudad;
String pais;
double promedio;
double totprom;
Scanner entrada = new Scanner(System.in);

System.out.println("Ingrese sus nombres: ");
  nombre = entrada.nextLine();
System.out.println("Ingrese su apellidos: ");
  apellido = entrada.nextLine();
System.out.println("Ingrese su edad: ");
  edad = entrada.nextInt();
entrada.nextLine();// Limpieza de buffer de entrada de datos
System.out.println("Ingrese su pais de nacimiento: ");
  pais = entrada.next();
System.out.println("Ingrese su ciudad de nacimiento: ");
  ciudad = entrada.next();
System.out.println("Ingrese su nota 1: ");
  nota1 = entrada.nextInt();
System.out.println("Ingrese su nota 2: ");
  nota2 = entrada.nextInt();
  
promedio = nota1 + nota2;
totprom = promedio/2;
System.out.printf("Su nombre y su apellido son: %s\n Edad:"
    + " %s\n Ciudad: %s\n Pais: %s\n Notas %s\n Promedio: %s\n ",nombre+" "
        apellido,edad,ciudad,pais,nota1+","+nota2,totprom);
// Fin  
}}
