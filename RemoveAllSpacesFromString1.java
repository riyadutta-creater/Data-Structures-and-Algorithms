public class RemoveAllSpacesFromString1 {
    public static void main(String[] args) {
        String str = "  j    a    va s   ta   r   ";
        int j=0;
        char[] str1 = str.toCharArray();
        for(int i =0 ; i<str1.length;i++){
            if(str1[i]!=' '){
                str1[j] = str1[i];
                j++;
            }
        }
        System.out.println(String.valueOf(str1).substring(0, j));
     }
}

