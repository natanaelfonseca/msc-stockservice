package br.com.treinamento.booksws.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book {

	@Id
	@GeneratedValue
	private Long id;
	private String title;
	private String language;

	@ManyToOne
	private Author author;

	//Contrutores gerados pelo Lombock
	//Gets e Sets gerados pelo lombock
	
}