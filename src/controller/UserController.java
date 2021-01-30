package controller;

import java.util.Scanner;

import model.*;

public class UserController {

	public void userOperation(String emailId) {
		Scanner sc = new Scanner(System.in);
		System.out.println("For enrollment");
		TypeSelector typeSelector = new TypeSelector();
		String typeOfScheme = typeSelector.getTypeOfScheme();
		ViewController viewController = new ViewController();
		viewController.viewPosts(typeOfScheme);
		System.out.println("Enter title of scheme you want to enroll");
		String title = sc.next();
		SchemeData schemeData = new SchemeData();
		schemeData.getSchemeData(typeOfScheme).get(title).enroll(emailId);
		
	}
	
}
