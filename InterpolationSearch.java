package searching;


public class InterpolationSearch {
	public static int search_interpolation(int arr[],int low , int high ,int k)
	{
		while(low<=high) {
			int mid = low+(high-low)*(k-arr[low])/(arr[high]-arr[low]);
			if(arr[mid]==k)
			{
				return mid;
			}
			else if(arr[mid]<k)
			{
				return search_interpolation(arr, mid+1 , high , k);
			}
			else
			{
				return search_interpolation(arr, low , mid-1 , k);
			}
		}
		return -1;
	}

	
	public static void main(String[] args) {
		int arr[]= {2,34,67,98,145,289,301,556,623};
		int n = arr.length;
		int k = 301 ;
		int answer = search_interpolation(arr, 0 ,  n-1 , k);
		if(answer==-1)
			System.out.println("The required element is not present in the given array");
		else
			System.out.println("The required element is found at index " + answer);
		

	}

}
