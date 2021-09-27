public class LeaderSum {

    public static void main(String args[]){
        int arr[] = {11,43,23,88,95,2,5};
        int n = arr.length;
        int j , sum = 0;
        for(int i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(arr[i]<arr[j]){
                    break;
                }
            }
            if(j==n){
                sum = sum + arr[i];
            }
        }
        System.out.println(sum);
    }
}
//TIME COMPLEXITY :- O(N^2)