package controller;

import java.util.Scanner;

public class HomeController {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		System.out.println("Enter the type of the user");
		System.out.println("1. Admin");
		System.out.println("2. Employee");
		choice = sc.nextInt();
		if (choice == 1) {
			System.out.println("Enter password for admin");
			String password = sc.next();
			if (password.equals("Admin@123")) {
				AdminController adminController = new AdminController();
				adminController.adminOperations();
			} else {
				System.out.println("Password incorrect");
			}
		} else {
			String result[];
			System.out.println("Enter the choice");
			System.out.println("1. Log in");
			System.out.println("2. Sign up");
			choice = sc.nextInt();
			if (choice == 2) {
				SignUpController signUpcontroller = new SignUpController();
				result = signUpcontroller.signUp().split(" ");
			} else {
				LoginController loginController = new LoginController();
				result = loginController.logIn().split(" ");
			}
			if (result[1].equals("true")) {
				UserController userController = new UserController();
				userController.userOperation(result[0]);
			}// else {
				//System.out.println("Check email and password");
			//}
		}

	}

}
