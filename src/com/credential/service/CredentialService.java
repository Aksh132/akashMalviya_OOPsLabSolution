package com.credential.service;
import java.util.Random;

import com.credential.model.Employee;

public class CredentialService {
	
	
	
	private String generateEmail(Employee empolyee, String dept ) {
		return empolyee.getfirstName().toLowerCase().replaceAll("\\s","")+empolyee.getlastName().toLowerCase().replaceAll("\\s","")+"@"+dept+".abc.com";
		
	}
	
	private String generatePassword() {
		
		String code = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%&*+?";
      	String Password = "";
		Random r = new Random();
		
		for (int i = 1; i <= 8; i++) {
			Password = Password+ code.charAt(r.nextInt(code.length()));
			
			
		}
		return Password;
		
		
		
			
	}
	
	public void showCredential(Employee employee, String string) {
		System.out.println("Dear "+employee.getfirstName()+ " your generated credentials are as follows");
		System.out.println("Please Note This Your Email Add:--  "+ this.generateEmail(employee, string));
		System.out.println("Password:--  "+this.generatePassword());
		
	}

}