package uk.ac.belfastmet.mla.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AllMembersList {
	@JsonProperty("Member")
	Object allMembersList;

	public String toString() {
		return this.allMembersList.toString();
	}
	
	
}
