package com.riya;

import java.io.*;
import java.util.*;
public class CandidateCode3{
   public static void main(String args[] ) throws Exception {

	
		Scanner sc = new Scanner(new InputStreamReader(System.in));
      if(sc.hasNext())
         {
		      String virusComp = sc.nextLine();
		      int numberOfPeople = sc.nextInt();
		      int size = 100;   
            int posOfSubSeq[]=new int[size];
            boolean flagIsPositive = true;
            while(numberOfPeople-->0){
			      String bloodComp = sc.nextLine();
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
				   if(flagIsPositive) {
					   System.out.println("POSITIVE");
				   }else {
					   System.out.println("NEGATIVE");
				   }
				   //Resetting all data for the next run
				   flagIsPositive = true;
               posOfSubSeq = new int[size];
			         //} //scanner ends
		      
		   }
      }
   }
}

