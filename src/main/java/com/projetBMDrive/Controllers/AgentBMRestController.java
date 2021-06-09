package com.projetBMDrive.Controllers;

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

import com.projetBMDrive.Services.AgentBMServiceImpl;
import com.projetBMDrive.entities.TAgentbm;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("agentBM")
public class AgentBMRestController {

	@Autowired
	AgentBMServiceImpl agentBMService;

	@PostMapping("/agMap")
	public void add(@RequestBody TAgentbm abm) {

		agentBMService.add(abm);

	}

	@GetMapping("/agMap")
	public List<TAgentbm> findAll() {

		return agentBMService.findAll();
	}

	@GetMapping("/agMap/{abmId}")
	public TAgentbm findById(@PathVariable BigDecimal abmId) {
		return agentBMService.findById(abmId);
	}

	@DeleteMapping("/agMap/{abmId}")
	public void delete(@PathVariable BigDecimal abmId, TAgentbm abm) {
		agentBMService.delete(abm);
	}

	@PutMapping("/agMap/{abmId}")
	public void updateAgentBM(@RequestBody TAgentbm abm) {

		agentBMService.update(abm);
		
	}

}
