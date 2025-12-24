public class zadanie6 {
    public static final int N = 3;

    public static void main(String[] args) {
        int[] a = {3, 7, 1, 9, 5};

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }

        System.out.println("Максимальные элементы:");
        for (int i = 0; i < N; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
