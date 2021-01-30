package controller;

import java.util.Scanner;

import model.SchemeData;

public class DeleteController {
	public void deletePost(String typeOfScheme) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter title of the scheme you want to delete");
		String title = sc.nextLine();
		SchemeData postData = new SchemeData();
		boolean status = postData.deleteScheme(title, typeOfScheme);
		if (status) {
			System.out.println("Deleted successfully");
		} else {
			System.out.println("Post doesn't exist");
		}
		sc.close();
	}
}
