import java.util.*;
class Digit {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        num = sc.nextInt();
        int digit = num % 1000;
        int greatestNumber = digit;
        while (num > 0) 
		{
            digit = num % 1000;
            if (digit >=greatestNumber && digit < 1000) 
			{
                greatestNumber = digit;
            }
            num /= 10;
        }
        System.out.println(greatestNumber);
    }
}