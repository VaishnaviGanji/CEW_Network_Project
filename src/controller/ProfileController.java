package controller;

import model.UserData;

public class ProfileController {

	public void viewProfile(String emailId) {
		UserData userData = new UserData();
		System.out.println(userData.getUserData(emailId).toString());
	}

}
