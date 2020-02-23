package com.taxappy.taxi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taxappy.taxi.model.Taxi;
import com.taxappy.taxi.repository.TaxiRepository;


@RestController
@RequestMapping("/")
public class TaxiController {
	@Autowired
	private TaxiRepository taxiRepository;
	
	// metodo para obtener todos los taxis
	@GetMapping("/taxi")
	public Iterable<Taxi> All() {
		return taxiRepository.findAll();
	}

	// metodo para obtener un taxi expecifico
	@GetMapping("/taxi/{placa}")
	public Taxi findByPlaca(@PathVariable final String placa) {
		return taxiRepository.findTaxiByPlaca(placa);

	}

	@PostMapping("/taxi")
	public Taxi save(@RequestBody Taxi taxi) {
		return taxiRepository.save(taxi);

	}

	@DeleteMapping("/taxi")
	public void delete(@RequestBody Taxi taxi) {
		taxiRepository.delete(taxi);
	}
}
