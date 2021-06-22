package com.vp.model;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "ipo_planned")
public class ClientIpoPlanned {
	
	@Id
	private String id;
	private String company_name;
	private  String stock_exchange;
	private  String price_per_share;
	private  String total_number_of_shares;

	private LocalDate open_date_time;
	private String remarks;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getStock_exchange() {
		return stock_exchange;
	}
	public void setStock_exchange(String stock_exchange) {
		this.stock_exchange = stock_exchange;
	}
	public String getPrice_per_share() {
		return price_per_share;
	}
	public void setPrice_per_share(String price_per_share) {
		this.price_per_share = price_per_share;
	}
	public String getTotal_number_of_shares() {
		return total_number_of_shares;
	}
	public void setTotal_number_of_shares(String total_number_of_shares) {
		this.total_number_of_shares = total_number_of_shares;
	}
	public LocalDate getOpen_date_time() {
		return open_date_time;
	}
	public void setOpen_date_time(LocalDate open_date_time) {
		this.open_date_time = open_date_time;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	@Override
	public String toString() {
		return "ClientIpoPlanned [id=" + id + ", company_name=" + company_name + ", stock_exchange=" + stock_exchange
				+ ", price_per_share=" + price_per_share + ", total_number_of_shares=" + total_number_of_shares
				+ ", open_datetime=" + open_date_time + ", remarks=" + remarks + "]";
	}
	public ClientIpoPlanned(String id, String company_name, String stock_exchange, String price_per_share,
			String total_number_of_shares, Date open_datetime, String remarks) {
		super();
		this.id = id;
		this.company_name = company_name;
		this.stock_exchange = stock_exchange;
		this.price_per_share = price_per_share;
		this.total_number_of_shares = total_number_of_shares;
		this.open_date_time = open_date_time;
		this.remarks = remarks;
	}
	public ClientIpoPlanned() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
