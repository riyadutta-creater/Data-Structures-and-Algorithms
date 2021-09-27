public class LeaderSum1 {
    public static void main(String[] args) {
        
        int arr[] = {11,43,23,88,95,2,5};
        int max = arr[arr.length-1];
        int sum = arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>max){
                max = arr[i];
                sum = sum + max;
            }
        }
        System.out.println(sum);
    }
}

//TIME COMPLEXITY :- O(N)
