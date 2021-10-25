package com.dentalservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dentalservice.model.Dentist;
import com.dentalservice.service.DentistService;

@RestController
public class DentistController {

	@Autowired
	private DentistService service;
	


	@PostMapping(value = "/addDentist")
	public Dentist addDentist(@RequestBody Dentist dentist) {
		return service.saveDentist(dentist);
	}
	

	 @GetMapping("/dentists")
	 public List<Dentist> findAllDentists() {
	      return service.getDentists();
	    }
	 
	 @PostMapping("/addDentists")
	    public List<Dentist> addDentists(@RequestBody List<Dentist> dentists) {
	        return service.saveDentists(dentists);
	    }
	    

	    @GetMapping("/dentistById/{id}")
	    public Dentist findProductById(@PathVariable Long id) {
	        return service.getDentistById(id);
	    }

	    

	    @PutMapping("/dentistUpdate")
	    public Dentist updateDentist(@RequestBody Dentist dentist) {
	        return service.updateDentist(dentist);
	    }

	    @DeleteMapping("/dentistDelete/{id}")
	    public String deleteDentist(@PathVariable Long id) {
	        return service.deleteDentist(id);
	    }
	 
	

}
