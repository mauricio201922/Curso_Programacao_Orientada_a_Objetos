package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkLevel;

public class Worker {
	
	private String name;
	private WorkLevel level;
	private Double baseSalary;
	
	private Departament departament;
	private List<HoursContract> contract = new ArrayList<>();
	
	public Worker(String name, WorkLevel level, Double baseSalary, Departament departament) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.departament = departament;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkLevel getLevel() {
		return level;
	}

	public void setLevel(WorkLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Departament getDepartament() {
		return departament;
	}

	public void setDepartament(Departament departament) {
		this.departament = departament;
	}

	public List<HoursContract> getContract() {
		return contract;
	}
	
	public void addContracts(HoursContract hoursContract) {
		contract.add(hoursContract);
	}
	
	public void removeContracts(HoursContract hoursContract) {
		contract.remove(hoursContract);
	}
	
	public double income(int year, int month) {
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		for (HoursContract c : contract) {
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH);
			if(c_year == year && c_month == month) {
				sum += c.totalValue();
			}
		}
		return sum;
	}

}
