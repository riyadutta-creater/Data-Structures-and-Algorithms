package dynamicProgramming;

public class KnapsackProblem {
	
	private static int knapsackProblemRecursion01(int wt[] , int value[] , int W , int n) {
		if(W == 0 || n == 0)
			return 0;
		if(W>=wt[n-1]) {
			return Math.max(knapsackProblemRecursion01(wt , value , W-wt[n-1] , n-1)+value[n-1], knapsackProblemRecursion01(wt , value , W , n-1));
		}
		else {
			return knapsackProblemRecursion01(wt, value , W , n-1);
		}
		
	}

	public static void main(String[] args) {
		int wt[]= {1,3,4,5};
		int value[] = {1,4,5,7};
		System.out.println("Result : " +knapsackProblemRecursion01(wt ,value, 7 , wt.length));
	}

}
