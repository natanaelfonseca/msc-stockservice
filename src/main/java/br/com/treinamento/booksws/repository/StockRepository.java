package br.com.treinamento.booksws.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.treinamento.booksws.model.Stock;

public interface StockRepository extends JpaRepository<Stock, Long>{
}
