package dynamicProgramming;

public class EggDroppingProblemRecursion {
	
	public static int eggDroppingProblem_Recursion(int egg , int floor) {
		if(floor==0||floor==1) {
			return floor;
		}
		if(egg==1) {
			return floor;
		}
		int min = Integer.MAX_VALUE;
		for(int k=1;k<=floor;k++) {
			int ans = 1 + Math.max(eggDroppingProblem_Recursion(egg-1,k-1),eggDroppingProblem_Recursion(egg,floor-k));
			min = Math.min(min, ans);
		}
		return min;
	}

	public static void main(String[] args) {
		int egg =2;
		int floor=10;
		System.out.println(eggDroppingProblem_Recursion(egg , floor));
	}

}
