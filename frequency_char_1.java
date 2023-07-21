import java.util.Scanner;

class FrequencyChar1 {
    public static void main(String args[]) {
        int i, j, k, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Target value:");
        int target = sc.nextInt();
        System.out.println("ENTER THE NUMBER SIZE TO GET IN THE ARRAY:");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                for (k = j + 1; k < n; k++) {
                    if (a[i] + a[j] + a[k] <= target) 
                    {
                        count++;
                    }
                }
            }
        }
        System.out.println("Count: " + count);
    }
}
