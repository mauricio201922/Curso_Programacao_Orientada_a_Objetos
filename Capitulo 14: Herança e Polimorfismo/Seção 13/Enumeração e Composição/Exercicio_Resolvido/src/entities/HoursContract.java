package entities;

import java.util.Date;

public class HoursContract {
	
	private Date date;
	private Double valueHours;
	private Integer hours;
	
	public HoursContract() {
	}

	public HoursContract(Date date, Double valueHours, Integer hours) {
		this.date = date;
		this.valueHours = valueHours;
		this.hours = hours;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValueHours() {
		return valueHours;
	}

	public void setValueHours(Double valueHours) {
		this.valueHours = valueHours;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
	public double totalValue() {
		return valueHours * hours;
	}

}
