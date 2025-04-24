import java.util.Scanner;

public class punto8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[30];
        int mayor, menor;
        int numMayor = 0, numMenor = 0;
        System.out.println("digíte 30 números: ");
        a[0] = scanner.nextInt();
        mayor = a[0];
        menor = a[0];
        numMayor = 1;
        numMenor = 1;
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
            if (a[i] > mayor) {
                mayor = a[i];
                numMayor = 1;
            } else if (a[i] == mayor) {
                numMayor++;
            }
            if (a[i] < menor) {
                menor = a[i];
                numMenor = 1;
            } else if (a[i] == menor) {
                numMenor++;
            }
        }
        System.out.println("numero mayor: " + mayor);
        System.out.println("numero menor: " + menor);
        System.out.println("numero mayor se repite: " + numMayor + "veces.");
        System.out.println("numero menor se repite: " + numMenor + "veces.");
        scanner.close();
    }
}