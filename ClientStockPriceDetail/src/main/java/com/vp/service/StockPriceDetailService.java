package com.vp.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.vp.model.StockPriceDetail;
import com.vp.repository.StockPriceDetailRepository;

@Service
@Transactional
public class StockPriceDetailService {
	@Autowired
	StockPriceDetailRepository stockRepository;
	
	public void saveStock(StockPriceDetail stockData) {
		stockRepository.save(stockData);
	}
	
	public List<StockPriceDetail> getAllStockData(){
		return (List<StockPriceDetail>) stockRepository.findAll();
	}
	
}
