package dynamicProgramming;

public class CoinChangeProblem_MinimumNumberOfWays {

	private static int coinChangeProblemMiniimunNumberOfWays_TopDown(int[] coin, int n, int sum) {
		int[][] dp = new int[n+1][sum+1];
		int i,j;
		for(i=1;i<=n;i++) {
			dp[i][0] = 0;
		}
		for(j=0;j<=sum;j++) {
			dp[0][j] = Integer.MAX_VALUE-1;
		}
		for(j=1;j<=sum;j++) {
			if(j%coin[0]==0) 
				dp[1][j] = j%coin[0];
			else
				dp[1][j] = Integer.MAX_VALUE-1;
		}
		for(i=1;i<=n;i++) {
			for(j=1;j<=sum;j++) {
				if(coin[i-1]<=j) {
					dp[i][j] = Math.min(dp[i][j-coin[i-1]]+1 , dp[i-1][j]);
				}
				else {
					dp[i][j] = dp[i-1][j];
				}
			}
		}
		return dp[n][sum];
	}

	public static void main(String[] args) {
		int coin[] = {1,2,5};
		int sum = 11;
		int n = coin.length;
		System.out.println(coinChangeProblemMiniimunNumberOfWays_TopDown(coin,n,sum));  
		

	}

}
