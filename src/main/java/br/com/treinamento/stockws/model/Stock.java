package br.com.treinamento.stockws.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuppressWarnings("unused")
public class Stock {

	@Id
	@GeneratedValue
	private Long id;
	private Long quantity;
	private String region;
	
	//Contrutores gerados pelo Lombock
	//Gets e Sets gerados pelo lombock
	
}