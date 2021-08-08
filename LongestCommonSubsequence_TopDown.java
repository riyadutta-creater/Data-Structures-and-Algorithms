package dynamicProgramming;

public class LongestCommonSubsequence_TopDown {
	
	public static int lcs(String string1 , String string2 , int n , int m) {
		int dp[][]= new int [n+1][m+1];
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(i==0||j==0) {
					dp[i][j]=0;
				}
				if(string1.charAt(i-1)==string2.charAt(j-1)) {
					dp[i][j] = 1 +dp[i-1][j-1];
				}
				else {
					dp[i][j] = Math.max(dp[i][j-1] ,dp[i-1][j]);
				}
			}
		}
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n;j++) {
//				if(string1.charAt(i-1)==string2.charAt(j-1)) {
//					dp[i][j] = 1 +dp[i-1][j-1];
//				}
//				else {
//					dp[i][j] = Math.max(dp[i][j-1] ,dp[i-1][j]);
//				}
//			}
//		}
		return dp[n][m];
		
	}

	public static void main(String[] args) {
		String string1 = "ABCDGH";
		String string2 = "AEDFHR";
		int n = string1.length();
		int m = string2.length();
		System.out.println(lcs(string1 , string2 , n , m));
		

	}

}
