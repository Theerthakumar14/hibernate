package com.xworkz.xworkzapp.tester;

import com.xworkz.xworkzapp.dto.InstituteDto;
import com.xworkz.xworkzapp.service.InstituteService;
import com.xworkz.xworkzapp.service.InstituteServiceImpl;

public class InstituteTester {
 public static void main(String[] args) {
	InstituteDto indto = new InstituteDto("Cit","Gubbi", "1234567890", "Basavaraj","3000");
	
	
	InstituteService inimp = new InstituteServiceImpl();
	inimp.validateInstituteDetails(indto);
	inimp.validateDisplay();
}
}
