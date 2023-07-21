import java.util.Scanner;

public class thread_avg_min_max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        AverageThread avgThread = new AverageThread(arr);
        MaxThread maxThread = new MaxThread(arr);
        MinThread minThread = new MinThread(arr);
        avgThread.start();
        maxThread.start();
        minThread.start();
    }
}

class AverageThread extends Thread {
    int[] arr;

    public AverageThread(int[] arr) {
        this.arr = arr;
    }

    public void run() {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Average: " + (sum / arr.length));
    }
}

class MaxThread extends Thread {
    int[] arr;

    public MaxThread(int[] arr) {
        this.arr = arr;
    }

    public void run() {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum: " + max);
    }
}

class MinThread extends Thread {
    int[] arr;

    public MinThread(int[] arr) {
        this.arr = arr;
    }

    public void run() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum: " + min);
    }
}
