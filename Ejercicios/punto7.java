public class punto7 {
    public static void main(String[] args) {
        int[] a = { 2, 5, 7, 6, 9, 4, 6, 9, 20, 1 };
        int contPares = 0;
        int contImpares = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                contPares++;
            } else {
                contImpares++;
            }
        }
        int[] pares = new int[contPares];
        int[] impares = new int[contImpares];
        int b = 0;
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                pares[b++] = a[i];
            } else {
                impares[c++] = a[i];
            }
        }
        System.out.print("números pares: ");
        for (int i = 0; i < pares.length; i++) {
            System.out.print(pares[i] + " ");
        }
        System.out.print("\nnúmeros impares: ");
        for (int i = 0; i < impares.length; i++) {
            System.out.print(impares[i] + " ");
        }
    }
}