import java.util.*;

class sub_array_2
{
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
		{
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        for (int i = 0; i <= n - k; i++) 
		{ // loop to generate subarrays of length k
            int max = arr[i];
            for (int j = i + 1; j < i + k; j++) 
			{ // loop to find maximum element in subarray
                if (arr[j] > max) 
				{
                    max = arr[j];
                }
            }
            System.out.print(max + " ");
        }
    }
}