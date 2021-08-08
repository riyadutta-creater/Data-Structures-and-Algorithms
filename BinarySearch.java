// Array must be sorted for Binary Search
// Java implementation of iterative Binary Search
package searching;


public class BinarySearch {
	
	public static int search_binary(int arr[],int k)
	{
		int n = arr.length;
		int start = 0 ,  end = n-1;
		while(start<=end) {
			int mid = (start+end)/2;
			if(arr[mid]==k)
			{
				return mid;
			}
			else if(arr[mid]<k)
			{
				start = mid+1;
			}
			else
			{
				end = mid-1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[]= {2,5,10,21,35,46,52,67,79,83,98};
		int k = 83;
		int answer = search_binary(arr,k);
		if(answer==-1)
			System.out.println("The required element is not present in the given array");
		else
			System.out.println("The required element is found at index " + answer);
	}
		
}

