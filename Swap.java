public class Swap {
    public static void main(String[] args) {
        int n =5;
        int arr[]  = { 1,2,3,4,5};
        int temp =arr[0];
        arr[0]= arr[n-1];
        arr[n-1]=temp;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

