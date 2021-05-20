package com.xworkz.xworkzapp.dto;

public class InstituteDto {
	private String instituteName;
	private String location;
	private String phoneNo;
	private String founder;
	private String noOfStudents;
	
	public InstituteDto(String instituteName, String location, String phoneNo, String founder, String noOfStudents) {
		System.out.println("InstituteDto constructor is called");
		this.instituteName = instituteName;
		this.location = location;
		this.phoneNo = phoneNo;
		this.founder = founder;
		this.noOfStudents = noOfStudents;
	}

	public String getInstituteName() {
		return instituteName;
	}

	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getFounder() {
		return founder;
	}

	public void setFounder(String founder) {
		this.founder = founder;
	}

	public String getNoOfStudents() {
		return noOfStudents;
	}

	public void setNoOfStudents(String noOfStudents) {
		this.noOfStudents = noOfStudents;
	}
	
	
	


}
