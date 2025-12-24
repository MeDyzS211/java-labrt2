import java.util.Random;

public class zadanie1 {
    public static final int SIZE = 10;
    public static final int VALUE = 5;

    public static void main(String[] args) {
        int[] a = new int[SIZE];
        Random r = new Random();

        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(199) - 99;
            System.out.print(a[i] + " ");
        }

        System.out.println("\nНомера элементов равных " + VALUE + ":");
        for (int i = 0; i < a.length; i++) {
            if (a[i] == VALUE) {
                System.out.print(i + " ");
            }
        }
    }
}
