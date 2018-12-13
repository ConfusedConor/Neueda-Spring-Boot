package uk.ac.belfastmet.translink.domain;

import java.util.Date;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class StationBoardAPI {
	@JsonProperty("StationBoard")
	Map<String, Object> stationBoard;
	
	@JsonProperty("@name")
	String stationName;
	@JsonProperty("@Timestamp")
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	Date lastUpdate;
	@JsonProperty("Service")
	Service service;
	
	//To String
	public String toString() {
		return this.stationBoard + this.stationName
				+ this.lastUpdate + this.service;
	}
	

	

}
