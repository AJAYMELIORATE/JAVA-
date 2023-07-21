// polymorphisum time -method overloading 
class overloading
{
	void poly(int i)
	{
		System.out.print("HeLLO");
	}
	void poly(double f)
	{
		System.out.println("WELCOME");
	}
	void poly(String s)
	{
		System.out.println("java");
	}
	public static void main(String args[])
	{
		overload obj=new overload(c);
		obj.poly(4,4);
		obj.poly(5);
		obj.poly("ABC");
	}
}