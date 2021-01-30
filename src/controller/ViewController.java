package controller;

import java.util.HashMap;

import model.*;

public class ViewController {

	public void viewPosts(String typeOfScheme) {
		// TODO Auto-generated method stub
		SchemeData postData = new SchemeData();
		HashMap<String, Scheme> data = postData.getSchemeData(typeOfScheme);
		if (data == null) {
			System.out.println("empty");
		} else
		System.out.println(data.toString());
	}

}
