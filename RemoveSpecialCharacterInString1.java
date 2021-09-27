public class RemoveSpecialCharacterInString1 {
    public static void main(String[] args) {
        //String str = "  j    a    va s   ta   r   ";
        String str2 = "#e*h(&hq!hj+";
        int j =0;
        char[] str1 = str2.toCharArray();
        for(int i =0;i<str1.length;i++){
            if(str1[i]>='A'&& str1[i]<='Z' || str1[i]>='a'&& str1[i]<='z'){
                str1[j] = str1[i];
                j++;
            }
        }
        System.out.println(String.valueOf(str1).substring(0,j));
    }
}
