package com.xworkz.xworkzapp.service;

import com.xworkz.xworkzapp.dao.InstituteDaoImpl;
import com.xworkz.xworkzapp.dto.InstituteDto;

public class InstituteServiceImpl implements InstituteService  {
	private InstituteDaoImpl imp = new InstituteDaoImpl();
	
	@Override
	public void validateInstituteDetails(InstituteDto dto) {
		 boolean isValidData = true;
		 if(dto.getInstituteName()==null || dto.getInstituteName().length()!=3) {
			 System.out.println("Invalid Institute name");
			 isValidData = false;
		 }
		 if (dto.getLocation() == null || dto.getLocation().length() < 4) {
				System.out.println("Invalid location");
				isValidData = false;
			}
		 if (dto.getPhoneNo() == null || dto.getPhoneNo().length() < 6) {
				System.out.println("Invalid Name");
				isValidData = false;
				// return isValidData;
			}
			if (dto.getFounder() == null || dto.getFounder().length() < 6) {
				System.out.println("Invalid founder name");
				isValidData = false;
			}
			if(dto.getNoOfStudents()==null || dto.getNoOfStudents().length()<4) {
				System.out.println("Innvalid noOfStudents");
				isValidData = false;
				
			}
			if(isValidData) {
				imp.addInstituteDetails(dto);
			}
			
	}

	@Override
	public void validateDisplay() {
		imp.addDisplay();
	}

}
