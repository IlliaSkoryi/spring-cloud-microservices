package com.practice.microservices.currencyconversionservice.model;

import java.math.BigDecimal;
import java.util.Objects;

public class CurrencyConversionModel {

	private long id;
	private String from;
	private String to;
	private BigDecimal conversionMultiple;
	private BigDecimal quantity;
	private BigDecimal totalCalculatedAmount;
	private int port;

	public CurrencyConversionModel() {
	}

	public CurrencyConversionModel(long id, String from, String to, BigDecimal conversionMultiple,
								   BigDecimal quantity, BigDecimal totalCalculatedAmount, int port) {
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
		this.quantity = quantity;
		this.totalCalculatedAmount = totalCalculatedAmount;
		this.port = port;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}

	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getTotalCalculatedAmount() {
		return totalCalculatedAmount;
	}

	public void setTotalCalculatedAmount(BigDecimal totalCalculatedAmount) {
		this.totalCalculatedAmount = totalCalculatedAmount;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		CurrencyConversionModel that = (CurrencyConversionModel) o;
		return id == that.id &&
				port == that.port &&
				Objects.equals(from, that.from) &&
				Objects.equals(to, that.to) &&
				Objects.equals(conversionMultiple, that.conversionMultiple) &&
				Objects.equals(quantity, that.quantity) &&
				Objects.equals(totalCalculatedAmount, that.totalCalculatedAmount);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, from, to, conversionMultiple, quantity, totalCalculatedAmount, port);
	}

	@Override
	public String toString() {
		return "CurrencyConversionModel{" +
				"id=" + id +
				", from='" + from + '\'' +
				", to='" + to + '\'' +
				", conversionMultiple=" + conversionMultiple +
				", quantity=" + quantity +
				", totalCalculatedAmount=" + totalCalculatedAmount +
				", port=" + port +
				'}';
	}
}
