/**
 * 
 */
package heap;

/**
 * @author indian
 *
 */
public class MinHeapSort {

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
		build_Min_Heap(arr, length);
		for(int i = arr.length-1; i > 0; i--)
		{
			swap(arr , 0 , i);
			heapify(arr , 0 , i);
		}
	}
	
	public static void build_Min_Heap(int arr[],int length)
	{
		length= arr.length;
		for(int i = (length/2) -1 ; i>=0 ; i--)
		{
			heapify(arr , i , length);
		}
		System.out.println("Min Heap: ");
	    for (int i = 0; i < length; i++) 
	    {
	         System.out.print(arr[i] + " ");
	    }
	} 
	
	public static void heapify(int[] arr , int i , int length)
	{
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		int smallest; 
		
		if(left<length && arr[left] < arr[i])
		{
			smallest= left;
		}
		else
		{
			smallest=i;
		}
		if(right<length && arr[right] < arr[smallest])
		{
			smallest = right;
		}
		
		if(smallest!= i)
		{
			swap(arr , i , smallest);
			heapify(arr , smallest , length);

		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {92 , 23 ,11 ,74 ,1 ,50 ,5};
		int length = arr.length;
		Heap_Sort(arr,length);
		System.out.println("\nSorted Array using Min Heap Sort :");
		for(int i = 0 ; i< arr.length ;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
