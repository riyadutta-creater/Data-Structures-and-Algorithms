public class SumPair{
    public static void Pair(int arr[] , int sum) {
        int low = 0;
        int high = arr.length-1;
        while(low<high){
            if(arr[low]+arr[high]<sum){
                low++;
            }
            else if(arr[low]+arr[high]>sum){
                high--;
            }
            else if(arr[low]+arr[high]==sum){
                System.out.println(arr[low] +" , " +arr[high]);
                low++;
                high--;
            }
        }
    }
    public static void main(String[] args) {
        int sum = 9;
        int arr[] = {1,2,3,4,5,6,7};
        Pair(arr, sum);

    }
}