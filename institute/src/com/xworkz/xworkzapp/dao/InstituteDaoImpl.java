package com.xworkz.xworkzapp.dao;

import com.xworkz.xworkzapp.dto.InstituteDto;

public class InstituteDaoImpl implements InstituteDao{
	InstituteDto insdto[] = new InstituteDto[2];
	 int index =0;

	public InstituteDaoImpl() {
		System.out.println("InstDaoImpl constructor is called");
	}

	@Override
	public void addInstituteDetails(InstituteDto dto) {
		insdto[index] = dto;
		index++;
		System.out.println("data added successfully" +"\n");
	}

	@Override
	public void addDisplay() {
		System.out.println("Inside display method");
		for (int i = 0; i < index; i++) {
			System.out.println("Institute name is "+insdto[i].getInstituteName());
			System.out.println("Institute location is "+insdto[i].getLocation());
			System.out.println("Institute phone no is "+insdto[i].getPhoneNo());
			System.out.println("Institute founder is "+insdto[i].getFounder());
			System.out.println("Institute students is "+insdto[i].getNoOfStudents()+"\n");
			
			
		}
	}

}
