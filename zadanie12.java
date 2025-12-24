public class zadanie12 {
    public static void main(String[] args) {
        int[] a = {2, 4, 8};

        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) max = a[i];
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print((double)a[i] / max + " ");
        }
    }
}
