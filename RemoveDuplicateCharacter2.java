public class RemoveDuplicateCharacter2 {
    public static void main(String[] args) {
        String str = "programming";
        StringBuffer sb1 = new StringBuffer();
        str.chars().distinct().forEach(stringbuilder->sb1.append((char) stringbuilder));
        System.out.println(sb1);
    }
}

// using java 8