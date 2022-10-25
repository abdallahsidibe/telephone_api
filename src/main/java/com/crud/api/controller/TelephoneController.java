package controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import models.Telephone;
import service.TelephoneService;

// @RestController : allows the class to be considered as a controller. The class can expose a resource
@RestController

@RequestMapping("/telephone")
@AllArgsConstructor

public class TelephoneController {

	private final TelephoneService telephoneService = null;

	@PostMapping("/create")
	public Telephone create(@RequestBody Telephone telephone) {
		return telephoneService.create(telephone);
	}

	@GetMapping("/read")
	public List<Telephone> read() {
		return telephoneService.read();
	}

	@PutMapping("/update/{id}")
	public Telephone update(@PathVariable Long id, @RequestBody Telephone telephone) {
		return telephoneService.update(id);
	}

	@DeleteMapping("/delete")
	public String delete(@PathVariable Long id) {
		return telephoneService.delete(id);
	}

}
