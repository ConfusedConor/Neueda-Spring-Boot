package uk.ac.belfastmet.biggestbuildings.domain;

public class ByVolume extends Building{
	public ByVolume(String name, String country, String place, String image, String map) {
		super(name, country, place, image, map);
	}
	private String floorArea;
	private String volume;
	private String description;
	public ByVolume() {
	}
	public ByVolume(String name, String country, String place, String floorArea, String volume, String description, String image, String map) {
		super (name, country, place, image, map);
		this.floorArea = floorArea;
		this.volume = volume;
		this.description = description;
	}
	public String getFloorArea() {
		return floorArea;
	}
	public void setFloorArea(String floorArea) {
		this.floorArea = floorArea;
	}
	public String getVolume() {
		return volume;
	}
	public void setVolume(String volume) {
		this.volume = volume;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

}
