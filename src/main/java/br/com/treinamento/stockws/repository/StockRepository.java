package br.com.treinamento.stockws.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.treinamento.stockws.model.Stock;

public interface StockRepository extends JpaRepository<Stock, Long>{
}
