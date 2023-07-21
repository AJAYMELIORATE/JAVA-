class fench_colour 
{

	static long countways(int n, int k)
	{
		int total = k;
		int mod = 100;
		int same = 0, diff = k;	
		for (int i = 2; i <= n; i++) 
		{		
			same = diff;	
			diff = total * (k - 1);
			diff = diff % mod;		
			total = (same + diff) % mod;
		}
		return total;
	}	
	public static void main(String[] args)
	{
		int n = 7, k = 2;
		System.out.println(countways(n, k));
	}
}


