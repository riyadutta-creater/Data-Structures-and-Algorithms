/**
 * 
 */
package com.Arrays;

/**
 * @author indian
 *
 */
public class RotationOfAnArray_ByReversing{
	 public void reverse(int[] num, int high , int low)
     {
        while(low<high)
        {
           num[low] = num[high];
           low++;
           high--;
        }
     }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k=k%n;
        reverse(nums,0,n-k-1);
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-1);
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
