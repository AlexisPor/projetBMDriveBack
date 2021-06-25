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

import com.projetBMDrive.entities.BmdAgentbm;
import com.projetBMDrive.services.AgentBMServiceImpl;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("agentBM")
public class AgentBMRestController {

	@Autowired
	private AgentBMServiceImpl agentBMService;

	/**
	 * Ajout d'un agent.
	 * @param abm
	 */
	@PostMapping("/agMap")
	public void add(@RequestBody BmdAgentbm abm) {

		agentBMService.add(abm);

	}

	/**
	 * Afficher la liste des agents.
	 * @return
	 */
	@GetMapping("/agMap")
	public List<BmdAgentbm> findAll() {

		return agentBMService.findAll();
	}

	/**
	 * Chercher un agent par son id.
	 * @param abmId
	 * @return
	 */
	@GetMapping("/agMap/{abmId}")
	public BmdAgentbm findById(@PathVariable BigDecimal abmId) {
		System.err.println(abmId);
		return agentBMService.findById(abmId);
	}

	/**
	 * Supprimer un agent.	 
	 * @param abmId
	 * @param abm
	 */
	@DeleteMapping("/agMap/{abmId}")
	public void delete(@PathVariable BigDecimal abmId, BmdAgentbm abm) {
		agentBMService.delete(abm);
	}

	/**
	 * Modifier les infos d'un agent.
	 * @param abm
	 */
	@PutMapping("/agMap")
	public void updateAgentBM(@RequestBody BmdAgentbm abm) {

		agentBMService.update(abm);
		
	}

}
