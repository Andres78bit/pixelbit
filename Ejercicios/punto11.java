public class punto11 {
    public static void main(String[] args) {
        int[] a = { 6, 5, -6, 0, 31, -8, 19, 0, 21, 7, 2, -1 };
        int positivos = 0, negativos = 0, ceros = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                positivos++;
            } else if (a[i] < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }
        int[] pos = new int[positivos];
        int[] neg = new int[negativos];
        int[] nul = new int[ceros];
        int x = 0, y = 0, z = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                pos[x] = a[i];
                x++;
            } else if (a[i] < 0) {
                neg[y] = a[i];
                y++;
            } else {
                nul[z] = a[i];
                z++;
            }
        }
        System.out.print("números positivos: ");
        for (int i = 0; i < pos.length; i++) {
            System.out.print(pos[i] + " ");
        }
        System.out.println();
        System.out.print("números negativos: ");
        for (int i = 0; i < neg.length; i++) {
            System.out.print(neg[i] + " ");
        }
        System.out.println();
        System.out.print("ceros: ");
        for (int i = 0; i < nul.length; i++) {
            System.out.print(nul[i] + " ");
        }
    }
}
