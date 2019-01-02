package br.com.treinamento.stockws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.treinamento.stockws.model.Stock;
import br.com.treinamento.stockws.repository.StockRepository;

@RestController
@RequestMapping("/v1/stocks")
public class StockController {

	@Autowired
	private StockRepository stockRepository;

	@GetMapping
	public List<Stock> list() {
		return stockRepository.findAll();
	}

	@GetMapping("/{id}")
	public Stock get(@PathVariable("id") long id) {
		return stockRepository.getOne(id);
	}

	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void create(@RequestBody Stock stock) {
		stockRepository.save(stock);
	}

}