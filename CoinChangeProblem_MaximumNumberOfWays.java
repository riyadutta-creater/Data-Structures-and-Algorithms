package dynamicProgramming;

public class CoinChangeProblem_MaximumNumberOfWays {
	
	private static int coinChangeProblemMaximunNumberOfWays_Recursion(int[] coin, int n ,int sum) {
		if(n==0 && sum==0) {
			return 1;
		}
		if(n==0 && sum>=1) {
			return 0;
		}
		if(n>=1 && sum==0) {
			return 1;
		}
		if(sum>=coin[n-1]) {
			return coinChangeProblemMaximunNumberOfWays_Recursion(coin , n , sum-coin[n-1])+ coinChangeProblemMaximunNumberOfWays_Recursion(coin,n-1,sum);
		}
		else {
			return  coinChangeProblemMaximunNumberOfWays_Recursion(coin,n-1,sum);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int coin[] = {2,5,3,6};
		int sum = 10;
		System.out.println(coinChangeProblemMaximunNumberOfWays_Recursion(coin,coin.length,sum));  
		
	}
}
