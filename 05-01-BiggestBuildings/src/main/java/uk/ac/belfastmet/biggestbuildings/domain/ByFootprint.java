package uk.ac.belfastmet.biggestbuildings.domain;

public class ByFootprint extends Building {
	private String footprint;
	private String lengthbywidth;
	private String description;
	
	public ByFootprint(String name, String country, String place, String footprint, String lengthbywidth, String description, String image, String map) {
		super (name, country, place, image, map);
		this.footprint = footprint;
		this.lengthbywidth = lengthbywidth;
		this.description = description;
	}
	public ByFootprint() {
		super();
	}
	public ByFootprint(String name, String country, String place, String image, String map) {
		super(name, country, place, image, map);
	}
	public String getFootprint() {
		return footprint;
	}
	public void setFootprint(String footprint) {
		this.footprint = footprint;
	}
	public String getLengthbywidth() {
		return lengthbywidth;
	}
	public void setLengthbywidth(String lengthbywidth) {
		this.lengthbywidth = lengthbywidth;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

}
