package org.sid.springmvc.web;

import java.util.List;

import javax.validation.Valid;

import org.sid.springmvc.dao.PatientRepository;
import org.sid.springmvc.entites.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientRestController2 {
	@Autowired
	 private PatientRepository PatientRepository;
	
		@GetMapping("/listPatients")
		
		public List<Patient> list(){
			return PatientRepository.findAll();
		}
		@GetMapping("/patients/{id}")
		
		public Patient getOne(@PathVariable Long id){
			return PatientRepository.findById(id).get();
		}
}
