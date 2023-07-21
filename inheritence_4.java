import java.util.*;
class employee_1()
{
	void getinfo()
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("ENTER THE SALARY : ");
		float salary=sc.nextInt();
		System.out.println("ENTER THE HOURS: ");
		float hours=sc.nextInt();
	}
	void add_slary() extends getinfo()
	{
		Scanner sc=new Scanner(System.in);
		int sla =0;
		if(sla<500)
		{
			System.out.println("my salary will be:");
			System.out.println(sla=sla+10);
		}
	}
	void add_work() extends getinfo()
	{
		if(hours>6)
		{
			System.out.println("MY WORKING SALARY WILL BE : ");
			System.out.println(sla=sla+5);
		}
	}
}
class employee 
{
	public static void main(String args[])
	{
		employee_1 res=new employee_1();
		res.add_slary();
		res.add_work();
	}
}
			
		
		
		
