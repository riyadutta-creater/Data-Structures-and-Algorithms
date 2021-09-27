import java.util.HashSet;

public class RemoveDuplicateCharacter4 {
    public static void main(String[] args) {
        String str = "shubhanjan";
        StringBuffer sb1 = new StringBuffer();
        HashSet<Character> set= new HashSet<>();
        for(int i =0;i<str.length();i++){
            set.add(str.charAt(i));
        }
        for(Character ch : set ){
            sb1.append(ch);
        }
        System.out.println(sb1);
    }
}
