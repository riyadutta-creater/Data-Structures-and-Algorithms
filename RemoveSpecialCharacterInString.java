public class RemoveSpecialCharacterInString{
    public static void main(String[] args) {
        String str = "#r&*i@$!y%^&#a";
        String result = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(result);
        }
    }
