public class ReplaceCharacterWithItsOccurence {
    public static void main(String[] args) {
        String str ="I want to work in Google someday";
        String reverseResult = "";
        String[] word = str.split(" ");
        for(String words : word ){
            String reverseword= "";
            for(int i= words.length()-1;i>=0;i--){
                reverseword = reverseword + words.charAt(i);
            } 
            reverseResult = reverseResult + reverseword + " ";
        }
        System.out.println(reverseResult);
    }
}
