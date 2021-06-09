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

import com.projetBMDrive.Services.CasierService;
import com.projetBMDrive.entities.TCasier;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("casier")
public class CasierRestController {
	
			
			@Autowired
			CasierService casierService;
			
			@PostMapping("/casMap")
			public void add(@RequestBody TCasier cas) {

				casierService.add(cas);
			}

			@GetMapping("/casMap")
			public List<TCasier> findAll() {

				return casierService.findAll();
			}
			
			@GetMapping("/casMap/{casId}")
			public TCasier findById(@PathVariable BigDecimal casId) {
				return casierService.findById(casId);
			}

			@DeleteMapping("/casMap/{casId}")
			public void delete(@PathVariable BigDecimal casId, TCasier cas) {

				casierService.delete(cas);
			}

			@PutMapping("/casMap/{casId}")
			public void updateCasier(@RequestBody TCasier cas) {

				casierService.update(cas);
			}


}
