public class ValidatePassword {
    public static int Valid(String str){
        int number =0 ;
        int capital =0;
        if(str.length()<4){
            return 0;
        }
        if(str.charAt(0)>=48 && str.charAt(0)<=57){
            return 0;
        }
        for(int i =0 ; i<str.length();i++){
            if(str.charAt(i) == ' ' || str.charAt(i) == '/' ){
                return 0;
            }
            else if(str.charAt(i)>=48 && str.charAt(i)<=57){
                number =1;
            }
            else if(str.charAt(i)>=65 && str.charAt(i)<=90){
                capital =1;
            }
        }
        return number & capital;
    }
    public static void main(String[] args ){
        String str = "acd34 4rf";
        int answer = Valid(str);
        System.out.println(answer);
    }
}
