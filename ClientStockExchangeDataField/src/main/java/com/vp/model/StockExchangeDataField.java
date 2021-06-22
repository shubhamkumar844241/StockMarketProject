package com.vp.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stock_exchange_datafield")
public class StockExchangeDataField {
	
	@Id
	private String id;
	private String stock_exchange;
	private String company_name;
	private String  sector;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStock_exchange() {
		return stock_exchange;
	}
	public void setStock_exchange(String stock_exchange) {
		this.stock_exchange = stock_exchange;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	@Override
	public String toString() {
		return "StockExchangeDataField [id=" + id + ", stock_exchange=" + stock_exchange + ", company_name="
				+ company_name + ", sector=" + sector + "]";
	}
	public StockExchangeDataField(String id, String stock_exchange, String company_name, String sector) {
		super();
		this.id = id;
		this.stock_exchange = stock_exchange;
		this.company_name = company_name;
		this.sector = sector;
	}
	public StockExchangeDataField() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
