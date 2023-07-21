import java.util.Scanner;
class vowles_2
{
    public static void main(String [] args )
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
       
        String []c=s.split(" ");
        for(int i=0;i<c.length;i++)
        {
            String b=c[i];
            int count=0;
            for(int j=0; j<b.length();j++)
            {
                if(b.charAt(j)=='a' || b.charAt(j)=='e'|| b.charAt(j)=='i' ||b.charAt(j)=='o'||b.charAt(j)=='u')
                {
                    count++;
                }
            }
            if(count>=3)
            {
                System.out.print(b+" ");
            }
        }
    }
}