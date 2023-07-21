import java.util.*;
class VowlesCount {
    public static void main(String[] args) 
	{
        String[] strings = {"I","Love","Programming","and","Ai"};

        for (String str : strings) 
		{
            int count = 0;
            str = str.toLowerCase();
            for (int i = 0; i < str.length(); i++) 
			{
                char ch = str.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
				{
                    count++;
                }
            }
            if (count > 3) 
			{
                System.out.println(str);
            }
        }
    }
}