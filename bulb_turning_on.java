import java.util.*;

class bulb_turning_on 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] bulbs = new int[n];
        boolean[] needsToBeFlipped = new boolean[n];
        int count = 0;

        for (int i = 0; i < n; i++) 
		{
            bulbs[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) 
		{
            if (bulbs[i] == 0 && !needsToBeFlipped[i]) 
			{
                count++;
                needsToBeFlipped[i] = true;
            }
            if (i < n - 1) 
			{
                needsToBeFlipped[i+1] = needsToBeFlipped[i+1] ^ needsToBeFlipped[i];
            }
        }

        System.out.println(count);
    }
}
