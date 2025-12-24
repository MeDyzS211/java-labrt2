public class zadanie8 {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 4, 4};

        for (int i = 0; i < a.length; i++) {
            boolean unique = true;
            for (int j = 0; j < a.length; j++) {
                if (i != j && a[i] == a[j]) {
                    unique = false;
                }
            }
            if (unique) {
                System.out.print(a[i] + " ");
            }
        }
    }
}
