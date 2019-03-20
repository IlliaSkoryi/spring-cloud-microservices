package com.practice.microservices.currencyexchangeservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "exchange_value")
public class ExchangeValue {

	@Id
	private long id;

	@Column(name = "currency_from")
	private String from;

	@Column(name = "currency_to")
	private String to;

	private BigDecimal conversionMultiple;
	private String port;

	public ExchangeValue() {
	}

	public ExchangeValue(long id, String from, String to, BigDecimal conversionMultiple) {
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
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

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		ExchangeValue that = (ExchangeValue) o;
		return id == that.id &&
				Objects.equals(from, that.from) &&
				Objects.equals(to, that.to) &&
				Objects.equals(conversionMultiple, that.conversionMultiple) &&
				Objects.equals(port, that.port);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, from, to, conversionMultiple, port);
	}

	@Override
	public String toString() {
		return "ExchangeValue{" +
				"id=" + id +
				", from='" + from + '\'' +
				", to='" + to + '\'' +
				", conversionMultiple=" + conversionMultiple +
				", port='" + port + '\'' +
				'}';
	}
}
