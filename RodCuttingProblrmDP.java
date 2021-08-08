package dynamicProgramming;

public class RodCuttingProblrmDP {
	
	private static int rodCuttingProblem_Topdown(int[] lengtharray, int[] price, int L, int n) {
		int[][] dp = new int[n+1][L+1];
		int i,j;
		if (n == 0 || L == 0)
            dp[n][L] = 0;
	for (i = 1; i <= n; i++)
    {
        for (j = 1; j <= L; j++)
        {
//            if (i == 0 || j == 0)
//                dp[i][j] = 0;
            if (lengtharray[i - 1] <= j)
            	dp[i][j] = Math.max(price[i - 1]+ dp[i - 1][j - lengtharray[i - 1]],dp[i - 1][j]);
            else
            	dp[i][j] = dp[i - 1][j];
        }
    }
	return dp[n][L];
	}


	public static void main(String[] args) {
		int Lengtharray[] = {1,2,3,4,5,6,7,8};
		int price[] = {3,5,8,9,10,17,17,20};
		int L = 4;
		System.out.println(rodCuttingProblem_Topdown(Lengtharray ,price, L , Lengtharray.length));
	}

}
