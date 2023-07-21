import java.util.*;
import java.io.*;

class neckles_program 
{
    public static void main(String args[]) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N:");
        int N = sc.nextInt();
        System.out.println("Enter L:");
        int L = sc.nextInt();
        System.out.println("Enter R:");
        int R = sc.nextInt();
       
        int[][] dp = new int[N+1][R+1];
        for (int j = L; j <= R; j++) 
		{
            dp[1][j] = 1;
        }
        for (int i = 2; i <= N; i++) 
		{
            for (int j = L; j <= R; j++) 
			{
                for (int k = L; k < j; k++) 
				{
                    dp[i][j] += dp[i-1][k];
                }
            }
        }
        int count = 0;
        for (int j = L; j <= R; j++) 
		{
            count += dp[N][j];
        }
        System.out.println("Total count of necklaces: " + count);
    }
}
