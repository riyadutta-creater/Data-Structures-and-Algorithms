public class RemoveDuplicateCharacter1 {
    public static void main(String[] args) {
        String str = "programming";
        char[] str1 = str.toCharArray();
        StringBuffer sb1 = new StringBuffer();
        int i =0;
        for(i =0; i< str1.length;i++){
            int count = 0;
            for(int j =i+1;j<str1.length;j++){
                if(str1[i]==str1[j]){
                    count++;
                    break;
                }
            }
            if(count==0){
                sb1.append(str1[i]);
            }
        }
        System.out.println(sb1);
    }

}

// using toCharArray() 