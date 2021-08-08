package dynamicProgramming;

public class Cutting_Rod_Recursion {
	
	public static int rodCuttingProblem(int[]Lengtharray ,int[]price, int L , int n) {
		if(L==0 || n==0) {
			return 0;
		}
		int maxValue = Integer.MIN_VALUE;
		for(int i=0 ; i<n ; i++) {
			maxValue = Math.max(maxValue , price[i] + rodCuttingProblem(Lengtharray , price, L , (n-i-1)));
		}
		return maxValue;
	}

	public static void main(String[] args) {
		int Lengtharray[] = {1,2,3,4,5,6,7,8};
		int price[] = {3,5,8,9,10,17,17,20};
		System.out.println(rodCuttingProblem(Lengtharray ,price, 4 , Lengtharray.length));

	}

}
