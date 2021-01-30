package controller;

import java.util.*;

import model.*;
import utility.*;

public class SchemeController {

	public void addPost() {
		Scanner sc = new Scanner(System.in);
		CheckController checkController = new CheckController();
		System.out.println("Enter Scheme title, should be unique");
		String title = sc.nextLine();
		System.out.println("Enter post description");
		String description = sc.nextLine();
		System.out.println("Enter any tags");
		String tag = sc.next();
		System.out.println("Enter image URL");
		String imageURL = sc.next();
		System.out.println("Enter point of contact");
		String pointOfContact = sc.next();
		System.out.println("Choose the type of scheme to add");
		String[] typesOfSchemes = {"Accidental Insurance", "Educational Scheme",
				"Finance Scheme", "Health Scheme", "Pension Scheme" };
		for (int i = 0; i < typesOfSchemes.length; i++) {
			System.out.println((i + 1) + ". " + typesOfSchemes[i]);
		}
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter age limit");
			int ageLimit = sc.nextInt();
			System.out.println("Enter income limit");
			double incomeLimit = sc.nextDouble();
			System.out.println("Enter monthly premium");
			double monthlyPremium = sc.nextDouble();
			AccidentalInsurance accidentalInsurance = new AccidentalInsurance(title, description, tag, 
					imageURL, pointOfContact, ageLimit, incomeLimit, monthlyPremium);
			checkController.check(accidentalInsurance, "AccidentalInsurance");
			break;
		case 2:
			System.out.println("Enter income limit");
			incomeLimit = sc.nextDouble();
			System.out.println("Enter caste");
			String caste = sc.next();
			System.out.println("Enter religion");
			String religion = sc.next();
			System.out.println("Enter nationality");
			String nationality = sc.next();
			System.out.println("Enter age limit");
			ageLimit = sc.nextInt();
			EducationalScheme educationalScheme = new EducationalScheme(title, description, tag, imageURL, 
					pointOfContact, incomeLimit, caste, religion, nationality, ageLimit);
			checkController.check(educationalScheme, "EducationalScheme");
			break;
		case 3:
			System.out.println("Enter income limit");
			incomeLimit = sc.nextDouble();
			System.out.println("Enter age limit");
			ageLimit = sc.nextInt();
			System.out.println("Enter needs for which finance is provided");
			String providedFor = sc.next();
			FinanceScheme financeScheme = new FinanceScheme(title, description, tag, 
					imageURL, pointOfContact, incomeLimit, ageLimit, providedFor);
			checkController.check(financeScheme, "FinanceScheme");
			break;
		case 4:
			System.out.println("Enter income limit");
			incomeLimit = sc.nextDouble();
			System.out.println("Enter age limit");
			ageLimit = sc.nextInt();
			System.out.println("Enter the facilities provided under this scheme");
			String facilitiesProvided = sc.next();
			System.out.println("Enter diseases for which scheme is provided");
			String diseasesCovered = sc.next();
			HealthScheme healthScheme = new HealthScheme(title, description, tag, 
					imageURL, pointOfContact, ageLimit, incomeLimit, facilitiesProvided, diseasesCovered);
			checkController.check(healthScheme, "HealthScheme");
			break;
		case 5:
			System.out.println("Enter monthly pension");
			double monthlyPension = sc.nextDouble();
			System.out.println("Enter number of years covered");
			int numberOfYearsCovered = sc.nextInt();
			PensionScheme pensionScheme = new PensionScheme(title, description, tag, imageURL, 
					pointOfContact, monthlyPension, numberOfYearsCovered);
			checkController.check(pensionScheme, "PensionScheme");
			break;
		}
		
		sc.close();
	}

}
