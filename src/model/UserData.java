package model;

import java.util.HashMap;

public class UserData {
	private static HashMap<String, User> signedUserData = new HashMap<String, User>();
	public void addUser(User user) {
		signedUserData.put(user.getEmailId(), user);
	}
	public HashMap<String, User> getUserData() {
		return signedUserData;
	}
	public User getUserData(String emailId) {
		return signedUserData.get(emailId);
	}
}
