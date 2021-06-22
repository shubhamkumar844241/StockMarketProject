package com.vp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vp.model.StockExchangeDataField;
import com.vp.service.StockExchangeDataFieldService;

@RestController
@CrossOrigin(origins ="http://localhost:4200",maxAge = 3600)
public class StockExchangeDataFieldController {
	
	@Autowired
	StockExchangeDataFieldService stockExchangeDataFieldService;
	
	@GetMapping("/stockExchangeDataFields")
	public List<StockExchangeDataField> getStockExchangeDataField(){
		return stockExchangeDataFieldService.getAllStockExchangeDataField();
	}
	
	@PostMapping("/stockExchangeDataField")
	public void insertStockExchangeDataField(@RequestBody StockExchangeDataField stockExchangeDataField) {
		stockExchangeDataFieldService.saveStockExchangeDataField(stockExchangeDataField);
	}
	
}