package br.com.treinamento.booksws.model;

public class Book {
	
	private Long id;
	private String title;
	private String language;
	
	public Book() {

	}
	
	public Book(Long id, String title, String language) {
		super();
		this.id = id;
		this.title = title;
		this.language = language;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}

	
	
	
}