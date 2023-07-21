import java.util.*;
class square_and_concadenate
{
	public static void main(String args [])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum;
		sum=n*n;
		System.out.println(sum);
		int i,j,add;
		if(n<100)
		{
			i=i%100;
			j=j/100;
			add=i+j;
		}
		else if (n>100&&n<1000)
		{
			i=i%1000;
			j=j/1000;
			add=i+j;
		}
		System.out.println(add);
		
		
			
	}
}
}