/**
 * 
 */
package com.riya;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * @author indian
 *
 */
public class CandidateCode2 {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
		System.out.print("Enter virus compo - ");
		String virusComp = br.readLine();
		System.out.print("Enter no of tests - ");
		int numberOfPeople = Integer.parseInt(br.readLine());
		
		
		//ArrayList<Integer> posOfSubSeq = new ArrayList<Integer>();
		int size = 20;
		int posOfSubSeq[]=new int[size];
		
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
						posOfSubSeq[counter]=pos;
						counter++;
					}else {
						flagIsPositive = false;
					}
				}
				
				
				//check the Position List
				if(flagIsPositive) {
					for(int j=0;j<(counter-2);j++ ) {
						if(!(posOfSubSeq[j]<posOfSubSeq[j+1])) {
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
				posOfSubSeq = new int[size];
			//} //scanner ends
		}
		
	}

}

