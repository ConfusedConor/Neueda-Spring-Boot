package uk.ac.belfastmet.sbtest.domain;

public class Rocket {
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Rocket() {
		super();
	}
	public Rocket(String name, String type, String creator, String image) {
		super();
		this.name = name;
		this.type = type;
		this.creator = creator;
		this.image = image;
	}
	private String name;
	private String type;
	private String creator;
	private String image;

}
