package sorting;

public class QuickSort {
	
	public static void swap(int[] arr ,int i, int j) {
		int t = arr[i];
		arr[i] = arr[j];
		arr[j] = t;
	}
	
	private static int Partition(int[] arr, int low, int high) {
		int i = low+1;
		int j = high;
		int pivot = arr[low];
		do{
			while(arr[i]<=pivot) {
				i++;
		    }
		    while(arr[j]>pivot) {
		    	j--;
		    }
		    if(i<=j) {
		    	swap(arr,i,j);
		    }
		}while(i<j);
		
		swap(arr,low,j);
		return j;
	}
	
	
	public static void Quick_Sort(int[] arr, int low , int high) {
		if(low<high) {
		int partition_index =Partition(arr, low , high);
		Quick_Sort(arr,low , partition_index-1);
		Quick_Sort(arr, partition_index+1 ,high);
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
		int arr[]= {2,4,3,9,45,1,4,8,7,5,6};
		int n =arr.length;
		System.out.println("BEFORE SORTING : ");
		printArray(arr);
		Quick_Sort(arr, 0 , n-1);
		System.out.println("AFTER SORTING : ");
		printArray(arr);


	}

}
