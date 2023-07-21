import java.util.*;
class string_element_swappping  //output logic mistake 

{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in); 
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		int len1=str1.length();
		int len2=str2.length();		
		int i,j;
		char temp;
		char []charArray1=str1.toCharArray();
		char []charArray2=str2.toCharArray();
		for(i=0;i<len2;i++)
		{
			for(j=i+1;j<len2;j++)
			{
				if(charArray1==charArray2)
				{
					temp=charArray1[i];
				    charArray1[i]=charArray1[j];
				    charArray2[j]=temp;
				}
			}
			
		}
		if(charArray1==charArray2)
		{
			System.out.println("NO");
		}
		else
		{
			System.out.println("YES");
		}
	}
}
		
		
           