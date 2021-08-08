package com.collections.sorting;

import java.util.Comparator;

public class Sortbyname implements Comparator<StudentDTO> {

	@Override
	public int compare(StudentDTO a, StudentDTO b) {
		// TODO Auto-generated method stub
		return a.getStudentName().compareTo(b.getStudentName());
	}

}


public int compareTo(StudentDTO o){
    return Comparator.comparing(StudentDTO::getstudentName)
              .thenComparing(StudentDTO::getcollegeName)
              .thenComparing(StudentDTO::stream)
              .thenComparing(StudentDTO::state)
              .thenComparing(StudentDTO::companyName)
              .compare(this, o);
