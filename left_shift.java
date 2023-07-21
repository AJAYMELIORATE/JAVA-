import java.util.*;
class left_shift
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE ARRAY SIZE: ");
		int n=sc.nextInt();
		System.out.println("ENTER YOUR LEFT SHIFT VALUE : ");
		int shift_element=sc.nextInt();
		int [] a=new int [n];
		int [] b=new int [n];
		int i;
		for (i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int j=0;
        for(i=shift_element;i<n;i++)
		{
			b[j]=a[i];
			j++;
		}
		b[shift_element+1]=a[0];
		b[shift_element+2]=a[1];
        for(i=0;i<n;i++)
		{
			a[i]=b[i];
		}
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}