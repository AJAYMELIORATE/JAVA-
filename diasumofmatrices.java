import java.util.*;


class diagonal_matrix_sum 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER MATRIX SIZE :");

        int n=sc.nextInt();

        int a[][] = new int[10][10];
        int b[][] = new int[10][10];
        
        int i,j;
        System.out.println("ENTER ELEMENTS FOR 1st MATRIX : ");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }

        System.out.println("ENTER ELEMENTS FOR 2st MATRIX : ");

        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }

        sc.close();

        int sum=0;

        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==j)
                {
                    sum+=a[i][j];
                }
            }
        }

        int sum1=0;

        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i+j==n)
                {
                    sum1+=b[i][j];
                }
            }
        }

        //PRINTING
        System.out.println("1st MATRIX : ");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.println(a[i][j]);
            }
        }

        System.out.println("2nd MATRIX : ");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.println(b[i][j]);
            }
        }

        System.out.println("SUM OF LEFT TO RIGHT MATRIX A is "+sum);

        System.out.println("SUM OF RIGHT TO LEFT MATRIX B is "+sum1);
    }
    
}