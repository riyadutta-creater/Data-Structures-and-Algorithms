public class UserId {
    public static String GenerateUserId(String str1,String str2,int pincode, int n){
        String longerName ="";
		String smallerName = "";
        if (str1.length() != str2.length()) {
            if (str1.length() < str2.length()) {
                smallerName = str1;
                longerName = str2;
            } 
            else {
                longerName = str1;
                smallerName = str2;
            }
        }
        else{
            for(int i=0;i<str1.length();i++){
                if(str1.charAt(i)>str2.charAt(i)){
                    smallerName = str1;
                    longerName = str2;
                }
                else{
                    longerName = str1;
                    smallerName = str2;
                }
            }
        }
    String pincode1 = pincode + " ";
    int r = pincode1.length()-1;
    return smallerName.charAt(0) + longerName + pincode1.charAt(n-1) + pincode1.charAt(r-n);
}

    public static void main(String[] args) {
        String str1 = "Dutta";
        String str2 = "Barai";
        int pincode = 743128;
        int n = 3;
        System.out.println(GenerateUserId(str1, str2, pincode, n));
    }
}
