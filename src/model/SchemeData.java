package model;

import java.util.HashMap;

public class SchemeData {
	private static HashMap<String, HashMap<String,Scheme> > schemeData = new HashMap<String, HashMap<String,Scheme>>();
	

	public HashMap<String, HashMap<String,Scheme> > getSchemeData() {
		return schemeData;
	}
	
	public HashMap<String, Scheme> getSchemeData(String typeOfScheme) {
		return schemeData.get(typeOfScheme);
	}
	
	public void addScheme(Scheme post, String typeOfScheme) {
		if (schemeData.containsKey(typeOfScheme))
		schemeData.get(typeOfScheme).put(post.getTitle(), post);
		else {
			schemeData.put(typeOfScheme, new HashMap<String, Scheme>());
			schemeData.get(typeOfScheme).put(post.getTitle(), post);
		}
	}
	public boolean deleteScheme(String postTitle, String typeOfScheme) {
		if (! schemeData.containsKey(typeOfScheme))
			return false;
		if (schemeData.get(typeOfScheme).containsKey(postTitle)) {
			schemeData.get(typeOfScheme).remove(postTitle);
			return true;
		} 
		return false;
	}

	public static void setSchemeData(HashMap<String, HashMap<String, Scheme>> postData) {
		SchemeData.schemeData = postData;
	}
}
