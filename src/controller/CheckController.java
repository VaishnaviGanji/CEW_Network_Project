package controller;

import model.Scheme;
import model.SchemeData;
import utility.CheckPost;

public class CheckController {
	public void check(Scheme scheme, String typeOfScheme) {
		CheckPost checkPost = new CheckPost();
		if (!checkPost.checkPost(scheme)) {
			System.out.println("Can't post as it contains "
					+ "offensive words");
		} else {
			SchemeData postData = new SchemeData();
			if (postData.getSchemeData().containsKey(scheme.getTitle())) {
				System.out.println("Give a unique title");
			} else {
				postData.addScheme(scheme, typeOfScheme);
				System.out.println("Posted Successfully");
				//System.out.println(scheme.toString());
			}
		}
	}
}
