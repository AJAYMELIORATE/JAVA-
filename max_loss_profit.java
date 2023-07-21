import java.util.*;

class max_loss_profit 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) 
		{
            prices[i] = sc.nextInt();
        }
        int max_loss = maximum_loss(prices);
        System.out.println(max_loss);
    }
    
    public static int maximum_loss(int[] prices) 
	{
		int n = prices.length;
        int max_price = prices[n-1];
        int max_loss = 0;
        for (int i = n-2; i >= 0; i--) 
		{
            if (prices[i] > max_price) 
			{
                max_price = prices[i];
            } 
			else 
			{
                int loss = max_price - prices[i];
                if (loss > max_loss) 
				{
                    max_loss = loss;
                }
            }
        }
        return max_loss;
    }
}
