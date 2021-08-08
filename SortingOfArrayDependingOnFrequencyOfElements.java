/**
 * 
 */
package interviewquestion;

/**
 * @author indian
 *
 */
public class SortingOfArrayDependingOnFrequencyOfElements {

	/**
	 * @param args
	 */
	static int y =0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = { 4,3,6,4,1,3,4,6};
		
		int b[][] = new int [a.length][2];
		
		a = sort(a);
		
		for(int i: a)
		{
			System.out.print(i + " "); 
		}
		
		
		b[y][0] = a[0];
		
		for(int i =1 ; i<a.length;i++)
		{
			if(a[i]==a[i-1])
			{
				b[y][1] = b[y][1]+1;
			}
			else
			{
				y++;
				b[y][0] = a[i];
			}
		}
		
		y++;
		
		System.out.println(" ");
		
		System.out.println("-----------------");
		
		b = sort(b);
		
		for(int i=0; i<y; i++)
		{
			for(int j=0; j<=b[i][1]; j++) 
			{
				System.out.print(b[i][0]+ " ");
			}
		}
		
		
	}
	
	public static int[][] sort(int b[][])
	{
		int c[] = new int[2];
		for(int i=0 ; i<y; i++)
		{
			for(int j=i ; j<y; j++)
			{
				if(b[i][1]<b[j][1])
				{
					c = b[i];
					b[i]=b[j];
					b[j]=c;
				}
			}
		}
		return b;
			
	}
			
	public static int[] sort(int a[])
	{
		
		for(int i=0 ; i<a.length ; i++)
		{
			for(int j=i ; j<a.length ; j++)
			{
				if(a[i]>a[j])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}

		}
		return a;
		
	}

}
