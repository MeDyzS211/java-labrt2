public class zadanie16 {
    public static void main(String[] args) {
        int[] a = {2, -3, 4};

        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) min = a[i];
        }

        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] * min;
            System.out.print(a[i] + " ");
        }
    }
}
