package com.practice.service;

import java.util.List;

import com.practice.entity.Leads;

public interface LeadService {
	public void saveLeads(Leads leads);

	public List<Leads> showLeadsInfo();

	

	public void deleteById(long id);

	public Leads updateLeadsById(long id);

	
}