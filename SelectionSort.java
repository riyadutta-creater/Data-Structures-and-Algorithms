package sorting;

public class SelectionSort {
	public static void selectionSort(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) 
		{
			int min_element = i;
			for(int j=i+1;j<n;j++) 
			{
				if(arr[min_element]>arr[j]) 
				{
					min_element = j;
				}
			}
			swap(arr , i, min_element);
		}
		
	}
	
	public static void swap(int[] arr ,int i, int j) {
		int t = arr[i];
		arr[i] = arr[j];
		arr[j] = t;
	}
	
	public static void printArray(int arr[])
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int arr[]= {67,2,56,33,90,5,11,2,82};
		System.out.println("BEFORE SORTING : ");
		printArray(arr);
		selectionSort(arr);
		System.out.println("AFTER SORTING : ");
		printArray(arr);
		

	}
}

