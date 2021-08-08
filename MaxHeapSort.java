/**
 * 
 */
package heap;

/**
 * @author indian
 *
 */
public class MaxHeapSort {

	/**
	 * @param args
	 */
	
	public static void swap(int[] arr ,int i, int j) {
		// TODO Auto-generated method stub
		int t = arr[i];
		arr[i] = arr[j];
		arr[j] = t;
	}
	
	public static void Heap_Sort(int arr[] , int length)
	{
		build_Max_Heap(arr, length);
		for(int i = arr.length-1; i > 0; i--)
		{
			swap(arr , 0 , i);
			heapify(arr , 0 , i);
		}
	}
	
	public static void build_Max_Heap(int arr[],int length)
	{
		length= arr.length;
		for(int i = (length/2) -1 ; i>=0 ; i--)
		{
			heapify(arr , i , length);
		}
		System.out.println("Max Heap: ");
	    for (int i = 0; i < length; i++) 
	    {
	         System.out.print(arr[i] + " ");
	    }
	} 
	
	public static void heapify(int[] arr , int i , int length)
	{
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		int largest; 
		
		if(left<length && arr[left] > arr[i])
		{
			largest= left;
		}
		else
		{
			largest=i;
		}
		if(right<length && arr[right] > arr[largest])
		{
			largest = right;
		}
		
		if(largest!= i)
		{
			swap(arr , i , largest);
			heapify(arr , largest , length);

		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {10,11,7,15,13,20};
		int length = arr.length;
		Heap_Sort(arr,length);
		System.out.println("\nSorted Array using Heap Sort :");
		for(int i = 0 ; i< arr.length ;i++)
		{
			System.out.print(arr[i]+" ");
		}
    }
}
