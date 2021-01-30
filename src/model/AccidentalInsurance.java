package model;

public class AccidentalInsurance extends Scheme{
	public AccidentalInsurance(String title, String description, String tag, String imageURL,
			String pointOfContact, int ageLimit, double incomeLimit, double monthlyPremium) {
		super(title, description, tag, imageURL, pointOfContact);
		this.ageLimit = ageLimit;
		this.incomeLimit = incomeLimit;
		this.monthlyPremium = monthlyPremium;
	}
	int ageLimit;
	double incomeLimit;
	double monthlyPremium;
	public int getAgeLimit() {
		return ageLimit;
	}
	public void setAgeLimit(int ageLimit) {
		this.ageLimit = ageLimit;
	}
	public double getIncomeLimit() {
		return incomeLimit;
	}
	public void setIncomeLimit(double incomeLimit) {
		this.incomeLimit = incomeLimit;
	}
	public double getMonthlyPremium() {
		return monthlyPremium;
	}
	public void setMonthlyPremium(double monthlyPremium) {
		this.monthlyPremium = monthlyPremium;
	}
}
