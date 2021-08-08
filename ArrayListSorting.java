/**
 * 
 */
package com.collections.sorting;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;


/**
 * @author indian
 *
 */
public class ArrayListSorting {

	private static StudentDTO stu = null;
	private static ArrayList<StudentDTO> listOfStudents = null;
	
	
	
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method 
		
		getStudentDataFromFile();
		searchUserDefineDataUsingComparable();
		

	}

	private static void searchUserDefineDataUsingComparable() {
		// TODO Auto-generated method stub
		//System.out.println("Enter The Name Of The Student :\n");
		//Scanner sc = new Scanner(System.in);
		//String str= sc.nextLine();
		
		while(1) {
			System.out.print("Soring Of Report can be done for - studentName, collegeName, stream, state, companyName");
			System.out.print("For which field you want to Sort - ");
			Scanner sc = new Scanner(System.in);
			String userInput = sc.nextLine();
			if(userInput.equals("studentName") || userInput.equals("collegeName") || userInput.equals("stream")
					|| userInput.equals("state") ||userInput.equals("companyName"))
			{
				
			}
			
		}
		
		
		Collections.sort(listOfStudents, new Sortbyname());
		
		
		//Collections.sort(listOfStudents);
		for(StudentDTO stu :listOfStudents)
		{
			//System.out.println(stu.getStudent_Name());
		}
		//listOfStudents.stream().map(s -> s.name).forEach(System.out::println);

	}

	private static void getStudentDataFromFile() throws Exception {
		// TODO Auto-generated method stub
		
		String lineFromFile ="";
		File file = new File("C:\\xyz\\DataInput.txt");
		Scanner sc = new Scanner(file);	
		listOfStudents = new ArrayList<StudentDTO>();
		while(sc.hasNext()) {
			//String line = sc.nextLine();
			lineFromFile =sc.nextLine();
			System.out.println(lineFromFile);
			String[] arrayOfFieldsInOneline = lineFromFile.split("\t");
			stu = new StudentDTO(
					arrayOfFieldsInOneline[0],
					arrayOfFieldsInOneline[1],
					arrayOfFieldsInOneline[2],
					arrayOfFieldsInOneline[3],
					arrayOfFieldsInOneline[4]);
			listOfStudents.add(stu);
		}
	
		//for(StudentDTO stu :listOfStudents)
		//{
		//	System.out.println(stu.getStudent_Name()+stu.getCompanyName());
		//}
		//listOfStudents.forEach(System.out::println);
		
		
        sc.close();
	}
}