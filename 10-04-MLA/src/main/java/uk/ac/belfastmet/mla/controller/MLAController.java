package uk.ac.belfastmet.mla.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import uk.ac.belfastmet.mla.domain.AllMembersApi;
import uk.ac.belfastmet.mla.domain.AllMembersList;

@Controller
@RequestMapping
public class MLAController {
	@GetMapping("/all")
public String home() {
		String allMembersForConstituencyUrl="http://data.niassembly.gov.uk/members_json.ashx?m=GetAllCurrentMembersByConstituencyId&constituencyId=1";
		RestTemplate restTemplate= new RestTemplate();
		AllMembersApi allMembersApi = restTemplate.getForObject(allMembersForConstituencyUrl, AllMembersApi.class);
		
		AllMembersList allMembersList = allMembersApi.getAllMembersList()
				;
		Logger logger = LoggerFactory.getLogger(MLAController.class);
		logger.info(allMembersList.toString());
		return "index";
	}
}
