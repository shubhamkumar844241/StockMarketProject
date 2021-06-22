package com.vp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
@Entity
@Table(name="company_details")
public class CompanyDetails {
	@Id
	private String company_name;
	private String turn_over;
	private String ceo;
	private String board_of_directors;
	private String listed_in_stock_exchanges;
	private String sector;
	private String brief_about_companies;
	private String stock_code_in_each_stock_exchange;
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getTurn_over() {
		return turn_over;
	}
	public void setTurn_over(String turn_over) {
		this.turn_over = turn_over;
	}
	public String getCeo() {
		return ceo;
	}
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}
	public String getBoard_of_directors() {
		return board_of_directors;
	}
	public void setBoard_of_directors(String board_of_directors) {
		this.board_of_directors = board_of_directors;
	}
	public String getListed_in_stock_exchanges() {
		return listed_in_stock_exchanges;
	}
	public void setListed_in_stock_exchanges(String listed_in_stock_exchanges) {
		this.listed_in_stock_exchanges = listed_in_stock_exchanges;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public String getBrief_about_companies() {
		return brief_about_companies;
	}
	public void setBrief_about_companies(String brief_about_companies) {
		this.brief_about_companies = brief_about_companies;
	}
	public String getStock_code_in_each_stock_exchange() {
		return stock_code_in_each_stock_exchange;
	}
	public void setStock_code_in_each_stock_exchange(String stock_code_in_each_stock_exchange) {
		this.stock_code_in_each_stock_exchange = stock_code_in_each_stock_exchange;
	}
	
	
}
