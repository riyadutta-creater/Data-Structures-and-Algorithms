// indexOf method

public class RemoveDuplicateCharacter3 {
    public static void main(String[] args) {
        String str = "programming";
        StringBuffer sb1 = new StringBuffer();
        for(int i=0;i<str.length();i++){
            char str1 = str.charAt(i) ;
            int index = str.indexOf(str1,i+1);
            if(index==-1){
                sb1.append(str1);
            }
        }
        System.out.println(sb1);
    }
}
