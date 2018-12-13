package uk.ac.belfastmet.translink.domain;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Service {
	@JsonProperty("ArriveTime")
	Map<String, Object> arriveTime;
	@JsonProperty("DepartTime")
	Map<String, Object> departTime;
	@JsonProperty("Platform")
	Map<String, Object> platform;
	@JsonProperty("Delay")
	Map<String, Object> delay;
	@JsonProperty("ExpectedDepartStatus")
	Map<String, Object> expectedDepart;
	@JsonProperty("ExpectedArriveStatus")
	Map<String, Object> expectedArrival;
	@JsonProperty("Origin1")
	Map<String, Object> origin;
	@JsonProperty("Destination1")
	Map<String, Object> destination;


}
