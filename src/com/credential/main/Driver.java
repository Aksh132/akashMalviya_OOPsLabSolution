package com.credential.main;
import java.util.Scanner;

import com.credential.model.Employee;
import com.credential.service.CredentialService;

public class Driver {
	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("first Name:-");
			String firstName = input.nextLine();
			System.out.println("last Name:-");
			String lastName = input.nextLine();
			
			
			Employee employee = new Employee(firstName, lastName);
			CredentialService cs = new CredentialService();
			
			System.out.println("Please Enter The Department From The Following");
			System.out.println("\n1.  Technical  \n2.  Admin  \n3.  Human Resource  \n4.  Legal  "); 
			int option = input.nextInt();
			
			switch (option) {
			case 1:
				cs.showCredential(employee, "technical");
				
				break;
				
			case 2:
				cs.showCredential(employee, "admin");
				
				break;
			case 3:
				cs.showCredential(employee, "hr");
				
				break;
			case 4:
				cs.showCredential(employee, "legal");
				break;
				
			
						}
		}
	}

}
