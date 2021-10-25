package com.dentalservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dentalservice.model.Dentist;
import com.dentalservice.repositiry.DentistRepository;

@Service
public class DentistService {
	
	@Autowired
	private DentistRepository repository;
	
	/*
	 * public Dentist saveDentist(Dentist dentists) {
	 * 
	 * Dentist dentist = new Dentist(); dentist.setId(dentist.getId());
	 * dentist.setName(dentist.getName()); dentist.setSurname(dentist.getSurname());
	 * dentist.setJmbg(dentist.getJmbg());
	 * dentist.setPhoneNumber(dentist.getPhoneNumber());
	 * 
	 * return dentistRepository.save(dentist);
	 * 
	 * }
	 */
	
	public Dentist saveDentist(Dentist dentist) {
        return repository.save(dentist);
    }
	
	public List<Dentist> getDentists() {
        return repository.findAll();
    }
	
	public List<Dentist> saveDentists(List<Dentist> dentists) {
        return repository.saveAll(dentists);
    }
   

    public Dentist getDentistById(Long id) {
        return repository.findById(id).orElse(null);
    }

  
    public String deleteDentist(Long id) {
        repository.deleteById(id);
        return "dentist removed !! " + id;
    }

    public Dentist updateDentist(Dentist dentist) {
    	Dentist existingDentist = repository.findById(dentist.getId()).orElse(null);
    	existingDentist.setName(dentist.getName());
    	existingDentist.setSurname(dentist.getSurname());
    	existingDentist.setJmbg(dentist.getJmbg());
    	existingDentist.setPhone(dentist.getPhone());
        return repository.save(existingDentist);
    }

}
