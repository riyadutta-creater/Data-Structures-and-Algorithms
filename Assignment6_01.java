/**
 * 
 */
package com.riya;

import java.util.LinkedHashSet;

class Assignment6_01 {

	public static void removeDuplicates(int[] a)    {
        LinkedHashSet<Integer> set
            = new LinkedHashSet<Integer>();
  
        // adding elements to LinkedHashSet
        for (int i = 0; i < a.length; i++)
            set.add(a[i]);
  
        // Print the elements of LinkedHashSet
        System.out.print(set);
    }
  
    // Driver code
    public static void main(String[] args)throws Exception
    {
        int a[] = {11,23,11,45,23,56,2,1,67,34,23,78,4,5,45,24};
      
        // Function call
        removeDuplicates(a);
    }
}
