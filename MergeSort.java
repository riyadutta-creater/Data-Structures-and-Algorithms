package sorting;

public class MergeSort {
	
	private static void merge(int[] arr, int low , int mid , int high) {
		int temp[] = new int[40];
		int i = low ,j =mid+1 , k=low;
		while(i<=mid && j<=high ) {
			if(arr[i]<arr[j]) {
				temp[k] = arr[i];
				i++;
				k++;
			}
			else {
				temp[k]=arr[j];
				j++;
				k++;
			}
		}
		while(i<=mid) {         //copy all the remaining elements from arr[i] to temp[k]
			temp[k] = arr[i];
			i++;
			k++;
		}
		while(j<=high) {        //copy all the remaining elements from arr[j] to temp[k]
			temp[k]=arr[j];
			j++;
			k++;
		}
		for(i=low;i<=high;i++) {
			arr[i] = temp[i];
		}
		
	}
	
	public static void Merge_Sort(int[] arr, int low , int high) {
		if(low<high) {
		int mid = (low+high)/2;
		Merge_Sort(arr,low ,mid);
		Merge_Sort(arr,mid+1 ,high);
		merge(arr, low , mid , high);
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
		int n =arr.length;
		System.out.println("BEFORE SORTING : ");
		printArray(arr);
		Merge_Sort(arr, 0 , n-1);
		System.out.println("AFTER SORTING : ");
		printArray(arr);

	}

	

}
