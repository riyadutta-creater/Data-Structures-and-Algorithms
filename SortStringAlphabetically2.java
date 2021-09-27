import java.util.Arrays;

public class SortStringAlphabetically2 {
    public static void main(String[] args) {
        String str ="shubhanjan";
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        System.out.println(String.valueOf(ch));
    }
}
