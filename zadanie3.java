import java.util.Random;

public class zadanie3 {
    public static final int VALUE = 0;

    public static void main(String[] args) {
        int[] a = new int[10];
        Random r = new Random();

        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(199) - 99;
            System.out.print(a[i] + " ");
        }

        System.out.println("\nЭлементы меньше " + VALUE + ":");
        for (int i = 0; i < a.length; i++) {
            if (a[i] < VALUE) {
                System.out.println("a[" + i + "] = " + a[i]);
            }
        }
    }
}
