package br.com.treinamento.booksws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.treinamento.booksws.model.Book;
import br.com.treinamento.booksws.repository.BooksRepository;

@RestController
@RequestMapping("/api/v1/books")
public class BooksController {

	@Value("${msc1.title}")
	private String testProperty;

	@Autowired
	private BooksRepository booksRepository;

	@GetMapping
	public List<Book> list() {
		return booksRepository.findAll();
	}

	@GetMapping("/{id}")
	public Book get(@PathVariable("id") long id) {
		return booksRepository.getOne(id);
	}

	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void create(@RequestBody Book book) {
		booksRepository.save(book);
	}

	/**
	 * Criei esse path apenas para testar se as configuracoes estao sendo pegas do
	 * config server
	 * 
	 * @return
	 */
	@GetMapping("/configs")
	public String test() {
		StringBuilder builder = new StringBuilder();
		builder.append("msc1.title - ").append(testProperty).append(" ");
		return builder.toString();
	}

}