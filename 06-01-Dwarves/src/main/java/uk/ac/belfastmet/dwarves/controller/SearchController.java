package uk.ac.belfastmet.dwarves.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import uk.ac.belfastmet.dwarves.repository.DwarfRepository;
@Controller
	@RequestMapping("")
public class SearchController {
	DwarfRepository dwarfRepository;
	public SearchController(DwarfRepository dwarfRepository) {
		super();
		this.dwarfRepository = dwarfRepository;
	}
	
	@PostMapping("/searchid")
	public String searchId(@RequestParam("id") Integer dwarfId, Model model)
	{
		model.addAttribute("disneyDwarfs", this.dwarfRepository.findByDwarfId(dwarfId));
		model.addAttribute("pageTitle","Search!");
		return "dwarfPage";}
	

@PostMapping("/searchname")
public String searchName(@RequestParam("name") String name, Model model)
{
	model.addAttribute("disneyDwarfs", this.dwarfRepository.findByName(name));
	model.addAttribute("pageTitle","Search!");
	return "dwarfPage";}

@PostMapping("/searchauthor")
public String searchAuthor(@RequestParam("author") String author, Model model)
{
	model.addAttribute("disneyDwarfs", this.dwarfRepository.findByAuthor(author));
	model.addAttribute("pageTitle","Search!");
	return "dwarfPage";}
@PostMapping("/searchnameauthor")
public String searchNameAuthor(@RequestParam("name") String name, @RequestParam("author") String author, Model model)
{
	model.addAttribute("disneyDwarfs", this.dwarfRepository.findByNameAndAuthor(name, author));
	model.addAttribute("pageTitle","Search!");
	return "dwarfPage";}
}