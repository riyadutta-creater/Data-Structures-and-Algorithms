public class ReverseString1{
    public static void main(String[] args) {
        String str =  "Riya";
        char[] string = str.toCharArray();
        for(int i = string.length-1;i>=0;i--){
            System.out.print(string[i]);
        }
    }
}

//using toCharArray()
    
