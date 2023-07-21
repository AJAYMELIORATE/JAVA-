import java.util.*;
class pattern 
{
    public static void main(String args[])
    {
        int i,j,k;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(i=0;i<n*2;i++)
        {
            for(j=i+1;j<n*2;j++)
            {
                System.out.println("* ");
            }
        }
        
    }
}