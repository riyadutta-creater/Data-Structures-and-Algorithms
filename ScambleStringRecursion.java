package dynamicProgramming;

public class ScambleStringRecursion {
	
	public static boolean isScambleString(String s1 , String s2) {
		if(s1.length() != s2.length()) {
			return false;
		}
		if(s1.isEmpty() && s2.isEmpty()) {
			return true;
		}
		if(s1.equals(s2)) {
			return true;
		}
		if(s1.length()<=1) {
			return false;
		}
		int n = s1.length();
		for(int i=1;i<n;i++) {
			if(isScambleString(s1.substring(0,i),s2.substring(n-i , n)) && isScambleString(s1.substring(i,n),s2.substring(0,n-i))){
				return true;
			}
			if(isScambleString(s1.substring(0,i),s2.substring(0,i)) && isScambleString(s1.substring(i,n),s2.substring(i,n))){
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		String s1 = "great";
		String s2 = "rgate";
		System.out.println(isScambleString(s1 , s2));

	}

}
