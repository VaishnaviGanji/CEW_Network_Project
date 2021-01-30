package model;

public class FinanceScheme extends Scheme{
	public FinanceScheme(String title, String description, String tag, String imageURL,
			String pointOfContact, double incomeLimit, int ageLimit, String providedFor) {
		super(title, description, tag, imageURL, pointOfContact);
		this.incomeLimit = incomeLimit;
		this.ageLimit = ageLimit;
		this.providedFor = providedFor;
	}
	double incomeLimit;
	int ageLimit;
	String providedFor;
	public double getIncomeLimit() {
		return incomeLimit;
	}
	public void setIncomeLimit(double incomeLimit) {
		this.incomeLimit = incomeLimit;
	}
	public int getAgeLimit() {
		return ageLimit;
	}
	public void setAgeLimit(int ageLimit) {
		this.ageLimit = ageLimit;
	}
	public String getProvidedFor() {
		return providedFor;
	}
	public void setProvidedFor(String providedFor) {
		this.providedFor = providedFor;
	}
	
}
