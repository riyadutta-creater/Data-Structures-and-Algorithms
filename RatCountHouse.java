public class RatCountHouse {
    public static int Food(int r , int unit , int arr[]) {
        if(arr == null){
            return -1;
        }
        int total_food = r * unit;
        int sum =0;
        int i =0;
        for ( i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if(sum>=total_food){
                break;
            }
        }
        if(total_food>sum){
            return 0;
        }
        return i+1;
    }
    public static void main(String[] args) {
        int r = 7;
        int unit = 2;
        int arr[] ={2 , 8 , 3 ,5,2,6,1,9};
        System.out.println(Food(r, unit, arr));
    }
}
