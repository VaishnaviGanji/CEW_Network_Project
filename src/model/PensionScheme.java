package model;

public class PensionScheme extends Scheme{
	public PensionScheme(String title, String description, String tag, String imageURL,
			String pointOfContact, double monthlypayment, int numberOfYearsCovered) {
		super(title, description, tag, imageURL, pointOfContact);
		this.monthlypension = monthlypayment;
		this.numberOfYearsCovered = numberOfYearsCovered;
	}
	double monthlypension;
	int numberOfYearsCovered;
	public double getMonthlypayment() {
		return monthlypension;
	}
	public void setMonthlypayment(double monthlypayment) {
		this.monthlypension = monthlypayment;
	}
	public int getNumberOfYearsCovered() {
		return numberOfYearsCovered;
	}
	public void setNumberOfYearsCovered(int numberOfYearsCovered) {
		this.numberOfYearsCovered = numberOfYearsCovered;
	}
	
}
