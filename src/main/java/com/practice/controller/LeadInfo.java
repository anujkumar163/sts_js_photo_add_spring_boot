package com.practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.practice.entity.Leads;
import com.practice.service.LeadService;

@Controller
public class LeadInfo {
	
	@Autowired
	private LeadService leadService;
	
	@RequestMapping("/lead")
	public String lead() {	
		return "lead_input";
	}
	
	@RequestMapping("/saveLeads")
	public String saveLeadsInfo(@ModelAttribute("Ioc") Leads leads, ModelMap model) {
		System.out.println(leads.getId());
		System.out.println(leads.getName());
		System.out.println(leads.getCity());
		System.out.println(leads.getRole());
		leadService.saveLeads(leads);
		model.addAttribute("msg","save leads");
		return "lead_input";
	}
	
	@RequestMapping("/showLeads")
	public String showLeads(ModelMap model) {
		List<Leads> leads = leadService.showLeadsInfo();
		model.addAttribute("leads",leads);
		return "lead_info";
	}
	
	@RequestMapping("/delete")
	public String deleteLeads(@RequestParam("id") long id, ModelMap model) {
		System.out.println(id);
		leadService.deleteById(id);
		List<Leads> leads = leadService.showLeadsInfo();
		model.addAttribute("leads",leads);
		return "lead_info";
	}
	
	@RequestMapping("/update")
	public String updateLeads(@RequestParam("id") long id, ModelMap model) {
		Leads leads = leadService.updateLeadsById(id);
		model.addAttribute("leads", leads);
		return "update_form";
	}
	
	//updating data into form 
	@RequestMapping("/updateData")
	public String updateLeadsData(@ModelAttribute("Ioc") Leads leads, ModelMap model) {
		System.out.println(leads.getId());
		System.out.println(leads.getName());
		System.out.println(leads.getCity());
		System.out.println(leads.getRole());
		model.addAttribute("leads","leads updated");
		leadService.saveLeads(leads);
		return "update_form";
	}
	
	
	
	
	
	
	
	
	
}
