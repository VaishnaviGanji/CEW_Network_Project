package controller;

import java.util.HashMap;
import java.util.Scanner;

import model.*;

public class LoginController {

	public String logIn() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter emailId");
		//sc.next();
		String emailId = sc.nextLine();
		System.out.println("enter the password");
		String password = sc.next();
		UserData userData = new UserData();
		HashMap<String, User> signedUserData = userData.getUserData();
		if (signedUserData.containsKey(emailId)) {
			if (signedUserData.get(emailId).getPassword().equals(password)) {
				System.out.println("Logged-in successfully");
				return emailId + " true";
			} else {
				System.out.println("Password is incorrect");
			}
		} else {
			System.out.println("Not signed-in yet!!");
		}
		//sc.close();
		return emailId + " false";
	}

}
