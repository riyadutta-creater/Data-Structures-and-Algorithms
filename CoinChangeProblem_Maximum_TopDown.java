package dynamicProgramming;

public class CoinChangeProblem_Maximum_TopDown {
	
	private static int coinChangeProblemMaximunNumberOfWays_TopDown(int[] coin, int n, int sum) {
		int[][] dp = new int[n+1][sum+1];
		int i,j;
		for(i=0;i<=n;i++) {
			dp[i][0] = 1;
		}
		for(j=1;j<=sum;j++) {
			dp[0][j] = 0;
		}
		for(i=1;i<=n;i++) {
			for(j=1;j<=sum;j++) {
				if(coin[i-1]<=j) {
					dp[i][j] = dp[i][j-coin[i-1]]+ dp[i-1][j];
				}
				else {
					dp[i][j] = dp[i-1][j];
				}
			}
		}
 
		return dp[n][sum];
	}

	public static void main(String[] args) {
		int coin[] = {2,4,1};
		int sum = 5;
		int n = coin.length;
		System.out.println(coinChangeProblemMaximunNumberOfWays_TopDown(coin,n,sum));  
		

	}

}