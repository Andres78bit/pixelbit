package clase9;

public class Producto {

    // Atributos
    private int numero;

    // Constructor
    public Producto(int numero) {
        this.numero = numero;
    }

    // Métodos
    public int getNumero() {
        return numero;
    }

    public String toString() {
        return ("PRODUCTO ID: " + numero);
    }
}