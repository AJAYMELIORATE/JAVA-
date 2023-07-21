import java.util.ArrayList;
import java.util.Scanner;

class array_insertion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();

        ArrayList<Integer> arr = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextInt());
        }

        if (q == 1) {
            int p = scanner.nextInt();
            int r = scanner.nextInt();
            arr.add(p, r);
        } else if (q == 2) {
            int p = scanner.nextInt();
            System.out.println(arr.get(p));
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
