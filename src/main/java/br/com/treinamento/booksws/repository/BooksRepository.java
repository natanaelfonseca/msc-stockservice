package br.com.treinamento.booksws.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.treinamento.booksws.model.Book;

public interface BooksRepository extends JpaRepository<Book, Long>{
}
