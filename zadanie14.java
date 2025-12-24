public class Task14 {
    public static void main(String[] args) {
        int[] a = {1, 2, 0, 4, 5};

        int sum = 0;
        int index = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                index = i;
                break;
            }
        }

        for (int i = index + 1; i < a.length; i++) {
            sum += a[i];
        }

        System.out.println("Номер: " + index);
        System.out.println("Сумма: " + sum);
    }
}
