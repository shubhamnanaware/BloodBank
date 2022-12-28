package com.project.donar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.donar.model.Donar;
import com.project.donar.service.DonarService;

@RestController
@CrossOrigin(origins = "*")
public class DonarController {
	@Autowired
	private DonarService donarService;
	@PostMapping("/donar/register")
	private Donar registerDonar(@RequestBody Donar donar) {
		return donarService.saveDonar(donar);	 
	}
	@GetMapping("/donar/donars")
	private List<Donar> getAllDonar(){
		return donarService.getAllDonar();
	}
	@PutMapping("/donar/updateDonar/{id}")
	private String updateDonar(@PathVariable int id,@RequestBody Donar donar) {
		return donarService.updateDonar(id, donar);
	}
	@DeleteMapping("/donar/delete/{id}")
	private String deleteById(@PathVariable int id,@RequestBody Donar donar) {
		return donarService.deleterDonar(id, donar);
	}
		@GetMapping("/donar/byaddress/{address}")
		public List<Donar> getByaddress(@PathVariable("address") String address){
			return donarService.getByaddress(address);
		}
		@GetMapping("/donar/bybloodGroup/{bloodGroup}")
		public List<Donar> getbybloodGroup(@PathVariable("bloodGroup") String bloodGroup){
			return donarService.getBybloodGroup(bloodGroup);
		}
		
		@PostMapping("/donar/byaddressandbloodgroup")
		public List<Donar> getByAddressandBloodGroup(@RequestBody Donar donar){
			return donarService.getByAddressandBloodGroup(donar);
		}
}
