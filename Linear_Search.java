/**
 * 
 */
package searching;

import java.util.Scanner;

public class Linear_Search {
	

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int pos = -1;
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the number of elements you want to store: ");  
		int n=sc.nextInt();   
		int[] arr = new int[10];  
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n; i++)
			arr[i]=sc.nextInt();  
		System.out.println("Enter the elements that has to be searched: "); 
		int k=sc.nextInt();   
		for(int i=0;i<n;i++)
		{
			if(arr[i]==k)
			{
				pos = i;
			    System.out.println(k +" Found at index no " + pos);
			    break;
			}
		}
		
		if(pos == -1)
			System.out.println(k + " is not found in the given array");
	

	}

}
