package sorting;

public class CountSort {
	private static void Count_Sort(int[] arr, int n, int j) {
		int max = Integer.MIN_VALUE; //TO FIND THE MAXIMUM ELEMENT IN arr
		for(int i=0;i<n;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
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
		// TODO Auto-generated method stub
		int arr[]= {2,4,3,9,45,1,4,8,7,5,6};
		int n =arr.length;
		System.out.println("BEFORE SORTING : ");
		printArray(arr);
		Count_Sort(arr, 0 , n-1);
		System.out.println("AFTER SORTING : ");
		printArray(arr);
	}

	
}
