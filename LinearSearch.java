// Array may be sorted or unsorted for Linear Search

package searching;


public class LinearSearch {
	
	public static int search(int arr[],int k)
	{
		int n = arr.length;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==k)
				return  i;
		}
        return -1;
	}
	public static void main(String[] args) {
		int arr[]= {12,34,7,49,54,90,23,2,66,5,10};
		int k = 23;
		int answer = search(arr,k);
		if(answer==-1)
			System.out.println("The required element is not present in the given array");
		else
			System.out.println("The element 23 is found at index " + answer);
	}

}
