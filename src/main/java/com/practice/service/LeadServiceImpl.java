package com.practice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.entity.Leads;
import com.practice.repository.LeadRepository;

@Service
public class LeadServiceImpl implements LeadService {
	
	@Autowired
	private LeadRepository leadRepository;

	@Override
	public void saveLeads(Leads leads) {
		// TODO Auto-generated method stub
		leadRepository.save(leads);
		
	}

	@Override
	public List<Leads> showLeadsInfo() {
		// TODO Auto-generated method stub
		List<Leads> leads = leadRepository.findAll();
		return leads;
	}

	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		leadRepository.deleteById(id);
	}

	@Override
	public Leads updateLeadsById(long id) {
		// TODO Auto-generated method stub
		Optional<Leads> findById = leadRepository.findById(id);
		Leads leads = findById.get();
		return leads;
	}

	

	
	
	
	
	
}
