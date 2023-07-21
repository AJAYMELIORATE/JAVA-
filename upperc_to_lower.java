import java.util.*;

class upperc_to_lower
{
	public static void main(String args[])
	{
    	String st;
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string which is to be converted to lowercase and uppercase");
	 	st=sc.nextLine();
		char str[]=st.toCharArray();
    		for(i=0;i<str.length;i++)
    		{
        		if(str[i]>='A' && str[i]<='Z')
        		{ 
        			str[i]=(char)((int)str[i]+32);
        		}
				else if(str[i]>='a' && str[i]<='z')
				{
					str[i]=(char)((int)str[i]-32);
				}
    		}
    		System.out.println("string which is to be converted to lowercase and uppercase is");
		    for(i=0;i<str.length;i++)
			{
    			System.out.print(str[i]);
			}
	}
}