
class CoinChange {

	
	static int count(int coins[], int n, int sum)
	{

		// If sum is 0 then there is 1 solution 
		if (sum == 0)
			return 1;

		// If sum is less than 0 then return 0
		
		if (sum < 0)
			return 0;

		// If there are no coins and sum is greater than 0 then return 0
		
		if (n <= 0)
			return 0;

		
		return count(coins, n - 1, sum)+ count(coins, n, sum - coins[n - 1]);
	}


	public static void main(String args[])
	{
		int coins[] = {2,3,5,6};
		int n = coins.length;
		int sum=10;

		System.out.println("coin combination:  "+count(coins, n, sum));
	}
}


