public class zadanie4 {
    public static void main(String[] args) {
        int[] a = {1, 5, 3, 5, 7, 9};
        int[] allowed = {5, 7};

        int count = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < allowed.length; j++) {
                if (a[i] == allowed[j]) {
                    count++;
                    break;
                }
            }
        }

        System.out.println("Количество разрешённых элементов: " + count);
    }
}
