package model;

public class HealthScheme extends Scheme{
	
	public HealthScheme(String title, String description, String tag, String imageURL,
			String pointOfContact, int ageLimit, double incomeLimit, String facilitiesProvided,
			String diseasesCovered) {
		super(title, description, tag, imageURL, pointOfContact);
		this.ageLimit = ageLimit;
		this.incomeLimit = incomeLimit;
		this.facilitiesProvided = facilitiesProvided;
		this.diseasesCovered = diseasesCovered;
	}
	int ageLimit;
	double incomeLimit;
	String facilitiesProvided;
	String diseasesCovered;
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
	public String getFacilitiesProvided() {
		return facilitiesProvided;
	}
	public void setFacilitiesProvided(String facilitiesProvided) {
		this.facilitiesProvided = facilitiesProvided;
	}
	public String getDiseasesCovered() {
		return diseasesCovered;
	}
	public void setDiseasesCovered(String diseasesCovered) {
		this.diseasesCovered = diseasesCovered;
	}
}
