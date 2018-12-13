package uk.ac.belfastmet.events.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Event {
	private String identifier;
	private String url;
	private String title;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date startDate;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date endDate;
	private String time;
	private String venue;
	private String venueUrl;
	private String image;
	private String audience;
	private String theme;
	private String cost;
	private String content;

	public String toString() {
		return title.toString() + url.toString() + identifier.toString() + startDate.toString() + endDate.toString()
				+ time.toString() + venue.toString() + venueUrl.toString() + image.toString() + audience.toString()
				+ theme.toString() + cost.toString() + content.toString();
	}

}
