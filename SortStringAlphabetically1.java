public class SortStringAlphabetically1 {
    public static void main(String[] args) {
        String str ="shubhanjan";
        char[] ch = str.toCharArray();
        for(int i=0;i<ch.length;i++){
            for(int j=i+1;j<ch.length;j++)
                if(ch[i]>ch[j]){
                    char temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
            }
        }
        System.out.println(String.valueOf(ch));
    }
}
//without using sort() method
