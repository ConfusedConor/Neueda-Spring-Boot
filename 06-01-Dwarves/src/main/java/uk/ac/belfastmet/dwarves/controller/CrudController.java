package uk.ac.belfastmet.dwarves.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.dwarves.repository.DwarfRepository;

@Controller
@RequestMapping("")
public class CrudController {
	DwarfRepository dwarfRepository;
	//Contructor
	public CrudController(DwarfRepository dwarfRepository) {
		super();
		this.dwarfRepository = dwarfRepository;
	}
	@GetMapping("/view/{dwarfId}")
	public String viewDwarf(@PathVariable("dwarfId") Integer dwarfId, Model model)
	{
		model.addAttribute("dwarf", this.dwarfRepository.findByDwarfId(dwarfId));
		model.addAttribute("pageTitle","Viewing Dwarfs");
		return "viewDwarf";}
}
