public class Trabajador {

    // Atributos
    private int idTrabajador;
    private String nombre;
    private String apellido;

    // Constructor
    public Trabajador(int idTrabajdor, String nombre, String apellido) {
        this.idTrabajador = idTrabajdor;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Metodos getter
    public int getIdTrabajador() {
        return idTrabajador;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double pagar() {
        return 0.0;
    }

    public String toString() {
        return "Trabajador { idTrabajador:" + idTrabajador +
                " Nombre: " + nombre +
                " Apellido: " + apellido + "}";
    }

}
