package utility;

import model.Scheme;

public class CheckPost {
	String[] offensiveWords = {"ass", "bastard", "fuck", "anal", 
			"asshole", "bondage","boned", "boner", "boners", "bong", 
			"boob","boobies", "boobs", "booby", "booger", "douche"
			, "douchebag", "douchebags", "douche-fag", "douchewaffle"
			, "douchey", "drunk", "dumbass"	, "dumb", "bitch"};
	
	public boolean checkPostTitle(Scheme post) {
		// TODO Auto-generated method stub
//		boolean hasOffensive = false;
		String title = post.getTitle().toLowerCase();
		for (String word : offensiveWords) {
			if (title.contains(word)) {
				return false;
			}
		}
		return true;
	}

	public boolean checkPostDescription(Scheme post) {
		// TODO Auto-generated method stub
		String title = post.getDescription().toLowerCase();
		for (String word : offensiveWords) {
			if (title.contains(word)) {
				return false;
			}
		}
		return true;
	}

	public boolean checkPost(Scheme post) {
		// TODO Auto-generated method stub
		return checkPostTitle(post) && checkPostDescription(post);
	}
}
