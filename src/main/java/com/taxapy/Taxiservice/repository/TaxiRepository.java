package com.taxapy.Taxiservice.repository;



import org.springframework.data.repository.CrudRepository;

import com.taxapy.Taxiservice.model.Taxi;

public interface TaxiRepository extends CrudRepository<Taxi, Integer> {
	Taxi findTaxiByPlaca(String placa);
}
