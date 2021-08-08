/**
 * 
 */
package com.riya;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author indian
 *
 */
public class student {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		  
	     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));           
		
		System.out.print("Enter blood compo - ");
		String Comp2 = br.readLine();
		
		
		System.out.print("Enter virus compo - ");
		String Comp1 = br.readLine();
		System.out.print("Enter no of tests - ");
		int number =  Integer.parseInt(br.readLine());
		
			

	}

}
