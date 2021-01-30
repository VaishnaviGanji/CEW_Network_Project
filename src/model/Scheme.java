package model;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Scheme {
	public Scheme(String title, String description, String tag, String imageURL,
			String pointOfContact) {
		super();
		this.title = title;
		this.description = description;
		this.tag = tag;
		this.imageURL = imageURL;
		this.pointOfContact = pointOfContact;
	}
	String title;
	String description;
	String type;
	String tag;
	String imageURL;
	String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Timestamp(System.currentTimeMillis()));
	String pointOfContact;
	ArrayList<String> enrolled;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	@Override
	public String toString() {
		return "Post [title=" + title + ", description=" + description + ", type=" + type + ", tag=" + tag + "]";
	}
	public String getTimestamp() {
		return timeStamp;
	}
	public void setTimestamp(String timestamp) {
		this.timeStamp = timestamp;
	}
	public String getImageURL() {
		return imageURL;
	}
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}
	public void enroll(String emailId) {
		enrolled.add(emailId);
	}
	
}
