/**
 * 
 */
package searching;

/**
 * @author indian
 *
 */
public class JumpSearch {
	public static int search_jump(int arr[],int low , int high ,int value, int n)
	{
		int step;
		n = arr.length;
		step = (int)Math.floor(Math.sqrt(n));
		for(int i=0;i<step;i++)
		{
			if(arr[step]>value)
				high=step-1;
			else
				low=step+1;
		}
		for(int i=low ;i<high;i++)
		{
			if(arr[step]==value)
				return i;
	
		}
		return -1;
	}
		
  public static void main(String[] args) {
	int arr[]= {2,34,67,98,145,289,301,556,623};
	int value = 301;
	int n=arr.length;
	int answer = search_jump(arr, 0 , n-1 , value , n);
	if(answer==-1)
		System.out.println("The required element is not present in the given array");
	else
		System.out.println("The required element is found at index " + answer);
	


	}

}
