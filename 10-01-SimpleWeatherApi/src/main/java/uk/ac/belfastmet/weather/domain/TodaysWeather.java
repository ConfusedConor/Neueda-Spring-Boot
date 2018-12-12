package uk.ac.belfastmet.weather.domain;
import lombok.Data;

@Data
public class TodaysWeather {
	private Location location;
	private Weather weather;
	
	public String toString() {
		return location.toString() + weather.toString() +weather.getWind().toString();
	}

	public Object getWind() {
		
		return weather.getWind();
	}
}
