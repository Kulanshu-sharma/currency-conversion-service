package com.kulanshu.microservices.currencyconversionservice.beans;

public class CurrencyConversionBean {

	private int id;
	private String from;
	private String to;
	private int conversion;
	private int quantity;
	private int calculatedTotalAmount;
	private String port;
	
	public CurrencyConversionBean() {
		
	}
	
	public CurrencyConversionBean(int id, String from, String to, int conversion, int quantity,
			int calculatedTotalAmount) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversion = conversion;
		this.quantity = quantity;
		this.calculatedTotalAmount = calculatedTotalAmount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public int getConversion() {
		return conversion;
	}
	public void setConversion(int conversion) {
		this.conversion = conversion;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getCalculatedTotalAmount() {
		return calculatedTotalAmount;
	}
	public void setCalculatedTotalAmount(int calculatedTotalAmount) {
		this.calculatedTotalAmount = calculatedTotalAmount;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	
	
}
