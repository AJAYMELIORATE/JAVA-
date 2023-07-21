import java.util.*;
class constructor_1
{
	int modelyear;
	int modelnum;
	public constructor_1 (int year,int model)
	{
		modelyear=year;
		modelnum=model;
	}
	public static void main(String[] args) 
	{
		constructor_1 myCar = new constructor_1(1969, 2);
		System.out.println(myCar.modelyear + " " + myCar.modelnum);
	}
		
}
		