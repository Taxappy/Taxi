package com.taxappy.taxi.model;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@Entity
@Table(name="Taxi")
public class Taxi {
	
	@Id
	private String placa;
	
	

}
