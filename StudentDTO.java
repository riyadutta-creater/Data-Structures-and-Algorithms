package com.collections.sorting;

import java.util.Comparator;

public class StudentDTO implements Comparable<StudentDTO> {
	
	private String studentName;
	private String collegeName;
	private String stream;
	private String state;
	private String companyName;

	/**
	 * 
	 */
	public StudentDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param studentName
	 * @param collegeName
	 * @param stream
	 * @param state
	 * @param companyName
	 */
	public StudentDTO(String studentName, String collegeName, String stream, String state, String companyName) {
		super();
		this.studentName =studentName;
		this.collegeName = collegeName;
		this.stream = stream;
		this.state = state;
		this.companyName = companyName;
	}
	
	/**
	 * @return the stuName
	 */
	public String getstudentName() {
		return studentName;
	}


	/**
	 * @param stuName the stuName to set
	 */
	public void setStuName(String studentName) {
		this.studentName=studentName;
	}

	/**
	 * @return the collegeName
	 */
	public String getCollegeName() {
		return collegeName;
	}

	/**
	 * @param collegeName the collegeName to set
	 */
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	/**
	 * @return the stream
	 */
	public String getStream() {
		return this.stream;
	}

	/**
	 * @param stream the stream to set
	 */
	public void setStream(String stream) {
		this.stream = stream;
	}

	/**
	 * @param state the state to set
	 * @deprecated Use {@link #getState()} instead
	 */
	
	/**
	 * @param state the state to set
	 */
	
	public String getState() {
		return this.state;
	}

	/**
	 * @param state the state to set
	 * @deprecated Use {@link #setState(String)} instead
	 */


	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the companyName
	 */
	public String getCompanyName() {
		return this.companyName;
	}

	/**
	 * @param companyName the companyName to set
	 */
	public void setCompanyName(String companyName) {
		this.collegeName = companyName;
	}

	@Override
	public String toString() {
		return "StudentDTO [StudentName=" + studentName + ", CollegeName=" + collegeName + ", Stream=" + stream
				+ ", state=" + state + ", companyName=" + companyName + "]";
	}
	
	@Override
	public int compareTo(StudentDTO obj) {
		// TODO Auto-generated method stub
		
		return this.studentName().compareTo(obj.studentName());
	}

	/**
	 * @return the studentName
	 */
	
	
}
