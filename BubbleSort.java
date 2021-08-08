package sorting;

public class BubbleSort {
	public static void bubbleSort(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) //no of passes  
		{
			System.out.println("Pass No : " +(i+1));
			for(int j=0;j<n-1-i;j++)//no of comparison in each pass 
			{
				if(arr[j]>arr[j+1])
					swap(arr,j,j+1);
			}
		}

	}
	
	public static void adaptiveBubbleSort(int arr[]) {
		int n=arr.length;
		boolean isSortedAlready = false;
		for(int i=0;i<n-1;i++) //no of passes  
		{
			System.out.println("Pass No : " +(i+1));
			isSortedAlready = true;
			for(int j=0;j<n-1-i;j++)//no of comparison in each pass 
			{
				if(arr[j]>arr[j+1]) {
					swap(arr,j,j+1);
				    isSortedAlready = false;
				}
			}
		if(isSortedAlready)
		{
			return;
		}

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
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[]= {7,11,9,2,17,4};
		int arr[]= {1,2,5,6,12,54,625,7,23,9,987};
		System.out.println("BEFORE SORTING : ");
		printArray(arr);
		bubbleSort(arr);
//		adaptiveBubbleSort(arr);
		System.out.println("AFTER SORTING : ");
		printArray(arr);


	}

}
