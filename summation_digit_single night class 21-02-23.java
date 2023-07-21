import java.util.*;
class summation_digit_single
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rem,sum=0,i;
		for(i=0;i<=n;i++)
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
			
		}
		sum=sum+n;
		int final_sum=0,re;
		re=sum%10;
		sum=sum/10;
		final_sum=re+sum;
		System.out.println("%d" +final_sum);

		
	}
}
