import java.util.*;
public class matrix
{

    public static void main(String[] args)
    {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int a_len = sc.nextInt();
        int arr[]=new int[a_len];   
        System.out.println("Enter the elements of an array: ");
        for (int i = 0; i < a_len; i++) 
		{
            arr[i] = sc.nextInt();
        }

        System.out.println(" ");
        int smallest = arr[0];
        for (int i = 0; i < a_len - 1; i++)
        {

            if (smallest > arr[i + 1]) 
			{
                smallest = arr[i + 1];
            }
        }
        System.out.println("Smallest number in array is: " + smallest);
    }
}