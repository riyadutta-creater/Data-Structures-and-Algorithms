package com.riya;

import java.io.InputStreamReader;
import java.util.Scanner;

public class CandidateCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(new InputStreamReader(System.in));
		String virusComp = scanner.nextLine();
		int numberOfPeople = scanner.nextInt();
		while(numberOfPeople-->0)
		{
			String bloodComp = scanner.nextLine();
			if(scanner.hasNext())
			{
				int i=0;
				int j=0;
				String p ="";
				int length1=virusComp.length();
				int length2=bloodComp.length();
				while(i<length1 && j<length2)
				{
					if(virusComp.charAt(i)==bloodComp.charAt(j))
					{
						p=p+virusComp.charAt(i);
						i++;
						j++;
					}
					else
					{
						i++;
					}
				}
				if(p==bloodComp)
				{
					System.out.println("POSITIVE");
				}
				else
				{
					System.out.println("NEGATIVE");
				}
			}
		}
	}
}

	