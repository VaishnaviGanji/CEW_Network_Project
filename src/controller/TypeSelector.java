package controller;

import java.util.Scanner;

public class TypeSelector {

	public String getTypeOfScheme() {
		String typeOfScheme = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter choice for the type of Scheme");
		System.out.println("1. Accidental Insurance");
		System.out.println("2. Educational Scheme");
		System.out.println("3. Finance Scheme");
		System.out.println("4. Health Scheme");
		System.out.println("5. Pension Scheme");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			typeOfScheme = "AccidentalInsurance";
			break;
		case 2:
			typeOfScheme = "EducationalScheme";
			break;
		case 3:
			typeOfScheme = "FinanceScheme";
			break;
		case 4:
			typeOfScheme = "HealthScheme";
			break;
		case 5:
			typeOfScheme = "PensionScheme";
			break;
		}
		return typeOfScheme;
	}

}
