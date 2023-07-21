import java.util.Scanner;
class hallow_diamond_java
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        int i, j, space = 1;

        for (j = 1; j <= rows; j++) 
		{
            for (i = 1; i <= rows - j; i++)
			{
                System.out.print(" ");
            }
            System.out.print("*");
            for (i = 1; i < space; i++) 
			{
                System.out.print(" ");
            }
            if (j != 1) 
			{
                System.out.print("*");
            }
            System.out.println();
            space += 2;
        }

        space = rows * 2 - 3;
        for (j = 1; j <= rows - 1; j++) 
		{
            for (i = 1; i <= j; i++) 
			{
                System.out.print(" ");
            }
            System.out.print("*");
            for (i = 1; i < space; i++) 
			{
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
            space -= 2;
        }
    }
}
