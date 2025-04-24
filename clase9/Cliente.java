package clase9;

import java.util.Scanner;

public class Cliente {

    // Atributos
    private String cedula;
    private String nombre;

    // Construtor
    public Cliente(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    // Metodos
    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String toString() {
        return "CEDULA: " + cedula + " NOMBRE: " + nombre + "\n";
    }

    // Creación del método estático llamado digCliente
    public static Cliente digCliente() {
        Scanner sc = new Scanner(System.in); // Para leer datos de entrada
        System.out.println("Digite su cédula");
        String cedula = sc.nextLine(); // Almacena en la variable "cedula" el valor digitado por el usuario
        System.out.println("Digite su nombre y apellido");
        String nombre = sc.nextLine(); // Almacena en la variable "nombre" el valor digitado por el usuario
        return new Cliente(cedula, nombre); // Retorna un nuevo objeto Cliente creado con los datos ingresados
    }
}
