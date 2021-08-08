package sorting;

public class InsertionSort {
	
	private static void inserionSort(int[] arr) {
		int n =arr.length;	
		for(int i=1;i<=n-1;i++)
		{
			int k = arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>k) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=k;	
		}
	}
	
	public static void printArray(int arr[])
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int arr[]= {7,2,91,77,3,33,54,20,11};
		System.out.println("BEFORE SORTING : ");
		printArray(arr);
		inserionSort(arr);
		System.out.println("AFTER SORTING : ");
		printArray(arr);

	}


}
