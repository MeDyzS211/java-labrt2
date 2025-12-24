public class zadanie5 {
    public static void main(String[] args) {
        int[] a = {1, 5, 3, 7, 9};
        int[] allowed = {5, 7};

        System.out.println("Неразрешённые элементы:");
        for (int i = 0; i < a.length; i++) {
            boolean ok = false;
            for (int j = 0; j < allowed.length; j++) {
                if (a[i] == allowed[j]) {
                    ok = true;
                }
            }
            if (!ok) {
                System.out.print(a[i] + " ");
            }
        }
    }
}
