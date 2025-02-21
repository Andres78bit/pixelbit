package clase3;

public class Ejercicio3 {
    public static void main(String[] args) {
        /*
         * 3. Dado un número lineal de números, sumar separadamente
         * los números pares e impares.
         * 
         * Análisis: declarar un arreglo, en dos variables ir guardando
         * la suma de los números pares e impares, lo anterior debe
         * iterar en un "for" con la condición de validar si el número
         * es par o impar (n%2 == 0 -> par)
         */
        int[] b = { 5, 2, 6, 5,  9, 90, 1, 8, 15, 4 };
        int sumaPares = 0, sumaImpares = 0;
        for (int i = 0; i < b.length; i++) {
            if(b[i]%2 == 0){
                sumaPares = sumaPares + b[i];
            } else {
                sumaImpares += b[i];
            }
        }
        System.out.println("La suma de los número pares es: " + sumaPares);
        System.out.println("La suma de los número impares es: " + sumaImpares);
    }
}
