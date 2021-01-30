package model;

public class EducationalScheme extends Scheme{

	
	public EducationalScheme(String title, String description, String tag, String imageURL,
			String pointOfContact, double incomeLimit, String caste, String religion,
			String nationality, int ageLimit) {
		super(title, description, tag, imageURL, pointOfContact);
		this.incomeLimit = incomeLimit;
		this.caste = caste;
		this.religion = religion;
		this.nationality = nationality;
		this.ageLimit = ageLimit;
	}
	double incomeLimit;
	String caste, religion, nationality;
	int ageLimit;
	public double getIncomeLimit() {
		return incomeLimit;
	}
	public void setIncomeLimit(double incomeLimit) {
		this.incomeLimit = incomeLimit;
	}
	public String getCaste() {
		return caste;
	}
	public void setCaste(String caste) {
		this.caste = caste;
	}
	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public int getAgeLimit() {
		return ageLimit;
	}
	public void setAgeLimit(int ageLimit) {
		this.ageLimit = ageLimit;
	}
	
	

}
