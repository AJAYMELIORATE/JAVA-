import java.util.*;
public class string_divider 
{
    public static void main(String[] args) 
	{
        String str = "aaabbbcccddd";
        int len = str.length();
        int s = len / 4;

        for (int i = 0; i < len; i ++) 
		{
            String part = str.substring(i, i + s);
            System.out.println(part);
        }
    }
}


	