package com.projetBMDrive.controllers;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetBMDrive.entities.TSupportmedia;
import com.projetBMDrive.services.SupportmediaServiceImpl;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/sm")
public class SupportmediaController {

	@Autowired
	SupportmediaServiceImpl supmedService;
	
	@GetMapping("/smMap") 
	public List<TSupportmedia> findAllSuppermedia()
	{
		return supmedService.findAllSupportmedia();
	}
	
	@GetMapping("/smMap/{supId}") 
	public TSupportmedia findSuppermediaById(@PathVariable("supId") BigDecimal supId, TSupportmedia supmedia)
	{
		return supmedService.findSupportmediaById(supId);
	}
	
	@PostMapping("/smMap")
	public void addSuppermedia(@RequestBody TSupportmedia supmedia) 
	{
		supmedService.addSupportmedia(supmedia);
	}
	
	@PutMapping("/smMap/{supId}")
	public void updateSuppermedia(@RequestBody TSupportmedia supmedia)
	{
		 supmedService.updateSupportmedia(supmedia);
	}
	
	@DeleteMapping("/smMap/{supId}")
	public void deleteSuppermedia(@PathVariable("supId") BigDecimal supId, TSupportmedia supmedia) 
	{
		supmedService.deleteSupportmedia(supmedia);
	}
}
