/**
 * 
 */
package com.riya;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author indian
 *
 */
public class CandidateCode1 {

	/**
	 * @param argso
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Scanner scanner = new Scanner(new InputStreamReader(System.in));
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
		System.out.print("Enter virus compo - ");
		String virusComp = br.readLine();
		System.out.print("Enter no of tests - ");
		int numberOfPeople = Integer.parseInt(br.readLine());
		
		LinkedList<Integer> posOfSubSeq = new LinkedList<Integer>();
		
		boolean flagIsPositive = true;
		while(numberOfPeople-->0)
		{
			System.out.print("Enter blood compo - ");
			String bloodComp = br.readLine();
			int counter = 0;
				for(int i=0; i<bloodComp.length(); i++) {
					char temp =bloodComp.charAt(i);
					if(virusComp.contains(String.valueOf(temp)))
					{
						int pos = virusComp.indexOf(String.valueOf(temp));
						posOfSubSeq.add(pos);
						counter++;
					}else {
						flagIsPositive = false;
					}
				}
				
				
				//check the Position List
				if(flagIsPositive) {
					for(int j=0;j<(counter-2);j++ ) {
						if(!(posOfSubSeq.get(j)<posOfSubSeq.get(j+1))) {
							flagIsPositive = false;
						}
					}
				}
				// check ends
				
				System.out.println("---------------------------------------------");
				if(flagIsPositive) {
					System.out.println("TEST RESULTS FOR "+ bloodComp +" POSITIVE");
				}else {
					System.out.print("TEST RESULTS FOR "+ bloodComp +" NEGATIVE");
				}
				
				System.out.println("---------------------------------------------\n\n");
				
				//Resetting all data for the next run
				flagIsPositive = true;
				posOfSubSeq = new LinkedList<Integer>();
			//} //scanner ends
		}
		
	}
	/*public static boolean isSorted(LinkedList<Integer> posOfSubSeq) {
	    if (isEmpty(posOfSubSeq) || posOfSubSeq.size() == 1) {
	        return true;
	    }

	    Iterator<Integer> iter = posOfSubSeq.iterator();
	    Integer current, previous = iter.next();
	    while (iter.hasNext()) {
	        current = iter.next();
	        if (previous.compareTo(current) > 0) {
	            return false;
	        }
	        previous = current;
	    }
	    return true;
	if(isSorted(null)==true)
	{
		System.out.println("POSITIVE");
	}
	else
	{
		System.out.println("NEGATIVE");

	}*/
}


	

