package com.taxappy.taxi.repository;



import org.springframework.data.repository.CrudRepository;

import com.taxappy.taxi.model.Taxi;



public interface TaxiRepository extends CrudRepository<Taxi, Integer> {
	Taxi findTaxiByPlaca(String placa);
}
