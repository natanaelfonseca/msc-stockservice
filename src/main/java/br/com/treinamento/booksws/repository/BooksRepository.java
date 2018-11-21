package br.com.treinamento.booksws.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.treinamento.booksws.model.Book;

@Repository
public class BooksRepository {

	public List<Book> findAll() {
		
		Book[] fakeBooks = {
				 					 new Book(),
									 new Book()
									};
		
		return Arrays.asList( fakeBooks );
	}

	public Book getOne(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void save(Book bike) {
		// TODO Auto-generated method stub
		
	}

}
