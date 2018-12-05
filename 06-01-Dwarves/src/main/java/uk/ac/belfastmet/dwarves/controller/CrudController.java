package uk.ac.belfastmet.dwarves.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	
	//View an individual dwarf
	@GetMapping("/view/{dwarfId}")
	public String viewDwarf(@PathVariable("dwarfId") Integer dwarfId, Model model)
	{
		model.addAttribute("dwarf", this.dwarfRepository.findByDwarfId(dwarfId));
		model.addAttribute("pageTitle","Viewing Dwarfs");
		return "viewDwarf";}
	
	//Delete Function
	@GetMapping("/delete/{dwarfId}")
	public String deleteDwarf(@PathVariable("dwarfId") Integer dwarfId, Model model, RedirectAttributes redirectattributes)
	{this.dwarfRepository.deleteById(dwarfId);
	redirectattributes.addFlashAttribute("message", "Dwarf has been Thanos Clicked");
	return "redirect:/all";
	}
	
	//To be done at later date.
	@GetMapping("/edit/{dwarfId}")
	
	public String editDwarf(@PathVariable("dwarfId") Integer dwarfId, Model model)
	{
		model.addAttribute("dwarf", this.dwarfRepository.findByDwarfId(dwarfId));
		model.addAttribute("pageTitle","Viewing Dwarfs");
		return "viewDwarf";}
	
	//Pay no attention to this...
	@GetMapping("/click")
	public String click(Integer dwarfId, Model model, RedirectAttributes redirectattributes)
	{this.dwarfRepository.deleteById(4);
	this.dwarfRepository.deleteById(2);
	this.dwarfRepository.deleteById(7);
	this.dwarfRepository.deleteById(8);
	this.dwarfRepository.deleteById(9);
	this.dwarfRepository.deleteById(10);
	this.dwarfRepository.deleteById(14);
	this.dwarfRepository.deleteById(16);
	this.dwarfRepository.deleteById(17);
	redirectattributes.addFlashAttribute("message", "Half the Dwarfs no longer exist.");
	return "redirect:/all";
	}
}
