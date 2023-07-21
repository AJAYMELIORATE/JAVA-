import java.util.*;
class partitioning
{
    public static void main(String args[])
{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = sc.nextInt();
        int a[] = new int[n+1];
        a[0] = 1;
		int i=1,j=i;
        for (i=1;i<=n;i++)
		{
            for (j=i;j<=n;j++)
			{
                a[j] =a[j]+a[j-i];
            }
        }
        System.out.println("Number of ways = " +a[n]);
    }
}