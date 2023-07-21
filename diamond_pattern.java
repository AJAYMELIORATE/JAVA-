import java.util.*;

class diamond_pattern 
{
    public static void main(String args[]) 
    {
        int n=13;

        int i,j,s;

        for (i=1;i<n;i++)
        {
            for (s=1;s<=n-i;s++)
            {
                System.out.print(" ");
            }
            for (j=1;j<=i;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for (i=n;i>0;i--)
        {
            for (s=n;s>i;s--)
            {
                System.out.print(" ");
            }
            for (j=1;j<=i;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        
    }
}