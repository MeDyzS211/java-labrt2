public class zadanie11 {
    public static void main(String[] args) {
        int[] a = {1, 3, 2, 5, 4};
        int count = 0;

        for (int i = 1; i < a.length; i++) {
            if (a[i] > a[i - 1]) {
                count++;
            }
        }

        System.out.println(count);
    }
}
