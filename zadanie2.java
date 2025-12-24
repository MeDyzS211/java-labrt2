import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] a = new int[10];
        Random r = new Random();

        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(199) - 99;
            System.out.print(a[i] + " ");
        }

        int min = 0;
        int max = 0;

        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[min]) min = i;
            if (a[i] > a[max]) max = i;
        }

        int t = a[min];
        a[min] = a[max];
        a[max] = t;

        System.out.println("\nПосле замены:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
