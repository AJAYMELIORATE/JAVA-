import java.util.*;
class police
{
	public static void main(String args);
	{
		int n=4;
		int a[n]={'p','t','t','p','t'};
		int i;
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]!=a[j])
				{
					count ++;
				}
			}
		}
		System.out.println("%d" +count) ;
	}
}
	
