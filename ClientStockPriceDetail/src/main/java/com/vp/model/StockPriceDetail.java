package com.vp.model;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stock_price_detail")
public class StockPriceDetail{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sid;
    private String company_code;
    private String stock_exchange;
    private double current_price;
    private LocalDate date;
    private LocalTime time;
	public Long getSid() {
		return sid;
	}
	public void setSid(Long sid) {
		this.sid = sid;
	}
	public String getCompany_code() {
		return company_code;
	}
	public void setCompany_code(String company_code) {
		this.company_code = company_code;
	}
	public String getStock_exchange() {
		return stock_exchange;
	}
	public void setStock_exchange(String stock_exchange) {
		this.stock_exchange = stock_exchange;
	}
	public double getCurrent_price() {
		return current_price;
	}
	public void setCurrent_price(double current_price) {
		this.current_price = current_price;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public LocalTime getTime() {
		return time;
	}
	public void setTime(LocalTime time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "StockPriceDetail [sid=" + sid + ", company_code=" + company_code + ", stock_exchange=" + stock_exchange
				+ ", current_price=" + current_price + ", date=" + date + ", time=" + time + "]";
	}
	public StockPriceDetail(Long sid, String company_code, String stock_exchange, double current_price, LocalDate date,
			LocalTime time) {
		super();
		this.sid = sid;
		this.company_code = company_code;
		this.stock_exchange = stock_exchange;
		this.current_price = current_price;
		this.date = date;
		this.time = time;
	}
	public StockPriceDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	
    
}