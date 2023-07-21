import java.util.*;
class vowles_1
{
    public static void main(String args[])
	{
		Scanner sc = new Scanner(system.in);
		int i,n;
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			String strings = sc.nextLine();
		}
		char [] c=strings.toCharArray();
		
        for (i=0;i<strings.length();i++) 
		{
            int count = 0;
            for (j = i; j < strings.length(); j++) 
			{
                char ch = strings.charAt(j);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
				{
                    count++;
                }
            }
            if (count >=3) 
			{
                System.out.println(strings);
            }
        }
    }
}