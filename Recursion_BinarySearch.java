/**
 * 
 */
package searching;

/**
 * @author indian
 *
 */
public class Recursion_BinarySearch {

	public static int search_binary(int arr[],int start , int end ,int k)
	{
		while(start<=end) {
			int mid = start+(end-start)/2;
			if(arr[mid]==k)
			{
				return mid;
			}
			else if(arr[mid]<k)
			{
				return search_binary(arr, mid+1 , end , k);
			}
			else
			{
				return search_binary(arr, start , mid-1 , k);
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[]= {1,11,22,33,44,55,66,77,88,99,100};
		int n = arr.length;
		int k = 66;
		int answer = search_binary(arr, 0 ,  n-1 , k);
		if(answer==-1)
			System.out.println("The required element is not present in the given array");
		else
			System.out.println("The required element is found at index " + answer);
	}
}
