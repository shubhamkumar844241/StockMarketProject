package com.vp.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component
public class Summary {
	
	
	private LocalDate toDate;
	 private LocalDate fromDate;
	 private int noOfRecord;
	 private String stockExchange;
	 
	
	public LocalDate getToDate() {
		return toDate;
	}
	public void setToDate(LocalDate toDate) {
		this.toDate = toDate;
	}
	public LocalDate getFromDate() {
		return fromDate;
	}
	public void setFromDate(LocalDate fromDate) {
		this.fromDate = fromDate;
	}
	public int getNoOfRecord() {
		return noOfRecord;
	}
	public void setNoOfRecord(int noOfRecord) {
		this.noOfRecord = noOfRecord;
	}
	public String getStockExchange() {
		return stockExchange;
	}
	public void setStockExchange(String stockExchange) {
		this.stockExchange = stockExchange;
	}
	@Override
	public String toString() {
		return "Summary [toDate=" + toDate + ", fromDate=" + fromDate + ", noOfRecord=" + noOfRecord
				+ ", stockExchange=" + stockExchange + "]";
	}
	public Summary(LocalDate toDate, LocalDate fromDate, int noOfRecord, String stockExchange) {
		super();
		this.toDate = toDate;
		this.fromDate = fromDate;
		this.noOfRecord = noOfRecord;
		this.stockExchange = stockExchange;
	}
	public Summary() {
		super();
		// TODO Auto-generated constructor stub
	}

	 
	 
}
