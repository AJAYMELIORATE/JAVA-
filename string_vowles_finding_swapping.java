import java.util.*;
class string_vowles_finding_swapping
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine ();
		char []letter= s.toCharArray();
		int len=letter.length;
		int i,j;
		char[] count=new char[len];
		for(i=0;i<len;i++)
		{
			for(j=i+1;j<len;j++)
			{
				if((letter[i]=='a'||letter[i]=='e'||letter[i]=='i'||letter[i]=='o'||letter[i]=='u')&&(letter[j]=='a'||letter[j]=='e'||letter[j]=='i'||letter[j]=='o'||letter[j]=='u'))
				{
					count[i]=letter[j];
					letter[j]=letter[i];
					letter[i]=count[j];
					count[i]=letter[i];
				}
			}
		}
		System.out.println(new String(letter[i]));
	}
}
					
				
