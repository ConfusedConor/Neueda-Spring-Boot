package uk.ac.belfastmet.biggestbuildings.domain;

public class ByFloorArea extends Building {
public String getFloorArea() {
		return floorArea;
	}

	public void setFloorArea(String floorArea) {
		this.floorArea = floorArea;
	}

public ByFloorArea() {
		super();
	
	}

	public ByFloorArea(String name, String country, String place, String image, String map) {
		super(name, country, place, image, map);
	
	}

public ByFloorArea(String name, String country, String place, String floorArea, String image, String map) {
	super(name, country, place, image, map);
	this.floorArea = floorArea;
	}

private String floorArea;

}
