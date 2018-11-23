package uk.ac.belfastmet.biggestbuildings.controller;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.biggestbuildings.domain.ByFloorArea;
import uk.ac.belfastmet.biggestbuildings.domain.ByFootprint;
import uk.ac.belfastmet.biggestbuildings.domain.ByVolume;
import uk.ac.belfastmet.biggestbuildings.service.ByFloorAreaService;
import uk.ac.belfastmet.biggestbuildings.service.ByFootprintService;
import uk.ac.belfastmet.biggestbuildings.service.ByVolumeService;
		@Controller
		@RequestMapping
	public class SimpleController {
		@GetMapping("/footprint")
		public String footprint(Model model) {
		ByFootprintService footprintServe = new ByFootprintService();
		ArrayList<ByFootprint> footprints= footprintServe.buildingsbyfootprint();
		model.addAttribute("footprints", footprints);
		model.addAttribute("pageTitle", "The Biggest Building By Footprint");
		model.addAttribute("LocationFrame", footprints); 
		return "footprint.html";}
		
		@GetMapping("/floorarea")
		public String floorarea(Model model) {
		ByFloorAreaService floorareaServe = new ByFloorAreaService();
		ArrayList<ByFloorArea> floorareas = floorareaServe.buildingsByFloorArea();
		model.addAttribute("floorareas", floorareas);
		model.addAttribute("pageTitle", "The Biggest Building By Floor Area");
		model.addAttribute("LocationFrame", floorareas); 
		return "floorarea.html";}
		
		@GetMapping("/volume")
		public String volume(Model model) {
		ByVolumeService volumeServe = new ByVolumeService();
		ArrayList<ByVolume> volumes= volumeServe.buildingsbyvolume();
		model.addAttribute("volumes", volumes);
		model.addAttribute("pageTitle", "The Biggest Building By Volume");
		model.addAttribute("LocationFrame", volumes); 
		return "volume.html";}
	
		@GetMapping("/")
		public String home(Model model) {
			model.addAttribute("pageTitle", "Find out the biggest Buildings!");
			return "index.html";}
		}
		
	