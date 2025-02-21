package clase3;

public class Arreglos {
    public static void main(String[] Args) {
        //Creacion del arreglo de enteros
        int[] a = { 3, 6, 5, 10, 20, 1, 4, 9};
        //Recorrer y mostrar los elementos del arreglo
        // a.length -> obtiene la longitud o tamaño del arreglo
        for (int i = 0; i < a.length; i++) {
            System.out.print("a[" + i + "]=" + a[i] + "\t");
        //En vertical: System.out.println("a[" + i + "]=" + a[i]);
        }
    }
}
