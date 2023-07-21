import java.util.*;
class duck_num_java
{
	public static void main(String args [])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i;
		int []a=new int [n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		if(a[0]==0)
		{
			System.out.println("IT IS NOT AN DUCK NUMBER");
		}
		else
		{
			System.out.println("THE GIVEN NUMBER IS AN DUCK NUMBER");
		}
		
	}
}
			