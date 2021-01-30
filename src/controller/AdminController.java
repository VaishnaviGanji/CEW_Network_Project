package controller;

import java.util.Scanner;

public class AdminController {

	public void adminOperations() {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println("1. Add scheme");
			System.out.println("2. View schemes");
			System.out.println("3. Delete scheme");
			System.out.println("4. Log out");
			choice = sc.nextInt();
			String typeOfScheme = "";
			switch(choice) {
			case 1:
				SchemeController schemeController = new SchemeController();
				schemeController.addPost(); 
				break;
			case 2:
					ViewController viewController = new ViewController();
					TypeSelector typeSelector = new TypeSelector();
					typeOfScheme = typeSelector.getTypeOfScheme();
					viewController.viewPosts(typeOfScheme);
				
				break;
			case 3:
				
					DeleteController deleteController = new DeleteController();
					typeSelector = new TypeSelector();
					typeOfScheme = typeSelector.getTypeOfScheme();
					deleteController.deletePost(typeOfScheme);
				
				break;
			}
		} while(choice != 4);
		System.out.println("Logged out");
		sc.close();
	}

}
