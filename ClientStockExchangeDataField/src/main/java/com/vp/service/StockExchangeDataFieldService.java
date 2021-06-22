package com.vp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vp.model.StockExchangeDataField;
import com.vp.repository.StockExchangeDataFieldRepository;

@Service
@Transactional
public class StockExchangeDataFieldService {
    
	@Autowired
	StockExchangeDataFieldRepository stockExchangeDataFieldRepository;
	
	public List<StockExchangeDataField> getAllStockExchangeDataField(){
		return (List<StockExchangeDataField>) stockExchangeDataFieldRepository.findAll();
	}
	
	public void saveStockExchangeDataField(StockExchangeDataField stockExchangeDataField) {
		stockExchangeDataFieldRepository.save(stockExchangeDataField);
	}
	
}
