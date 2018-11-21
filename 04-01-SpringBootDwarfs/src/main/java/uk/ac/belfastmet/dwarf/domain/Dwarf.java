package uk.ac.belfastmet.dwarf.domain;

public class Dwarf {
public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
public Dwarf(String name, String author, String image) {

		this.name = name;
		this.author = author;
		this.image = image;
	}
public Dwarf() {
		super();
	}
private String name;
private String author;
private String image;

}
