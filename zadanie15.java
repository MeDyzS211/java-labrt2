public class zadanie15 {
    public static void main(String[] args) {
        int[] a = {1, -3, 5, -2, -1, 4};
        int count = 0;

        for (int i = 1; i < a.length; i++) {
            if (a[i] * a[i - 1] < 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
