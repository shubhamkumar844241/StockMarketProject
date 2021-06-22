package com.vp.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;


import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.vp.model.StockPriceDetail;
import com.vp.service.StockPriceDetailService;
import com.vp.model.Summary;
@RestController
@CrossOrigin(origins="http://localhost:4200", maxAge=3600)
public class StockPriceDetailController {
	
	@Autowired
	StockPriceDetailService stockService;
	@Autowired
	Summary summary;
	
	Summary sum;
	 private LocalDate toDate;
	 private LocalDate fromDate;
	 private int noOfRecord;
	 private String stockExchange;
	 
	
	@PostMapping("/import")
	public Summary mapReapExcelDatatoDB(@RequestParam("file") MultipartFile reapExcelDataFile) throws IOException {

	    List<StockPriceDetail> tempStockData = new ArrayList<StockPriceDetail>();
	    XSSFWorkbook workbook = new XSSFWorkbook(reapExcelDataFile.getInputStream());
	    XSSFSheet worksheet = workbook.getSheetAt(0);

	    for(int i=1;i<worksheet.getPhysicalNumberOfRows() ;i++) {
	    	StockPriceDetail stockData = new StockPriceDetail();

	        XSSFRow row = worksheet.getRow(i);

	        //stockData.setSid((long) row.getCell(0).getNumericCellValue());
	        String stockExchangeCode = row != null ? row.getCell(0).getStringCellValue() : null;
	        if(null == stockExchangeCode || stockExchangeCode.isEmpty())
	        	break;
	        
			stockData.setCompany_code(stockExchangeCode);
	        stockData.setStock_exchange(row.getCell(1).getStringCellValue());
	        stockData.setCurrent_price(row.getCell(2).getNumericCellValue());
	        
	        LocalDate localDate = row.getCell(3).getDateCellValue().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	        stockData.setDate(localDate);
	        
	        String tim = row.getCell(4).getStringCellValue();	                	       
	        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
	        LocalTime time = LocalTime.parse(tim.trim());	        
	        stockData.setTime(time);
	        
	        System.out.println("STOCK DATA : "+stockData);
	        
	        tempStockData.add(stockData);   
	        
	        stockService.saveStock(stockData);
	        System.out.println("Done StockData Saved !!!!!!!!!!!!!!");
		    if(i==1)
	        {
	        	fromDate=localDate;
	        }
	        else
	        {
	        	toDate=localDate;
	        }
	        
	        noOfRecord=i;
	        
	        stockExchange=row.getCell(1).getStringCellValue();
	        
	        
	    }
	    
	    Summary summary = new Summary();
	    summary.setToDate(toDate);
	    summary.setFromDate(fromDate);
	    summary.setNoOfRecord(noOfRecord);
	    summary.setStockExchange(stockExchange);
	   // summary1(summary);
	   sum=summary;
	    return summary;
	    
	    
	    }
	
	@GetMapping("/summary")
	public  Summary summary1()
	{
		return sum;
		
	}
	@GetMapping("/stockData")
	public List<StockPriceDetail> getAllStockData(){
		return stockService.getAllStockData();
	}
}