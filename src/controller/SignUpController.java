package controller;

import java.util.Scanner;

import businesslogic.*;
import model.*;

public class SignUpController {
	public String signUp() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your emailId");
		String emailId = sc.next();
		System.out.println("Enter your first name");
		String firstName = sc.next();
		System.out.println("Enter your last name");
		String lastName = sc.next();
		System.out.println("Enter password. \nPassword length "
				+ "should be between 8 and 20 and should contain atleast "
				+ "an upper case letter, a lower case letter and "
				+ "a special character and a digit");
		String password = sc.next();
		System.out.println("Confirm Password");
		String confirmPassword = sc.next();
		System.out.println("Enter your designation");
		String designation = sc.next();
		System.out.println("Enter your company you are working in");
		String company = sc.next();
		RegistrationValidation checkUser = new RegistrationValidation();
		if(checkUser.checkUserDetails(emailId, password, confirmPassword)) {
			User user = new User(firstName, lastName, confirmPassword, designation, company, emailId);
			UserData userData = new UserData();
			userData.addUser(user);
			System.out.println("Signed successfully");
			return emailId + "true";
		} else {
			System.out.println("Check your email and password");
			return emailId + "false";
		}
		//sc.close();
	}
}
