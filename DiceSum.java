public class DiceSum {
    public static void main(String[] args) {
        int sum = 8;
        int count =0;
        for(int i = 1 ; i<=6 ;i++){
            for(int j = 1 ; j<=6 ; j++){
                if(i+j== sum){
                    count ++;
                }
            }
        }
        System.out.println(count);
    }
}
