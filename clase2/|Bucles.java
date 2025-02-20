public class Bucles {
    public static void main(String[]args){
        //for(inicio; condicion de parada; incremento o decremento)
        for (int i = 1; i <= 5; i++){
            System.out.println("Número de Iteración: " + i );
        }
    }
    /* Estructura del while
     * inicio;
     * while(condicion){
     * ---------
     * incremento o decremento
     * }
     */
    int j = 1;
    while(j <= 5){
        System.out.println("Número de Iteración: " + j );
        j++;
    }
}