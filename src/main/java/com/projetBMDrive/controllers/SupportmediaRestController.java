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
public class SupportmediaRestController {

	@Autowired
	private SupportmediaServiceImpl supmedService;
	
	/**
	 * Afficher la liste des médias.
	 * @return
	 */
	@GetMapping("/smMap") 
	public List<TSupportmedia> findAllSuppermedia()
	{
		return supmedService.findAllSupportmedia();
	}
	
	/**
	 * Chercher un média par son id.
	 * @param supId
	 * @param supmedia
	 * @return
	 */
	@GetMapping("/smMap/{supId}") 
	public TSupportmedia findSuppermediaById(@PathVariable("supId") BigDecimal supId, TSupportmedia supmedia)
	{
		return supmedService.findSupportmediaById(supId);
	}
	
	/**
	 * Ajout d'un média.
	 * @param supmedia
	 */
	@PostMapping("/smMap")
	public void addSuppermedia(@RequestBody TSupportmedia supmedia) 
	{
		supmedService.addSupportmedia(supmedia);
	}
	
	/**
	 * Modifier les infos d'un média.
	 * @param supmedia
	 */
	@PutMapping("/smMap/{supId}")
	public void updateSuppermedia(@RequestBody TSupportmedia supmedia)
	{
		 supmedService.updateSupportmedia(supmedia);
	}
	
	/**
	 * Supprimer un média.
	 * @param supId
	 * @param supmedia
	 */
	@DeleteMapping("/smMap/{supId}")
	public void deleteSuppermedia(@PathVariable("supId") BigDecimal supId, TSupportmedia supmedia) 
	{
		supmedService.deleteSupportmedia(supmedia);
	}
}
