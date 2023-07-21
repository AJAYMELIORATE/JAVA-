import java.util.*;
class getmulti
{
	static int getmulti(int m)
	temp=0;
	while(m>0)
	{
		temp=m%10;
		int m=temp * m;
		m=m/10;
	}
public static void main(String args[])

	int m;
	System.out.println(getmulti(m));

}