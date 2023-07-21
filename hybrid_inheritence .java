//HYBRID INHERITENCE 
class 
{
	int e=11;
}
class c extends b;
{
	int c =9;
}
clas d extends b
{
	int d=8;
}
class e extends c;
{
	int e=11;
}
class simple_array
{
	public static void main(String args [])
	{
		e obj =new e()
		System.out.println(obj.e);
		System.out.println(obj.c);
		System.out.println(obj.b);
	}
}